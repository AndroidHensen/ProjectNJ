package com.handsome.module_engine.U;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import me.iwf.photopicker.PhotoPicker;
import top.zibin.luban.Luban;
import top.zibin.luban.OnCompressListener;

import static android.app.Activity.RESULT_OK;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/12/5.
 */

public class CameraUtils {

    private static final int REQUEST_IMAGE_CAPTURE = 0x215;
    private String mPhotoPath;
    private Context mContext;

    public CameraUtils(Context context) {
        mContext = context;
    }

    public String startPhotoCapture() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //判断是否有相机应用
        if (takePictureIntent.resolveActivity(mContext.getPackageManager()) != null) {
            File photoFile = null;
            try {
                //创建临时图片文件
                photoFile = createImageFile();
                mPhotoPath = photoFile.getAbsolutePath();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            if (photoFile != null) {
                //FileProvider使用 content:// Uri 代替了 file:// Uri
                Uri photoURI;
                if (Build.VERSION.SDK_INT >= 24) {
                    photoURI = FileProvider.getUriForFile(mContext, "com.handsome.fastcamera", photoFile);
                } else {
                    photoURI = Uri.fromFile(photoFile);
                }
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                ((Activity) mContext).startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
            }
            return photoFile.getAbsolutePath();
        }
        return "";
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data, final OnCameraCompressListener listener) {

        if (listener == null) {
            return;
        }

        listener.onCameraResult(mPhotoPath);

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {

            Luban.with(mContext)
                    .load(new File(mPhotoPath))
                    .setTargetDir(new File(mPhotoPath).getParentFile().getAbsolutePath())
                    .setCompressListener(new OnCompressListener() {
                        @Override
                        public void onStart() {
                            listener.onCompressStart();
                        }

                        @Override
                        public void onSuccess(File file) {
                            listener.onCompressSuccess(file.getAbsolutePath());
                        }

                        @Override
                        public void onError(Throwable e) {
                            listener.onCompressError(e.getMessage());
                        }
                    }).launch();

        }
    }

    private File createImageFile() throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        // SDCard/Android/data/你的应用的包名/files/ 目录
        File storageDir = mContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        //创建临时文件,文件前缀不能少于三个字符,后缀如果为空默认未".tmp"
        File image = File.createTempFile(
                imageFileName,  /* 前缀 */
                ".jpg",         /* 后缀 */
                storageDir      /* 文件夹 */
        );
        return image;
    }

    /**
     * 打开图片选择器
     */
    public void startPhotoPicker(Activity activity, int count) {
        PhotoPicker.builder()
                .setPhotoCount(count)
                .setShowCamera(false)
                .setShowGif(false)
                .setPreviewEnabled(false)
                .start(activity, PhotoPicker.REQUEST_CODE);
    }

    public interface OnCameraCompressListener extends OnCameraListener {
        void onCompressStart();

        void onCompressSuccess(String path);

        void onCompressError(String error);
    }

    public interface OnCameraListener {

        void onCameraResult(String path);
    }
}

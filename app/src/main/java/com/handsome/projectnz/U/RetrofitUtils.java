package com.handsome.projectnz.U;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/11/3.
 */
public class RetrofitUtils {

    private static final String ObjectUrl = "http://106.14.175.111/index.php/";
    private static Retrofit retrofit = null;
    private static IRetrofitServer iServer;

    public static IRetrofitServer getInstance() {
        if (retrofit == null) {
            synchronized (RetrofitUtils.class) {
                if (retrofit == null) {
                    retrofit = new Retrofit.Builder()
                            .baseUrl(ObjectUrl)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    iServer = retrofit.create(IRetrofitServer.class);
                }
            }
        }
        return iServer;
    }

    public static List<MultipartBody.Part> filesToMultipartBodyParts(String key, List<String> filePaths) {
        List<MultipartBody.Part> parts = new ArrayList<>(filePaths.size());
        for (String filePath : filePaths) {
            File file = new File(filePath);
            RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
            MultipartBody.Part part = MultipartBody.Part.createFormData(key, file.getName(), requestBody);
            parts.add(part);
        }
        return parts;
    }

    public static RequestBody convertToRequestBody(String param) {
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), param);
        return requestBody;
    }


    public interface IRetrofitServer {

    }
}

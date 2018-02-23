package com.handsome.projectnz.Controller;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.handsome.projectnz.Manager.InterfaceManger;
import com.handsome.projectnz.Module.Announcements;
import com.handsome.projectnz.Utils.RetrofitUtils;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2018/2/23.
 */

public class HomeController {

    /**
     * 显示公司公告
     */
    public static void show_notice_abstract(Map<String, RequestBody> map, List<MultipartBody.Part> parts, final InterfaceManger.OnRequestListener listener) {
        Call<ResponseBody> call = RetrofitUtils.getInstance().show_notice_abstract(map, parts);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (listener == null) {
                    return;
                }
                if (!response.isSuccessful() || response == null) {
                    listener.onError("服务器错误，error code:" + response.code());
                    return;
                }
                try {
                    String body = response.body().string().toString();
                    JSONObject jsonObject = new JSONObject(body);
                    Log.e("onResponse", body);

                    boolean status = jsonObject.getBoolean("status");
                    if (status) {
                        listener.onSuccess(new Gson().fromJson(body, Announcements.class));
                    } else {
                        listener.onError("获取失败:" + jsonObject.getString("content"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                listener.onComplete();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                if (listener == null) {
                    return;
                }
                Log.e("onFailure", t.toString());
                listener.onError(t.toString());
                listener.onComplete();
            }
        });
    }
}

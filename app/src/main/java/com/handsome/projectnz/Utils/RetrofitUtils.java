package com.handsome.projectnz.Utils;

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

    private static final String ObjectUrl = "http://106.14.175.111/index.php/api/";
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

    /**
     * 文件参数
     *
     * @param key
     * @param filePaths
     * @return
     */
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

    /**
     * 文本参数
     *
     * @param param
     * @return
     */
    public static RequestBody convertToRequestBody(String param) {
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), param);
        return requestBody;
    }

    /**
     * 接口
     */
    public interface IRetrofitServer {
        //显示公司公告
        @Multipart
        @POST("notice/show_notice_abstract")
        Call<ResponseBody> show_notice_abstract(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //显示所有项目物资
        @Multipart
        @POST("goods/showAll")
        Call<ResponseBody> showAll(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //新建入库
        @Multipart
        @POST("goods/createGoods")
        Call<ResponseBody> createGoods(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //新建入库1
        @Multipart
        @POST("goods/addGoods")
        Call<ResponseBody> addGoods(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //新建出库
        @Multipart
        @POST("goods/deleteGoods")
        Call<ResponseBody> deleteGoods(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //显示物资流水
        @Multipart
        @POST("goods/showAll")
        Call<ResponseBody> showList(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //获取入库记录
        @Multipart
        @POST("goods/recordIn")
        Call<ResponseBody> recordIn(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //获取出库记录
        @Multipart
        @POST("goods/recordOut")
        Call<ResponseBody> recordOut(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //将单位注册页面的数据存进数据表
        @Multipart
        @POST("register/unit_register")
        Call<ResponseBody> unit_register(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);

        //将个人注册页面的开户许可存进数据表
        @Multipart
        @POST("register/personal_register")
        Call<ResponseBody> personal_register(@PartMap Map<String, RequestBody> map, @Part List<MultipartBody.Part> parts);
    }
}

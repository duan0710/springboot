package com.duan.controller;

import com.duan.entity.User;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

public class UserControllerTest {

    @Test
    public void list(){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url("http://localhost:8080/user/list")
                .get()
                .build();
        try {
            Response response=client.newCall(request).execute();
            System.out.println(response.body().string());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void save(){
        OkHttpClient client=new OkHttpClient();
        User user=new User();
        user.setName("dwd");
        user.setAge(10);
        user.setAddress("城北市民健身中心");

        String params="name="+user.getName()+"&age="+user.getAge()+"&address="+user.getAddress();
        Request request=new Request.Builder()
                .url("http://localhost:8080/user/save?"+params)
                .get()
                .build();
        try {
            Response response=client.newCall(request).execute();
            System.out.println(response.body().string());
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    @Test
    public void del(){
        OkHttpClient client=new OkHttpClient();

        int id=6;
        Request request=new Request.Builder()
                .url("http://localhost:8080/user/del?id="+id)
                .get()
                .build();
        try {
            Response response=client.newCall(request).execute();
            System.out.println(response.body().string());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

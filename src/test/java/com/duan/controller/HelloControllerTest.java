package com.duan.controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

public class HelloControllerTest {

    @Test
    public void hello(){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url("http://localhost:8080/hello")
                .get()
                .build();
        try {
            Response response=client.newCall(request).execute();
            System.out.println("The response is "+response.body().string());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

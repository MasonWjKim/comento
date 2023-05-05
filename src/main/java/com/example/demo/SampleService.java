package com.example.demo;

import com.squareup.okhttp.*;

import java.io.IOException;

public class SampleService {

    public String hello () {
        return "hello CONMENTO!! LET THE CODING BEGIN";
    }

    public Response getMarketCode () throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.upbit.com/v1/market/all?isDetails=false")
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        return response;
    }
}

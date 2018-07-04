package org.podpage.worte;

import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;

public class WorteAPI {

    private String version = "v1";
    private String baseUrl = "https://www.100worte.de/" + version + "/api/";
    private String apiKey;

    public WorteAPI(String apiKey) {
        this.apiKey = apiKey;
    }


    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public WorteStatus getStatus() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .header("Content-Type", "application/json")
                .header("'Accept'", "application/json")
                .header("x-api-key", apiKey)
                .url(baseUrl + "status")
                .build();

        Response response = client.newCall(request).execute();
        if (response.code() != 200) {
            throw new IOException(response.body().string());
        }
        JSONObject responseJson = new JSONObject(response.body().string());
        return new WorteStatus(responseJson);
    }

    public WorteResult analyze(String text) throws IOException {
        JSONObject json = new JSONObject();
        json.put("text", text);
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json.toString());

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .header("Content-Type", "application/json")
                .header("'Accept'", "application/json")
                .header("x-api-key", apiKey)
                .url(baseUrl + "analyses")
                .put(body).build();

        Response response = client.newCall(request).execute();
        if (response.code() != 200) {
            throw new IOException(response.body().string());
        }
        JSONObject responseJson = new JSONObject(response.body().string());
        return new WorteResult(responseJson);
    }
}

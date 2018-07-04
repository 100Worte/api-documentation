package org.podpage.worte;


import org.json.JSONObject;

public class WorteStatus {
    private int requestLimit;
    private int requestCount;

    public WorteStatus(JSONObject json) {
        requestLimit = json.getInt("requestLimit");
        requestCount = json.getInt("requestCount");
    }

    public int getRequestLimit() {
        return requestLimit;
    }

    public int getRequestCount() {
        return requestCount;
    }

    @Override
    public String toString() {
        return "WorteStatus{" +
                "requestLimit=" + requestLimit +
                ", requestCount=" + requestCount +
                '}';
    }
}
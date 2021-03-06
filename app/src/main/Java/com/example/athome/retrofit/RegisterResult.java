package com.example.athome.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterResult {
    @SerializedName("result")
    @Expose
    String registerResult;

    @SerializedName("message")
    @Expose
    String registerResultMessage;

    public String getRegisterResultMessage() {
        return registerResultMessage;
    }

    public String getRegisterResult() {
        return registerResult;
    }

    public void setRegisterResult(String registerResult) {
        this.registerResult = registerResult;
    }
}

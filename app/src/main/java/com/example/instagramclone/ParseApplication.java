package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initialize Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZECStDcTawEqXw6PxEb4xAcIicHxmUPLpyNJNO18")
                .clientKey("2DbpGU35YsvW692aXjk18Bo9fpD91QlbqFd7T8Gs")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

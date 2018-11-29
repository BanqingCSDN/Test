package com.video.videoplayerdemo;

import android.app.Application;

import com.video.videoplayerdemo.util.VideoLRUCacheUtil;

/**
 * Created by bxq on: 2018/11/29
 * About：
 */
public class MyApplication extends Application {
    public static MyApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        this.mContext = this;

        //清理超过大小和存储时间的视频缓存文件
        VideoLRUCacheUtil.checkCacheSize(mContext);
    }
}

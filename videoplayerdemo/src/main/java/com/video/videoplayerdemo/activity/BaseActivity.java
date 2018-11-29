package com.video.videoplayerdemo.activity;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.video.videoplayerdemo.R;
import com.video.videoplayerdemo.util.StatusBarUtil;

public class BaseActivity extends AppCompatActivity {


    protected BaseActivity mContext;
    private AlertDialog dialog;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;

        StatusBarUtil.setColor(mContext, ContextCompat.getColor(mContext, R.color.my_black), false);
    }

    @Override
    protected void onStart() {
        super.onStart();

        StatusBarUtil.setColor(this, Color.WHITE, true);
    }

    protected void showProDialog(){

        dismissDialog();

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setCancelable(false);
        View view = View.inflate(mContext, R.layout.dialog_loading, null);
        builder.setView(view);
        dialog = builder.create();
        dialog.show();
    }

    protected void dismissDialog(){

        if(dialog != null){
            dialog.dismiss();
            dialog = null;
        }
    }
}

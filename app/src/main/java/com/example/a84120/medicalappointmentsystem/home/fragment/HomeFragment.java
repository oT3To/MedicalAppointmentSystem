package com.example.a84120.medicalappointmentsystem.home.fragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.a84120.medicalappointmentsystem.base.BaseFragment;

import static android.content.ContentValues.TAG;

/*
* 作用：主页面的Fragment
* */
public class HomeFragment extends BaseFragment {
    private TextView textView;
    @Override
    public View initView() {
        Log.e(TAG,"主页面的Fragment的UI被初始化了");
        textView = new TextView(mContext);

        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e(TAG,"主页面的Fragment的数据被初始化了");
        textView.setText("主页面内容");
    }
}

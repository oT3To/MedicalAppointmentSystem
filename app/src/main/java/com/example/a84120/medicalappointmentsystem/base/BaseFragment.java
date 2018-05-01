package com.example.a84120.medicalappointmentsystem.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
* 作用：基类Fragment
* 首页：HomeFragment
* 购物：ShoppingCartFragment
* 发现：CommunityFragment
* 用户中心：UserFragment
* 等等都要继承该类
* */

public abstract class BaseFragment extends Fragment {
    public Context mContext;
    /**
     * 当该类被系统创建的时候被回调
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView();
    }
    /*
     * 当Activity被创建了的时候回调这个方法
     * */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();
    }

    /**
     * 有子类实现，实现特有效果
     * @return
     */
    public abstract View initView();

    /*
     * 当子类需要联网请求的时候，可以重写该方法，在该方法中联网请求，初始化数据
     * */
    public void initData() {

    }
}

package com.example.liuya.cartoonproject.Base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liuya on 2016/3/9.
 */
public abstract class BaseFragment extends Fragment {

    protected abstract int getContentResid();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getContentResid(), container, false);
    }

    /**
     * 该方法会紧跟着onCreateView被调用
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        init(view);
        loadDatas();
    }


    /**
     * 初始化方法
     * @param view
     */
    protected void init(View view) {

    }

    /**
     *  加载数据的方法
     */
    protected void loadDatas() {
    }
    /**
     *
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDates(getArguments());//---------------------------------------------

    }

    /**
     * de得到数据
     * @param bundle
     */
    public void  getDates(Bundle bundle){

    }
}

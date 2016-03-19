/*
 * Copyright (C) 2016 jiashuangkuaizi, Inc.
 */
package com.cheng.diy;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Description:
 * <br/>Program Name: 回家吃饭Android开发最佳实践
 * <br/>Date: 2016年3月7日
 *
 * @author 李旺成    liwangcheng@jiashuangkuaizi.com
 * @version 1.0
 */

public class FragmentDemo extends Fragment {
    private String mCharStr;

    public FragmentDemo() {}

    public FragmentDemo(String charStr) {
        super();
        this.mCharStr = charStr;
    }

    public static FragmentDemo instance(int type) {
        String charStr = "";
        switch (type) {
            case 0:
                charStr = "AAAAAAAAAA";
                break;
            case 1:
                charStr = "BBBBBBBBBB";
                break;
            case 2:
                charStr = "CCCCCCCCCC";
                break;
            case 3:
                charStr = "DDDDDDDDDD";
                break;
            default:
                charStr = "XXXXXXXXXX";
                break;
        }
        Log.e("FragmentDemo", charStr);
        return new FragmentDemo(charStr);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        System.out.println(mCharStr+"____onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(mCharStr+"____onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println(mCharStr+"____onCreateView");
        View view = inflater.inflate(R.layout.fragment_demo,
                container, false);
        TextView tv = (TextView) view.findViewById(R.id.hello);
        final EditText et = (EditText) view.findViewById(R.id.edit);
        tv.setText(mCharStr);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                et.setText(mCharStr);
            }
        }, 5*1000);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println(mCharStr+"____onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println(mCharStr+"____onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println(mCharStr+"____onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println(mCharStr+"____onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println(mCharStr+"____onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println(mCharStr+"____onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println(mCharStr+"____onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println(mCharStr+"____onDetach");
    }
}

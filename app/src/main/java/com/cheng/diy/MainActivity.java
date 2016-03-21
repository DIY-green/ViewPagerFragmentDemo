package com.cheng.diy;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.LinkedList;

public class MainActivity extends FragmentActivity {

    private ViewPager mTestVP;
    private FragmentDemo2Adapter mFragmentAdapter2;
//    private FragmentDemo1Adapter mFragmentAdapter2;
    private LinkedList<Integer> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        this.mTestVP = (ViewPager) this.findViewById(R.id.vp_test);
    }

    private void initData() {
        mDataList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            mDataList.add(i);
        }
        mFragmentAdapter2 = new FragmentDemo2Adapter(getSupportFragmentManager(), mDataList);
        mTestVP.setAdapter(mFragmentAdapter2);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_delete:
                if (!mDataList.isEmpty())
                mDataList.removeLast();
                mFragmentAdapter2.updateData(mDataList);
                break;
            case R.id.btn_add:
                mDataList.addLast(7);
                mFragmentAdapter2.updateData(mDataList);
                break;
            case R.id.btn_change:
                mDataList.clear();
                mFragmentAdapter2.updateData(mDataList);
                break;
            case R.id.btn_addall:
                mDataList.clear();
                for (int i = 0; i < 3; i++) {
                    mDataList.add(7);
                }
                mFragmentAdapter2.updateData(mDataList);
                break;
        }
    }
}

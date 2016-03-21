/*
 * Copyright (C) 2016 jiashuangkuaizi, Inc.
 */
package com.cheng.diy;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Description:
 * <br/>Program Name: 回家吃饭Android开发最佳实践
 * <br/>Date: 2016年3月7日
 *
 * @author 李旺成    liwangcheng@jiashuangkuaizi.com
 * @version 1.0
 */

public class TestVPAdapter extends PagerAdapter {

    private Context mContext;
    private List<Integer> mViewList;

    public TestVPAdapter(Context context, List<Integer> viewList) {
        this.mContext = context;
        this.mViewList = viewList;
    }

    @Override
    //获取当前窗体界面数
    public int getCount() {
        return mViewList.size();
    }

    @Override
    //断是否由对象生成界面
    public boolean isViewFromObject(View arg0, Object arg1) {
        // TODO Auto-generated method stub
        return arg0==arg1;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textView = new TextView(mContext);
        textView.setText("内容" + position);
        //用代码创建一个layout
        LinearLayout layout = new LinearLayout(mContext);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        layout.setGravity(Gravity.CENTER);
        layout.setLayoutParams(params);
        layout.addView(textView);
        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // super.destroyItem(container, position, object);
        container.removeView((View)object);
    }

}

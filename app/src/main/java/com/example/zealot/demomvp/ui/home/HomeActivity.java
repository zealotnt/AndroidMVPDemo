/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.zealot.demomvp.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.zealot.demomvp.R;
import com.example.zealot.demomvp.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zealot on 12/10/16.
 */

public class HomeActivity extends BaseActivity implements HomeContract.View {
    @BindView(R.id.increase)
    protected Button mBtnIncrease;
    private HomePresenter mPresenter;


    public static Intent newIntent(Context context) {
        return new Intent(context, HomeActivity.class);
    }

    @Override
    protected void initializePresenter() {
        mPresenter = new HomePresenter();
        mPresenter.setView(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        mBtnIncrease = (Button) findViewById(R.id.increase);
        mBtnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.increaseValue();
            }
        });
    }

    @Override
    public void updateValue(String value) {
        mBtnIncrease.setText(value);
    }
}

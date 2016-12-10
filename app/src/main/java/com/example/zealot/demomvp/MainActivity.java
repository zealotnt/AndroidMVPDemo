package com.example.zealot.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zealot.demomvp.ui.base.BaseActivity;
import com.example.zealot.demomvp.ui.home.HomeActivity;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(HomeActivity.newIntent(this));
        finish();
    }

    @Override
    protected void initializePresenter() {

    }
}

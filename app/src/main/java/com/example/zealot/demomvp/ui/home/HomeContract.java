/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.zealot.demomvp.ui.home;

import com.example.zealot.demomvp.ui.base.BasePresenter;
import com.example.zealot.demomvp.ui.base.BaseView;

/**
 * Created by zealot on 12/10/16.
 */

public interface HomeContract {
    interface View extends BaseView {

        void updateValue(String value);
    }

    interface Presenter extends BasePresenter<View> {

        void increaseValue();
    }
}

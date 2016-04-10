package com.geniusmart.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.geniusmart.databinding.databinding.ActivityEasyBindingBinding;
import com.geniusmart.databinding.model.User;
import com.geniusmart.databinding.utils.MyHandler;

public class BindingDataAndEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEasyBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_easy_binding);
        binding.setUser(new User("geniusmart", "helloworld", true));
        //使用BR获取variableId
        binding.setVariable(com.geniusmart.databinding.BR.handler,new MyHandler());
    }
}

package com.geniusmart.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.geniusmart.databinding.databinding.ActivityLayoutDetailsBinding;
import com.geniusmart.databinding.utils.MockModelFabric;

public class LayoutDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLayoutDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_layout_details);
        binding.setUser(MockModelFabric.newUser("geniusmart"));
        binding.setUserList(MockModelFabric.newListOfUser(10));
    }
}

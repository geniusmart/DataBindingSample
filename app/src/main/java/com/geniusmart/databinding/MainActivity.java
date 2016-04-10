package com.geniusmart.databinding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bindingData(View view) {
        startActivity(new Intent(this,BindingDataAndEventActivity.class));
    }

    public void bindingRecyclerview(View view) {
        startActivity(new Intent(this,ListItemBindingActivity.class));
    }

    public void bindingLayoutDetails(View view) {
        startActivity(new Intent(this,LayoutDetailsActivity.class));
    }
}

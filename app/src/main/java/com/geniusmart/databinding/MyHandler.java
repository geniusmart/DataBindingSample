package com.geniusmart.databinding;

import android.view.View;
import android.widget.Toast;

public class MyHandler {
    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(),"onClickFriend",Toast.LENGTH_SHORT).show();
    }
    public void onClickEnemy(View view) {
        Toast.makeText(view.getContext(),"onClickEnemy",Toast.LENGTH_SHORT).show();
    }
}

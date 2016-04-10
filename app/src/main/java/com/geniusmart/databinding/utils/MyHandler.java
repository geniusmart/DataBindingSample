package com.geniusmart.databinding.utils;

import android.view.View;
import android.widget.Toast;

public class MyHandler {
    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_SHORT).show();
    }

    public void onClickEnemy(View view) {
        Toast.makeText(view.getContext(), "onClickEnemy", Toast.LENGTH_SHORT).show();
    }

    /**
     * TODO 这样的绑定形式如何才能编译通过：android:onLongClick = "@{handler.onLongClick}"
     * @param view
     */
    public void onLongClick(View view) {
        Toast.makeText(view.getContext(), "onLongClick", Toast.LENGTH_SHORT).show();
    }
}

package com.example.android.miwok;

import android.content.Intent;
import android.view.View;

/**
 * Created by tec on 2/19/17.
 */

public class ColorsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(view.getContext(), ColorsActivity.class);
        view.getContext().startActivity(i);
    }
}

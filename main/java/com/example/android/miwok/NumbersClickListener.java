package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * Created by tec on 2/19/17.
 */

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(view.getContext(), NumbersActivity.class);
        view.getContext().startActivity(i);
    }
}

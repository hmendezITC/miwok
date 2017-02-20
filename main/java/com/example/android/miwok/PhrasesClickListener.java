package com.example.android.miwok;

import android.content.Intent;
import android.view.View;

/**
 * Created by tec on 2/19/17.
 */

public class PhrasesClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(view.getContext(), PhrasesActivity.class);
        view.getContext().startActivity(i);
    }
}

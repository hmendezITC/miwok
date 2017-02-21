package com.example.android.miwok;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    String[] words = new String[10];
    String[] miwok = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        fillArrayNumbers();

        LinearLayout rootView = (LinearLayout) findViewById(R.id.activity_numbers);

        for(int index=0; index < words.length; index++){
            TextView wordView = new TextView(this);
            if(index%2 == 0)
                //Most significant byte in RGB value should be FF, transparency bits
                wordView.setBackgroundColor(0xFFFD8E09);
            wordView.setPadding(0, 0, 0, 24);
            wordView.setText(words[index] + "\n" + miwok[index]);
            rootView.addView(wordView);
        }

    }

    private void fillArrayNumbers(){
        words[0] = getString(R.string.number_one);
        words[1] = getString(R.string.number_two);
        words[2] = getString(R.string.number_three);
        words[3] = getString(R.string.number_four);
        words[4] = getString(R.string.number_five);
        words[5] = getString(R.string.number_six);
        words[6] = getString(R.string.number_seven);
        words[7] = getString(R.string.number_eight);
        words[8] = getString(R.string.number_nine);
        words[9] = getString(R.string.number_ten);

        miwok[0] = "lutti";
        miwok[1] = "otiiko";
        miwok[2] = "tolookosu";
        miwok[3] = "oyyisa";
        miwok[4] = "massokka";
        miwok[5] = "temmokka";
        miwok[6] = "kenekaku";
        miwok[7] = "kawinta";
        miwok[8] = "wo’e";
        miwok[9] = "na’aacha";
    }
}

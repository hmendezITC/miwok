package com.example.android.miwok;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    //String[] words = new String[10];
    //String[] miwok = new String[10];
    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> miwok = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        fillListArrayNumbers();

        LinearLayout rootView = (LinearLayout) findViewById(R.id.activity_numbers);

        for(int index=0; index < words.size(); index++){
            TextView wordView = new TextView(this);
            if(index%2 == 0)
                //Most significant byte in RGB value should be FF, transparency bits
                wordView.setBackgroundColor(0xFFFD8E09);
            wordView.setPadding(0, 0, 0, 24);
            wordView.setText(words.get(index) + "\n" + miwok.get(index));
            rootView.addView(wordView);
        }

    }

    private void fillListArrayNumbers(){
        words.add(getString(R.string.number_one));
        words.add(getString(R.string.number_two));
        words.add(getString(R.string.number_three));
        words.add(getString(R.string.number_four));
        words.add(getString(R.string.number_five));
        words.add(getString(R.string.number_six));
        words.add(getString(R.string.number_seven));
        words.add(getString(R.string.number_eight));
        words.add(getString(R.string.number_nine));
        words.add(getString(R.string.number_ten));

        miwok.add("lutti");
        miwok.add("otiiko");
        miwok.add("tolookosu");
        miwok.add("oyyisa");
        miwok.add("massokka");
        miwok.add("temmokka");
        miwok.add("kenekaku");
        miwok.add("kawinta");
        miwok.add("wo’e");
        miwok.add("na’aacha");
    }
}

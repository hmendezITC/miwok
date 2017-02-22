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

    ArrayList<Translator> words = new ArrayList<>();

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
            wordView.setText(words.get(index).getDefaultLanguage() + "\n" + words.get(index).getMiwok());
            rootView.addView(wordView);
        }

    }

    private void fillListArrayNumbers(){
        words.add(new Translator(getString(R.string.number_one), "lutti"));
        words.add(new Translator(getString(R.string.number_two),"otiiko"));
        words.add(new Translator(getString(R.string.number_three), "tolookosu"));
        words.add(new Translator(getString(R.string.number_four), "oyyisa"));
        words.add(new Translator(getString(R.string.number_five), "massokka"));
        words.add(new Translator(getString(R.string.number_six), "temmokka"));
        words.add(new Translator(getString(R.string.number_seven), "kenekaku"));
        words.add(new Translator(getString(R.string.number_eight), "kawinta"));
        words.add(new Translator(getString(R.string.number_nine), "wo’e"));
        words.add(new Translator(getString(R.string.number_ten), "na’aacha"));
    }
}

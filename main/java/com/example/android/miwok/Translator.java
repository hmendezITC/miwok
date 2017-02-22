package com.example.android.miwok;

/**
 * Created by tec on 2/21/17.
 */

class Translator {
    String defaultLanguage;
    String miwok;

    Translator(String d, String m)
    {
        defaultLanguage = d;
        miwok = m;
    }

    public String getDefaultLanguage(){
        return defaultLanguage;
    }

    public String getMiwok(){
        return miwok;
    }
}

package com.example.android.miwok;

/**
 * Created by NEW TECH on 2/9/2018.
 */

public class Word {
    private String Miwok;
    private String defaultWord;
    private int imageID = No_imageState;
    private static final int No_imageState= -1;
    private int soundId;

    public Word(String defaultTranslation ,String miwokTranslation,int mSound){
        Miwok= miwokTranslation;
        defaultWord = defaultTranslation;
        soundId = mSound;
    }
    public Word(String defaultTranslation ,String miwokTranslation ,int idOfimage,int mSound){
        imageID = idOfimage;
        Miwok= miwokTranslation;
        defaultWord = defaultTranslation;
        soundId =mSound;
    }
/*
get the Miwok translation for the word
 */
    public String getMiwok(){
        return Miwok;
    }
    /*
    get the default language translation of the word
     */
    public String getDefault(){
        return defaultWord;
    }
    /*
    get tha image resource Id
     */
    public int getImageResourceID(){
        return imageID;
    }
    /*
    returns whether it has image or not
     */
    public boolean hasImage(){
return imageID != No_imageState;
    }
    public int getSoundId(){
        return  soundId;
    }


}

package com.example.tanslator_app;

public class Word {
    private String mdefaultTrans;
    private String mfrenchTrans;
    private int mimageId = NO_IMAGE_CASE;
    private int mSoundId;

    private static final int NO_IMAGE_CASE = -100;

    public Word(String defaultTrans , String frenchTrans, int imageId , int soundId)
    {
        mdefaultTrans = defaultTrans;
        mfrenchTrans = frenchTrans;
        mimageId = imageId;
        mSoundId = soundId;
    }

    public Word(String defaultTrans , String frenchTrans)  //Constructor Overloading
    {
        mdefaultTrans = defaultTrans;
        mfrenchTrans = frenchTrans;
    }

    public  String getMdefaultTrans(){
        return mdefaultTrans;
    }
    public String getMfrenchTrans(){
        return mfrenchTrans;
    }
    public int getMimageId(){
        return mimageId;
    }
    public int getmSoundId() { return mSoundId;}

    public boolean hasImage()
    {
        return mimageId != NO_IMAGE_CASE;
    }
}

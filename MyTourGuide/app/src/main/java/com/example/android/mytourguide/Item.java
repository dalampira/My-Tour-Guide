package com.example.android.mytourguide;

/**
 * Created by sissy on 6/7/2017.
 */

public class Item {


    private int mExplanation;
    private int mInformation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;

    public Item(int information, int imageResourceId ){
        mInformation=information;
        mImageResourceId=imageResourceId;
    }
    public Item(int explanation ){
        mExplanation=explanation;
    }

    public Item(int explanation, int information, int imageResourceId){
        mExplanation=explanation;
        mInformation=information;
        mImageResourceId = imageResourceId;
    }
    public Item(int explanation, int information, int imageRecourceId, int audioResourceId){
        mExplanation=explanation;
        mInformation=information;
        mImageResourceId= imageRecourceId;
        mAudioResourceId = audioResourceId;
    }

    public int getExplanation()

    {
        return mExplanation;
    }

    public int getInformation(){
        return mInformation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }


    public boolean hasImage(){

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}

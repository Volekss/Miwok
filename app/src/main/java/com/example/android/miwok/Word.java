package com.example.android.miwok;

/**
 * Created by Volekss on 28-Aug-17.
 */

import android.widget.ImageView;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Music translation-pronunciation for the word
     */
    private int mPronunciationResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param pronunciationResourceID is raw resource ID for music file with pronunciation
     */
    public Word(String defaultTranslation, String miwokTranslation, int pronunciationResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mPronunciationResourceID = pronunciationResourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param imageResourceId is drawable resource ID for the image associated with the word
     *
     * @param pronunciationResourceID is raw resource ID for music file with pronunciation
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int pronunciationResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mPronunciationResourceID = pronunciationResourceID;
    }

    /**
     * @return the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * @return music file resource ID
     */
    public int getmPronunciationResourceID() {
        return mPronunciationResourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mPronunciationResourceID +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
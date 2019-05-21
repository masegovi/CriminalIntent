package com.mariosegovia.criminalintent.Model;



import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mCrimeId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mCrimeId = UUID.randomUUID();
        mDate = new Date();
    }
    public UUID getCrimeId(){
        return mCrimeId;
    }
    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate(){
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}

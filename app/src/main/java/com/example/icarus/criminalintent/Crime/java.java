package com.example.icarus.criminalintent.Crime;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Icarus on 9/9/2014.
 */
public class java {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

        public UUID getId() {
        return mId;
    }

        public String getTitle() {
            return mTitle;
        }

    public void setTitle(String title) {
        mTitle = title;
    }
}

package com.example.icarus.criminalintent.Crime;

import java.util.UUID;

/**
 * Created by Icarus on 9/9/2014.
 */
public class java {
    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
    }
}

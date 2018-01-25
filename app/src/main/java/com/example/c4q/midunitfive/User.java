package com.example.c4q.midunitfive;

/**
 * Created by C4Q on 1/24/2018.
 */

public class User{
    Title name;
    Coord location;
    Pictures profPics;
    String email, dob, cell;

    public Title getName(){
        return name;
    }

    public Coord getLocation() {
        return location;
    }

    public Pictures getProfPics(){
        return profPics;
    }
}

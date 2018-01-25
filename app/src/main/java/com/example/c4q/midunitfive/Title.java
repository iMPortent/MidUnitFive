package com.example.c4q.midunitfive;

/**
 * Created by C4Q on 1/24/2018.
 */

class Title {
    String title, first, last;

    public String getTitle(){
        return title;
    }

    public String getFirst(){
        return first;
    }

    public String getLast(){
        return last;
    }

    public String getFullTitle(){
        return getTitle()+getFirst()+ " " + getLast();
    }
}

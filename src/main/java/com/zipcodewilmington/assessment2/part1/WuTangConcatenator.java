package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class WuTangConcatenator {


    private Integer input;

    WuTangConcatenator(Integer input){
        this.input = input;
    }

    public boolean isWu(){
        return (input%3 == 0) ? true: false;
    }

    public boolean isTang(){
        return(input%5 == 0)?true: false;
    }

    public boolean isWuTang(){
        return (input%15 == 0) ? true: false;
    }

}

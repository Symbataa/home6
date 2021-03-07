package com.company;

public class Home2 implements Builder{
    @Override
    public int getWindow(){
        return 8;
    }
    @Override
    public String getDoor(){
        return "made from titan";
    }
    @Override
    public int numberRooms(){
        return 4;
    }
    @Override
    public String specialThing(){
        return "swimming pool";
    }
}

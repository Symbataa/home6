package com.company;

public class Home1 implements Builder{
    public int getWindow(){
        System.out.println("Windows built!");
        return 0;
    }
    @Override
    public String getDoor(){
        return "Doors build!";
    }

    @Override
    public int numberRooms(){
        return 2;
    }
    @Override
    public String specialThing(){
        return "many trees around";
    }
}

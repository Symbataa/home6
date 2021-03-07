package com.company;

public final class Singleton {
    private static Singleton instance;
    public String returnWord;

    private Singleton(String returnWord){
        try{
            Thread.sleep(100);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.returnWord=returnWord;
    }

    public String getReturnWord() {
        return returnWord;
    }

    public void setReturnWord(String returnWord) {
        this.returnWord = returnWord;
    }
    public static Singleton getInstance(String returnWord){
        if (instance == null){
            instance = new Singleton(returnWord);
        }
        return instance;
    }
}


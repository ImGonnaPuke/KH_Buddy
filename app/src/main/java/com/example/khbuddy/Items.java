package com.example.khbuddy;

public class Items {
    private int img;
    private String text1;
    private String text2;


    public Items(int resImg, String resText1, String resText2){
        img =resImg;
        text1 = resText1;
        text2 = resText2;
    }



    public int getImg(){
        return img;
    }

    public String getText1(){
        return text1;
    }

    public String getText2(){
        return text2;
    }

}

package com.example.khbuddy;

public class ItemsK {

    private int img;
    private String text1;
    private String text2;
    private String text3;
    private String text4;
    private String text5;


    public ItemsK(int resImg, String resText1, String resText2, String resText3, String resText4, String resText5){
        img =resImg;
        text1 = resText1;
        text2 = resText2;
        text3 = resText3;
        text4 = resText4;
        text5 = resText5;


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

    public String getText3(){
        return text3;
    }

    public String getText4(){
        return text4;
    }

    public String getText5(){
        return text5;
    }

}



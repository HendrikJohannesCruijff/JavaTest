package com.test.obj;

import java.util.Calendar;

public class Mouse {

    private String model;
    private int price;
    private String color;

    private Calendar date;  // 마우스 제조 날짜



    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }
/*    public String getState(){  //계산된 프로퍼티 > getter와 setter는 기본적으로 private 맴버 변수르 조작하지만 , 필수는아니다
                                    // > 맴버변수와 무관한 getter setter를 만들기도 한다.
        if (this.date.get(Calendar.YEAR) <= 2021) {
            return "구형";
        } else {
            return "신형";
        }
    }*/

    public void setDate(int year, int month, int date) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, date);

        this.date = c;


    }
    public String getDate(){
        return String.format("%tF", this.date);
    }
    public String info(){
        String temp = "[";

        temp += this.model + ",";
        temp += this.price + ",";
        temp += String.format("%tF", this.date);
        temp += "]";
        return temp;
    }

}

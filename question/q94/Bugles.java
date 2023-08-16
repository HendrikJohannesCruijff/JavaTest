package question.q94;

import java.util.Calendar;

public class Bugles {
    private int price;
    private int weight;
    private Calendar creationTime;
    private int expiration;
    

    public void setSize(int weight) {
        if (weight == 300 || weight == 500 || weight == 850) {
        this.weight = weight;
            if (weight == 300) {
                price += 850;
                expiration =7;
            } else if (weight == 500) {
                price += 1200;
                expiration = 10;
            } else if (weight == 850) {
                price += 1950;
                expiration = 15;
            }

        }
    }

    public void setCreationTime(String creationTime) {
        Calendar c = Calendar.getInstance(); //2023-07-27
        int year = Integer.valueOf(creationTime.substring(0, 4));
        int month = Integer.valueOf(creationTime.substring(5, 7))-1;
        int day = Integer.valueOf(creationTime.substring(8, 10));
        c.set(year, month, day);

        this.creationTime = c;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getExpiration() {

        Calendar now = Calendar.getInstance();
        return expiration - (int) ((now.getTimeInMillis() - creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24);
    }

   

    //getter, setter 구현

    public void eat() {

        if (getExpiration() >= 0) {
            System.out.println(" 과자를 맛나게 먹습니다 ");
        } else {
            System.out.println(" 유통기한 지남 ");
        }

        

    }


}

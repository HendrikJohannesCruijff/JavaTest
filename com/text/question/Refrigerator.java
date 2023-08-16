package com.text.question;

import java.util.Calendar;

public class Refrigerator {
  private Item[] items = new Item[100];

  int index = 0;
    public void add(Item item) {
        items[index] = item;
        index++;
    }


    public Item get(String name) {
        Item item = null;
        int itemIndex = -1;
        for (int i = 0; i < index; i++) {
            if ((items[i].getName().equals(name))) {
                item = items[i];
                itemIndex = i;
                index--;
                break;
            }
        }
        if (item != null) {
            for (int i = itemIndex; i < index; i++) {
                items[i] = items[i + 1];
            }
        }
        return item;
    }

    public int count() {
        return index;
    }

    public void listItem() {
        System.out.println("[냉장고 아이템 목록]");
        for (int i = 0; i < index; i++) {
            System.out.println(items[i].getName()+" "+items[i].getExpiration() );
        }
    }


}

class Item {
    private String name;
    private String expiration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}

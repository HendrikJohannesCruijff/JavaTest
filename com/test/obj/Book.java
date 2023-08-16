package com.test.obj;

public class Book {

    // 접근 제어자 > 가이드 라인
    // 1. 멤버 변수는 무조건 private 으로 막는다
    // 2. Getter/Setter를 구현한다.
// Setter / Getter > 객체 내외부를 연결하는 통로
                // >  인터페이스 역할
                // >  프로퍼티(Property)


  private   String title , author , publisher ;
   private int price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(int price) {
        if (price >= 0 && price <= 100000) {
            this.price = price;
        } else {
            System.out.println("올바른 가격이아닙니다.");
        }
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public int getPage() {
        return page;
    }

    private int page;
}

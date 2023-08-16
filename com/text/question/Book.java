package com.text.question;

public class Book {
    private String title;
    private int price;
    private String author;
    private String publisher;
    private String pubYear = "2019";
    private String isbn;
    private int page;

    public void setTitle(String title) {
        if (title.length() > 50) {
            return;
        }
        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            if ((c < '가' || c > '힣') && (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') && c != ' ') {
                return;
            }
        }
        this.title = title;
    }

    public void setPrice(int price) {
        if (price > 0 && price < 100001) {
        this.price = price;
        }
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {

        this.publisher = publisher;

    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPage(int page) {
        if (publisher.length() > 0) {
            this.page = page;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }


    public String getPubYear() {
        return pubYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPage() {
        return page;
    }

    public String info() {
        String str = "";

        return String.format("제목 : %s\n가격 : %,d원\n저자 : %s\n출판사 : %s\n발행년도 : %s년\n" +
                "ISBN : %s\n페이지 : %,d장\n", title, price, author, publisher, pubYear, isbn, page);
    }
}

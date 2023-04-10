package com.prototype;

public class Book {
    private int bid;
    private String bookName;
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public String toString() {
        return "Book [bid=" + bid + ", bookName=" + bookName + "]";
    }
    
}

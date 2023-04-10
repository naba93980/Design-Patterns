package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {            //  implements Cloneable indicates object of this class can be cloned
    private String shopName;
    List<Book> books = new ArrayList<>();
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void loadData(){
        for(int i=1;i<=10;i++){
            Book b = new Book();
            b.setBid(i);
            b.setBookName("book"+ i);
            this.getBooks().add(b);
        }
    }
    @Override
    public BookShop clone() throws CloneNotSupportedException {
        // return super.clone();
        BookShop bs22 = new BookShop();
        for(Book b: this.getBooks() ){
            bs22.getBooks().add(b);
        }
        return bs22;
    }
}

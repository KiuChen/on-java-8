package com.kiuchen.base.init.collectmethod;

public class Book {
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize(){
        if(checkedOut){
            System.out.println("Error: checked out");
        }
//        super.finalize();;
    }
}

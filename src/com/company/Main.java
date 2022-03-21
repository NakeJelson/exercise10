package com.company;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        for (Contact a :book) {
            System.out.println(a);
        }

    }
}

class Contact {
    private String email;
    private String phoneNumber;

    public Contact(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

class Book implements Iterable<Contact> {
    private ArrayList<Contact> listOfContacts = new ArrayList<Contact>();
    

    public Book() {
        listOfContacts.add(new Contact("john.jeffrey@gmail.com", "614-234-2343"));
        listOfContacts.add(new Contact("jack.jeffrey@gmail.com", "614-233-2342"));
    }

    @Override
    public String toString() {
        return "Book{" +
                "listOfContacts=" + listOfContacts +
                '}';
    }

    @Override
    public Iterator<Contact> iterator() {
        return listOfContacts.iterator();
    }
}




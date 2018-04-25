package com.ArrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean findContact(String name) {
        for (int i = 0; i < this.myContact.size(); i++) {
            if (this.myContact.get(i).getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public boolean findContact(Contact con) {
        for (int i = 0; i < this.myContact.size(); i++) {
            if (this.myContact.get(i).getName().equals(con.getName())) {
                return true;
            }
        }

        return false;
    }

    public Contact queryContact(String name) {
        Contact con;
        for (int i = 0; i < this.myContact.size(); i++) {
            if (this.myContact.get(i).getName().equals(name)) {
                con = new Contact(this.myContact.get(i).getName(), this.myContact.get(i).getNumber());
                return con;
            }
        }

        return null;

    }

    public boolean addContact(Contact con) {
        if (!findContact(con)) {
            this.myContact.add(con);
            return true;
        }

        return false;
    }

    private int findPosition(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    public boolean updateContact(Contact con, Contact modifiedContact)
    {

        System.out.println("-----"+con.getName()+con.getNumber());
        System.out.println("-----"+modifiedContact.getName()+modifiedContact.getNumber());
        if (!findContact(modifiedContact.getName())) {

            int position = findPosition(con);
            this.myContact.set(position, modifiedContact);
            return true;
        }

        return false;
    }

    public void removeContact(Contact con)
    {

        myContact.remove(con);

    }
    public void printContact()
    {
        System.out.println("The list of contact is as -:");
        for (int i = 0; i < this.myContact.size(); i++)
        {
            System.out.println(this.myContact.get(i).getName()+ "  " + this.myContact.get(i).getNumber());
        }

    }

}

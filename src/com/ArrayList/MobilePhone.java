package com.ArrayList;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContact = new ArrayList();

    public boolean findContact(String name) {
        for (int i = 0; i < myContact.size(); i++) {
            if (myContact.get(i).getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public boolean findContact(Contact con) {
        for (int i = 0; i < myContact.size(); i++) {
            if (myContact.get(i).getName().equals(con.getName())) {
                return true;
            }
        }

        return false;
    }

    public Contact queryContact(String name) {
        Contact con;
        for (int i = 0; i < myContact.size(); i++) {
            if (myContact.get(i).getName().equals(name)) {
                con = new Contact(myContact.get(i).getName(), myContact.get(i).getNumber());
                return con;
            }
        }

        return null;

    }

    public boolean addContact(Contact con) {
        if (!findContact(con)) {
            myContact.add(con);
            return true;
        }

        return false;
    }

    public boolean updateContact(Contact con, Contact modifiedContact)

    {
            if (!findContact(modifiedContact.getName())) {
                myContact.set(myContact.indexOf(con), modifiedContact);
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
        for (int i = 0; i < myContact.size(); i++)
           {
               System.out.println(myContact.get(i).getName()+ "  " + myContact.get(i).getNumber());
            }

    }

}

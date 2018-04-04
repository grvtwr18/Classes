package com.ArrayList;

import java.util.ArrayList;

public class Contacts {

    private String contactName;
    private String number;

    public Contacts(String phoneContacts, String number) {
        this.contactName = phoneContacts;
        this.number = number;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    ArrayList<Contacts> phoneContacts = new ArrayList<Contacts>();

    public String getContactName() {
        return contactName;
    }

    public String getNumber() {
        return number;
    }

    public boolean addContact(Contacts contact)
    {
        if(phoneContacts.contains(contact.getContactName())||phoneContacts.contains(contact.getNumber()))
        {
            System.out.println("The name already exist. Please either modify or add another name");
            return false;
        }else {
             phoneContacts.add(contact);
            System.out.println("Phone contact has been succesfully added");
            return true;
        }
    }

    public boolean modifyContact(Contacts contacts)
    {
        //phoneContacts.get(contacts.)
        if(phoneContacts.contains(contacts.getContactName()))
            phoneContacts.set(phoneContacts.indexOf(contacts),contacts);
            System.out.println("Phone contact has been succesfully modified");
            return true;
    }

    public boolean searchContact(Contacts contacts)
    {

        if (phoneContacts.contains(contacts.getContactName()))
        {
            System.out.println("The search was successful. Contact is found at position " + (phoneContacts.indexOf(contacts)+" "+contacts.getContactName()+" "+contacts.getNumber()));
            return true;
        }
        else
            System.out.println("The contact was not found in the system");
            return false;
    }

    public boolean removeContact(Contacts contacts)
    {
        if(phoneContacts.contains(contacts.getContactName()))
        {
            phoneContacts.remove(contacts);
            System.out.println("The contact is removed successfully");
            return true;
        }else
        {
            System.out.println("The name is not available for removal.Contact not found");
            return false;
        }
    }

    public void printListofContacts()
    {
        System.out.println("The list contains following items");
        for(int i=0;i<phoneContacts.size();i++)
        {
            System.out.println(i+1+" "+phoneContacts.get(i).contactName+" - "+this.phoneContacts.get(i).number );
        }
    }

}

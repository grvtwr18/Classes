package com.ArrayList;

import java.util.Scanner;

public class MobilePhone {

    private static Contacts con = new Contacts("","");
    private static Scanner scanner = new Scanner(System.in);

    public static void printInstructions()
    {
        boolean count = true;

        while(count)
        {
            System.out.println("Please enter your choice of opertaions to be performed");

             int choice = scanner.nextInt();
           switch (choice)
           {
               case 1: addNewContact();
               break;
               case 2: updateContact();
               break;
               case 3: removeContact();
               break;
               case 4: findContact();
               break;
               case 5: con.printListofContacts();
               break;
               case 6: System.out.println("You opted to quit");
                   count = false;
           }

        }
    }

    public static void addNewContact()
    {
        System.out.println("Enter the name to be added");
        String name = scanner.next();

        System.out.println("Enter the number to be added");
        String number = scanner.next();

        con.addContact(new Contacts(name,number));

    }

    public static void updateContact()
    {

        System.out.println("Enter the name to be modified");
        String name = scanner.next();




    }

    public static void findContact()
    {
        System.out.println("Enter the name to find the contact");
        String name = scanner.next();

        // con.searchContact(name);
    }

    public static void removeContact()
    {
        System.out.println("Enter the name of the contact to be removed");
        String name = scanner.next();

        //con.removeContact(name);
    }

    public static void main(String args[])
    {

        System.out.print("1. For adding the new contact "+"\n"+
                        "2. For updating the existing contact"+"\n"+
                        "3. For removing the existing contact"+"\n"+
                        "4. For finding the existing contact"+"\n"+
                        "5. For viewing the existing contact list"+"\n"+
                        "6. Quit the value Contact Menu"+"\n");
        printInstructions();
    }
}

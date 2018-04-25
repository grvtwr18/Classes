package com.ArrayList;


import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    private static Contact con;
    private static MobilePhone mb = new MobilePhone("9898988809");

    public static void addToContact()
    {
        System.out.println("Enter the name to be added");
        String name = sc.next();
        System.out.println("Enter the number for the contact");
        String number = sc.next();

        con = new Contact(name,number);
        if(mb.addContact(con))
            System.out.println("The contact was addded succesfully");
        else
            System.out.println("The name was already found or cannot be added successfully");
    }

    public static void updateToContact()
    {

        System.out.println("Enter the name to be modified");
        String name = sc.next();
        if(mb.queryContact(name)!=null)
        {

            System.out.println("Enter the updated name");
            String updatedname = sc.next();
            System.out.println("Enter the number to be updated");
            String updatedNumber = sc.next();


            Contact con1 = mb.queryContact(name);

          Contact newContact = con1.createContact(updatedname,updatedNumber);

            System.out.println("----------"+con1.getName()+con1.getNumber());

            if(mb.updateContact(con1,newContact))
                System.out.println("The contact was added successfully");
            else
                System.out.println("The contact was found to be either existing or not valid");
        }
        else
            System.out.println("The contact was found to be either existing or not valid");

    }

    public static void findFromContact()
    {
        System.out.println("Enter the name to be searched");
        String name = sc.next();

        if(mb.queryContact(name)!=null) {
            System.out.println("The contact was found succesfully");
            con = mb.queryContact(name);
            System.out.println("The name of the contact is -:" + con.getName());
            System.out.println("The number of the contact is -:" + con.getNumber());
        }
        else
            System.out.println("The contact does not exist in the list");
    }

    public static void removeFromContact()
    {
        System.out.println("Enter the name to be removed");
        String name = sc.next();

        if(mb.queryContact(name)!=null)
        {
            con = mb.queryContact(name);
            //System.out.println(con.getName()+con.getNumber());
            mb.removeContact(con);
            System.out.println("The contact was removed successfully");
        }else
        {
            System.out.println("The requested contact does not exist");
        }

    }

    public static void printChoices() {
        boolean enter = true;
        while (enter) {

            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    addToContact();
                    break;
                case 2:
                    updateToContact();
                    break;
                case 3:
                    removeFromContact();
                    break;
                case 4:
                    findFromContact();
                    break;
                case 5:
                    mb.printContact();
                    break;
                case 6:
                   enter = false;
                   break;
                default:
                    System.out.println("The choice is not valid. Please enter valid choice");
                     break;
            }

        }

    }

    public static void main(String[] args)
    {
        System.out.println("Enter your choices of operation to be performed \n" +
                            "1. Add the Contact \n"+
                            "2. Update the Contact \n" +
                            "3. Delete the Contact \n" +
                            "4. Find the Contact \n" +
                            "5. Print the list of Contact \n" +
                            "6. Quit the operation \n");

        printChoices();

    }


}

package com.classes;

public class BankAccount {

    private long AccNumber;
    private long Balance;
    private String CustName;
    private String emailId;
    private long phoneNumber;

    public BankAccount()
    {
        System.out.println("this is my constructor");
    }

    public BankAccount(String custName)
    {
        System.out.println("this is my constructor");
    }

    public void setAccNumber(long accNumber) {
        AccNumber = accNumber;
    }

    public void setBalance(long balance) {
        Balance = balance;
    }

    public long getAccNumber() {
        return AccNumber;
    }

    public long getBalance() {
        return Balance;
    }

    public String getCustName() {
        return CustName;
    }

    public String getEmailId() {
        return emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long depositFund(long fund) {

        if(fund<1)
        {
            System.out.println("The deposit fund should be higher than $1");
            return -1;
        }
        fund += getBalance();
        Balance = fund;
        System.out.println("Thank you for depositing money from AAP Bank. Your Balance is now "+ getBalance());
        return fund;
    }
    public long withdrawFund(long fund) {

        if(getBalance()==0||getBalance()<fund)
        {
            System.out.println("Insufficient fund found");
            return -1;
        }
        fund = getBalance()- fund;
        Balance = fund;
        System.out.println("Thank you for withdrawing money from AAP Bank. Your Balance is now"+getBalance());
        return fund;
    }

}

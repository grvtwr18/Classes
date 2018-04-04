package com.classes;

public class VipCustomer {

    private long creditLimit;
    private String emailId;
    private String custName;

    public VipCustomer()
    {
        this("John" , 50000, "john@email.com");
        System.out.println("Cons 1 default is set");

    }

    public VipCustomer(String custName,long creditLimit, String emailId)
    {
        this.custName = custName;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
        System.out.println("Cons 2 default is set");
    }

    public VipCustomer(String custName, String emailId)
    {
        this(custName,50000 , emailId);

        System.out.println("Cons 3 default is set");
    }
    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getCustName() {
        return custName;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleBank;

/**
 *
 * @author Will
 */
public class Customer
{
    private final String name;
    private final Account account;
    private String account2;
    
    Customer(String n, Account a)
    {
        name = n;
        account = a;
        
    }
    
    public void display()
    {
        System.out.println("Name: " + name + "\nAccount Number: " + account.getAccountNumber()+ "\nCurrent Balance: $" + account.getBalance());
        
    }
    public String getName()
    {
        return name;
        
    }
    public Account getAccount()
    {
       return account;
        
        
    }
    
   
        
}

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
public class Account
{
    
    private double balance = 100;
    private String accountNumber;
    private boolean firstTime = true;
    
    public Account(String acc)  // constructor to create account
    {
        accountNumber = acc;
             
    }
    
    
    
    public Account(double bal, String acc)  // a constructor that take a balance and account number
    {
        if(bal >= 100)
        {
            balance = bal;
            
        }
        else
        {
            balance = 100; // If balance is not >= 100 then we will reset it to 100
            
        }
        accountNumber = acc;
        
        
    }
    
    
    public void deposit(double howMuch)
    {
        if(howMuch > 0)
        {
            balance = balance+howMuch;
            System.out.println("Your money has been successfully deposited!\n" + "Your new balance is: $" + balance);
        }
        else
        {
            System.err.println("Please enter a deposit value of Greater than Zero (0)!");  // using err instead of out makes the tet red
        }
        
        
    }
      public void withdraw(double howMuch)
    {
        if(howMuch > 0)
        {
            if(firstTime==true)
            {
                double tempBalance = balance;
                tempBalance = tempBalance-howMuch;
                if(tempBalance >= 100)
                {
                    balance = balance-howMuch;
                    System.out.println("Your money has been successfully withdrawn!\n" + "Your new balance is: $" + balance);
        
                }
                else
                {
                     System.err.println("A withdrawl of : $" + howMuch + " excceeds the maximum allowed ammount at this time!\n" + "You must maintain a minimumballance of at least $100.00");
                }
                firstTime=false;
                
                
            }
            else
            {
               // public void Bank.getTransFee();
                Bank bank = new Bank();              // creating a Bank object to retrieve transFee
                
                
                double tempBalance = balance;
                
                tempBalance = tempBalance - howMuch - bank.getTransactionFee();
                
                if(tempBalance >= 100)
                {
                    balance = balance-howMuch- bank.getTransactionFee();
                    System.out.println("Your money has been successfully withdrawn!\n" + "Your new balance is: $" + balance);
        
                }
                else
                {
                     System.err.println("A withdrawl of : $" + howMuch + " plus a transaction fee of: $" +bank.getTransactionFee() + " excceeds the maximum allowed ammount at this time!\n" + "You must maintain a minimumballance of at least $100.00");
                }
                
            }
        }
        else
        {
            System.err.println("Please enter a withdraw value of greater than Zero (0)!");
        }
        
    }   
      public double getBalance()
    {
        return balance;
        
        
    }
    public String getAccountNumber()
    {
        return accountNumber;
        
    }
         
      
}

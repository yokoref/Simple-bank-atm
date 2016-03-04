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
public class Bank
{
    private final String bankName = "Your Money in Our Pockets Bank";
    private final double interestRate = 8.5;
    private final double transFee = 10.00;
    
    private final Customer[] customers = new Customer[1000];       // Creating customer object array
    
    public double calculateInterest(Customer customer)  // method for calculating interest
    {
        
        Account a = customer.getAccount();
        double bal = a.getBalance();
        double interestAmount = bal * interestRate/100;
        double totalBalance = bal + interestAmount;
        System.out.println("Interest amount: $" + interestAmount); //            + "\nYour new Balance after added interest is: $" + totalBalance);
        return totalBalance;
    }
    public double getInterestRate()  
    {
        return interestRate;
        
    }
    public double getTransactionFee()  
    {
        return transFee;
        
    }
    public Customer[] getCustomer()
    {
        return customers;
    }
    
    
}

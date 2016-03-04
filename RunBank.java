/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleBank;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Will
 */
    public class RunBank
    {

        public static void main(String[] args) throws Exception
        {
 

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           
            int numberOfCustomers = 0;
            Bank bank = new Bank();
            Customer[] c = bank.getCustomer();
            
            
            while(true)
            {
            
                System.out.println("Please Select the Number of the choice you want:\n");
                System.out.println("1: To Show a List of Available Customer Accounts");
                System.out.println("2: To Add New Customer");
                System.out.println("3: Deposit Money");
                System.out.println("4: Withdraw Money");
                System.out.println("5: Check Balance");
                System.out.println("6: Calculate Interest");
                System.out.println("");
                System.out.println("7: To Exit the System");
                
                int choice = Integer.parseInt(bufferedReader.readLine());
                
                switch(choice)
                {
                    case 1:    // need to change this to send to account class and ask these questions there.
                        
                        
                       
                        System.out.println("List of Available Customer Accounts:\n");
                        if(numberOfCustomers == 0)
                        {
                            System.err.println("\nERROR: Currently there are 'No' Accounts available for selection!\nPlease select number '2' to create new accounts!");
                        }
                        else
                        {
                            System.out.println("Number of Customers: " + numberOfCustomers);
                            System.out.println("\nCust. Name:  Account#:\n");
                            
                             
                            for(int i = 0; i< numberOfCustomers; i++)
                            {
                                Account temp = c[i].getAccount();
                                String accTemp = temp.getAccountNumber();                                
                                System.out.print(c[i].getName()+ "   ");
                                System.out.print(accTemp + "\n");
                            }
                            
                            System.out.println("");
                           
                        
                        }
                        
                       
                        break;
                    
                    case 2:    // need to change this to send to account class and ask these questions there.
                        
                        
                       
                        System.out.println("Create an Account for a new Customer:\n");
                        System.out.println("Please Enter the amount of Initial Deposit:");
                        double bal = Double.parseDouble(bufferedReader.readLine());
                        System.out.println("Please a new Account Number:");
                        String acc = bufferedReader.readLine();
                        Account account = new Account(bal, acc);
                        System.out.println("Please Enter New Customer's Name:");
                        String name = bufferedReader.readLine();
                        Customer customer = new Customer(name, account);
                        
                        c[numberOfCustomers] = customer;
                        numberOfCustomers++;
                                             
                        
                        break;
                    case 3:
                        System.out.println("\nPlease Enter Your Account Number:");
                        acc=bufferedReader.readLine();
                        
                        if(numberOfCustomers == 0)
                        {
                            System.err.println("\nERROR: Account not found! Please make another selection!");
                        }
                        else
                        {
                            boolean found = false;
                            
                            for(int i = 0; i< numberOfCustomers; i++)
                            {
                                Account temp = c[i].getAccount();
                                String accTemp = temp.getAccountNumber();
                                //System.out.println(accTemp);
                                if(accTemp.equals(acc))
                                        {
                                            System.out.println("\nPlease enter the amount for deposit: ");
                                            double money = Double.parseDouble(bufferedReader.readLine());
                                            temp.deposit(money);
                                            found = true;
                                        }
                                
                            }
                            if(found == false)
                            {
                                System.err.println("\nERROR: Account was not found! Please make another selection!");
                            }
                        }
                        
                        
                        break;
                    case 4:
                        System.out.println("\nPlease Enter Your Account Number:");
                        acc=bufferedReader.readLine();
                        
                        if(numberOfCustomers == 0)
                        {
                            System.err.println("\nERROR: Account not found! Please make another selection!");
                        }
                        else
                        {
                            boolean found = false;
                            
                            for(int i = 0; i< numberOfCustomers; i++)
                            {
                                Account temp = c[i].getAccount();
                                String accTemp = temp.getAccountNumber();
                                //System.out.println(accTemp);
                                if(accTemp.equals(acc))
                                        {
                                            System.out.println("\nPlease enter the amount to withdraw: ");
                                            double money = Double.parseDouble(bufferedReader.readLine());
                                            temp.withdraw(money);
                                            found = true;
                                        }
                                
                            }
                            if(found == false)
                            {
                                System.err.println("\nERROR: Account was not found! Please make another selection!");
                            }
                        }
                        
                        break;
                    case 5:
                        
                        System.out.println("\nPlease Enter Your Account Number:");
                        acc=bufferedReader.readLine();
                        
                        if(numberOfCustomers == 0)
                        {
                            System.err.println("\nERROR: Account not found! Please make another selection!");
                        }
                        else
                        {
                            boolean found = false;
                            
                            for(int i = 0; i< numberOfCustomers; i++)
                            {
                                Account temp = c[i].getAccount();
                                String accTemp = temp.getAccountNumber();
                                //System.out.println(accTemp);
                                if(accTemp.equals(acc))
                                        {
                                            System.out.println("\nYour Current Account Balance is: $" + temp.getBalance() + "\n");
                                            found = true;
                                        }                                
                            }
                            if(found == false)
                            {
                                System.err.println("\nERROR: Account was not found! Please make another selection!");
                            }
                        }                        
                        break;
                    
                    case 6:
                        
                        System.out.println("\nPlease Enter Your Account Number:");
                        acc=bufferedReader.readLine();
                        
                        if(numberOfCustomers == 0)
                        {
                            System.err.println("\nERROR: Account not found! Please make another selection!");
                        }
                        else
                        {
                            boolean found = false;
                            
                            for(int i = 0; i< numberOfCustomers; i++)
                            {
                                Account temp = c[i].getAccount();
                                String accTemp = temp.getAccountNumber();
                                
                                if(accTemp.equals(acc))
                                        {
                                            System.out.println("\nYour New Current Account Balance after added interest is: $" + bank.calculateInterest(c[i]) + "\n");
                                            found = true;
                                        }                                
                            }
                            if(found == false)
                            {
                                System.err.println("\nERROR: Account was not found! Please make another selection!");
                            }
                        }
                        
                        
                        break;
                        
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        break;
                }

                
                
                
                //Account account = new Account(100,"A123");
                //account.deposit(50);
            
            }
            
        }
               
    }


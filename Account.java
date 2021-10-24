/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 *
 * @author Shimaa Ahmed
 */
public class Account {
    private int id;
    private double balance =5000.00;
    private double annualInterestRate ;
    private int datacreated;
    
    public Account()
    {
        
    }
    public Account (int Id,double Balance)
    {
      
      Balance=7000.00;
    }
    public void setId(int Id)
    {
        id=Id;
    }
    public int getId()
    {
        return id;
    }
    public void setBalance(double Balance)
    {
        balance=Balance;
    } 
    public double getBalance()
    {
        return balance;
    }
    public void setAnnualInterestRate( double AnnualInterestRate)
    {
        annualInterestRate=AnnualInterestRate;
    }
     public double getAnnualInterestRate( double AnnualInterestRate)
     {
         return annualInterestRate;
     }

    public int getDatacreated() {
        return datacreated;
    }
    public void getMonthlyInterestRate(double annualInterestRate)
    {
        double monthInterestRate=(balance *annualInterestRate/12)/100;
        System.out.println( monthInterestRate);
    }
    public void withdraw(double money)
    {
        double newbalance = balance+money;
        System.out.println("the newbalance is"+ newbalance);
    }
    public void deposit(double money1)
    {
        double y=balance-money1;
    }
  
    
    public static void main(String[] args) {
        
        Account c=new Account();
       // c.getAnnualInterestRate(3000.00);
       // c.getMonthlyInterestRate(2000.00);
        c.getMonthlyInterestRate(4.5);
    }
    
}

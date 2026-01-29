/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {

     String owner;
     int accountNumber;
     double balance;
     boolean isActive;

    public static int nextAccountNumber;

	int min = 50;
    int max = 1000;
    accountValue = (max - min + 1) + min;

    public BankAccount() {
        owner = "Unknown";
        balance = 0.0;
         isActive = true;
        accountNumber = nextAccountNumber++;
    }

    public BankAccount(String owner) {
        owner = o;
        balance = 0.0;
        isActive = true;
        accountNumber = nextAccountNumber++;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }
    public String toString() {
        return "Account #" + accountNumber + "Owner: " + owner + "Balance: $" + balance + "Active: " + isActive;
    }
}
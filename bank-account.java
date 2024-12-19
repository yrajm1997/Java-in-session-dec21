// src/main/java/com/javaexercises/exceptions/BankAccount.java

package com.javaexercises.exceptions;

/**
 * Exercise 2.1: Banking System
 * Implement a simple banking system with custom exceptions
 */
public class BankAccount {
    private double balance;
    private String accountNumber;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    /**
     * Withdraws money from the account
     * @throws InsufficientFundsException if balance is insufficient
     * @throws InvalidAmountException if amount is negative
     */
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    /**
     * Deposits money into the account
     * @throws InvalidAmountException if amount is negative
     */
    public void deposit(double amount) throws InvalidAmountException {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    public double getBalance() {
        return balance;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

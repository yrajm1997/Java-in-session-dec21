// src/test/java/com/javaexercises/exceptions/BankAccountTest.java

package com.javaexercises.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;
    
    @BeforeEach
    void setUp() {
        account = new BankAccount("1234", 1000.0);
    }
    
    @Test
    void testValidWithdrawal() throws InsufficientFundsException, InvalidAmountException {
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance());
    }
    
    @Test
    void testInsufficientFunds() {
        assertThrows(InsufficientFundsException.class, () -> 
            account.withdraw(1500.0)
        );
    }
    
    @Test
    void testNegativeWithdrawal() {
        assertThrows(InvalidAmountException.class, () -> 
            account.withdraw(-100.0)
        );
    }
    
    @Test
    void testValidDeposit() throws InvalidAmountException {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }
    
    @Test
    void testNegativeDeposit() {
        assertThrows(InvalidAmountException.class, () -> 
            account.deposit(-100.0)
        );
    }
}

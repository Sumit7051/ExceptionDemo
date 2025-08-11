package org.example.service;

import org.example.entity.BankAccount;
import org.example.exception.UnsufficientBalanceException;

public interface BankAccountService {
    public double checkbal(BankAccount account);
    public double withdrawlAmt(BankAccount account,double amount) throws UnsufficientBalanceException;
    public double despositAmt(BankAccount account,double amount);
}

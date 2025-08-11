package org.example.service;

import org.example.entity.BankAccount;
import org.example.exception.InsuffBal;
import org.example.exception.UnsufficientBalanceException;

public class BankAccountServiceImpl implements BankAccountService{
    @Override
    public double checkbal(BankAccount account) {
        return account.getBalance();
    }

    @Override
    public double withdrawlAmt(BankAccount account,double amount) throws UnsufficientBalanceException{
      if(account.getBalance() < amount)
      {
          try {
              throw new UnsufficientBalanceException("Kam Paisa hai janeman.... Paisa KAMAO!");
          }catch (UnsufficientBalanceException e) {
          System.out.println(e.getMsg());
          }
      }else {
          System.out.println("withdrawing...");
          account.setBalance(account.getBalance() - amount);
      }
        return account.getBalance();
    }

    @Override
    public double despositAmt(BankAccount account,double amount) throws InsuffBal {
        if(account.getBalance() > 10000)
        {
            System.out.println("Cannot desposit this amount...");
//            try {
                throw new InsuffBal("Cannot desposit this amount...");
//            }catch (InsuffBal e) {
//                System.out.println(e.getMsg());
//            }
        }else {
            account.setBalance(account.getBalance() + amount);
        }
        System.out.println("Amount deposited successfully");
        return account.getBalance();
    }
}


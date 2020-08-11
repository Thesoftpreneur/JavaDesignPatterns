package com.amberlion;

import com.amberlion.creational.builder.BankAccount;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount account = new BankAccount.Builder()
                .accountNumber(123L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(new BigDecimal("100.0"))
                .atRate(new BigDecimal("2.5"))
                .build();
        System.out.println( account.toString() );
    }
}

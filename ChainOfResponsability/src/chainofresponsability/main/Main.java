/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability.main;

import chainofresponsability.Bank;
import chainofresponsability.Bitcoin;
import chainofresponsability.PayPal;

/**
 *
 * @author usuario
 */
public class Main {
    
    public static void main(String args[]){
        Bank bank = new Bank(150);
        PayPal payPal = new PayPal(300);
        Bitcoin bitcoin = new Bitcoin(500);
        
        bank.setNext(payPal);
        payPal.setNext(bitcoin);
//        bitcoin.setNext(bank);
        
        bank.pay(100);
    }
}

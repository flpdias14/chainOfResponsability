/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Felipe Oliveira <flpdias14@gmail.com>
 */
public class PayPal extends Account{
	private int balance;

    public PayPal(int balance) {
        this.balance = balance;
    }
    
    @Override
    public int getBalance() {
    	return this.balance;
    }
    
    
}

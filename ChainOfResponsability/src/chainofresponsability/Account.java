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
public abstract class Account {

	private Account successor;
	private int balance;

    public void setNext(Account a) {
        this.successor = a;
    }

    public boolean canPay(int amount) {
        if (getBalance() >= amount) {
            return true;
        }
        return false;
    }

    public void pay(int amountToPay) {
        if (canPay(amountToPay)) {
            System.out.println("Paid $" + amountToPay + " using " + this.getClass().getSimpleName());
        } else if (getSucessor() != null) {
            System.out.println("Cannot pay using " + this.getClass().getSimpleName());
            getSucessor().pay(amountToPay);
        } else {
            System.out.println("None of the accounts have enough balance");
        }
    }
    
    public int getBalance() {
    	return this.balance;
    }
    
    public Account getSucessor() {
    	return this.successor;
    }
}

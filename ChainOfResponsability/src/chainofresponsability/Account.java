/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author usuario
 */
public abstract class Account {

	protected Account successor;
	protected int balance;

    public void setNext(Account a) {
        this.successor = a;
    }

    public boolean canPay(int amount) {
        if (this.balance >= amount) {
            return true;
        }
        return false;
    }

    public boolean existSucessor() {
        return this.successor != null;
    }

    public void pay(int amountToPay) {
        if (this.balance >= amountToPay) {
            System.out.println("Paid $" + amountToPay + " using " + this.getClass().getName());
            this.pay(amountToPay);
        } else if (this.successor != null) {
            //System.out.println(this.successor.getClass().getCanonicalName());
            System.out.println("Cannot pay using " + this.getClass().getName());
            this.successor.pay(amountToPay);
        } else {
            System.out.println("None of the accounts have enough balance");
        }
    }
}

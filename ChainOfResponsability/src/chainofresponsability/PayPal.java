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
public class PayPal extends Account{
	protected int balance;

    public PayPal(int balance) {
        this.balance = balance;
    }
}

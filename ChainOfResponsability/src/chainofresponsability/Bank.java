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
public class Bank extends Account{
    protected int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

}

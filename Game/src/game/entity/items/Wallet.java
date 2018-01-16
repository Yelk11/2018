/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.entity.items;

/**
 *  The currency of the game
 * @author Matt
 */
public class Wallet
{
    private int balance = 0;
    Wallet(int newBalance)
    {
        this.balance = newBalance;
    }
    public int getBalance()
    {
        return this.balance;
    }
    public int add(int amountToAdd)
    {
        this.balance += amountToAdd;
        return this.balance;
    }
}

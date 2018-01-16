/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;

/**
 *
 * @author Matt
 */
public class Dice
{
    private int numOfSides = 6;
    Random rand;
    public Dice()
    {
        rand = new Random();
    }
    public Dice(int newNumOfSides)
    {
        rand = new Random();
        this.numOfSides = newNumOfSides;
    }
    
    public int roll()
    {
        return rand.nextInt(numOfSides);
    }
    

}

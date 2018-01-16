/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.entity;

/**
 *
 * @author Matt
 */
public class Item extends Entity
{
    private int value = 0;
    Item(int newValue)
    {
        this.value = newValue;
    }
    Item()
    {
         
    }
}

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
public class Entity
{
    private int current_x = 0;
    private int current_y = 0;
    
    
    
    
    public void setX(int newX)
    {
        this.current_x = newX;
    }
    public void setY(int newY)
    {
        this.current_y = newY;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.map;

import game.entity.Charector;

/**
 *
 * @author Matt
 */
public class GameMap
{
    private final int GAMEMAP_MAX_X = 10;
    private final int GAMEMAP_MAX_Y = 10;
    private Room[][] gameMap = new Room[GAMEMAP_MAX_X][GAMEMAP_MAX_Y];
    private int currentX = 0;
    private int currentY = 0;
    enum direction { North, South, EAST, WEST};
    
    
    public void goTo(direction dir)
    {
        if(null != dir)
        switch (dir) {
            case North:
                goNorth();
                break;
            case EAST:
                goEast();
                break;
            case South:
                goSouth();
                break;
            case WEST:
                goWest();
                break;
            default:
                break;
        }
    }
    private void goNorth()
    {
        
    }
    private void goEast()
    {
        
    }
    private void goSouth()
    {
        
    }
    private void goWest()
    {
        
    }
    public int getX()
    {
        return currentX;
    }
    public int getY()
    {
        return currentY;
    }
    
    public void printMap()
    {
        // TODO
    }
}

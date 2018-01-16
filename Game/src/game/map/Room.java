/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.map;

import game.entity.Entity;
import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class Room
{
    private ArrayList<Entity> roomEntites = new ArrayList();
    
    
    
    public Entity getEntity(int index)
    {
        return roomEntites.get(index);
    }
    public void addEntity(Entity newEntity)
    {
        this.roomEntites.add(newEntity);
    }
}

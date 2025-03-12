import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introdua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Introdua extends World
{

    MyWorld thisGame;
    public Introdua()
    {    
        super(1100,600,1);
        addObject(new Boxtiga(), 518, 330);
        //bgm.playLoop();
        
        act();
        
        
    }
}

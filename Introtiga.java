import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introtiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Introtiga extends World
{

    /**
     * Constructor for objects of class Introtiga.
     * 
     */
    MyWorld thisGame;
    public Introtiga()
    {    
        super(1280, 720, 1);
        addObject(new Boxempat(), 640, 360);
        
        act();
        
        
    }
}

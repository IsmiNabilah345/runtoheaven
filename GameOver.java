import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public static GreenfootSound backSound = new GreenfootSound("lose.wav");
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100,600,1); 
        addObject(new TryAgain(), 1042, 50);
        addObject(new Home(), 55, 50);
        Greenfoot.playSound("lose.wav");
    }
    
    public void act() {
        /**if (Greenfoot.mouseClicked(null)) {
            MyWorld world = new MyWorld();
            world.reset(); 
            Greenfoot.setWorld(world); 
        }*/
    }
}

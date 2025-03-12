import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boxempat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boxempat extends Actor
{
    GifImage myGif = new GifImage("intro4.gif");
    /**
     * Act - do whatever the box4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;  
    public void act()
    {
    setImage(myGif.getCurrentImage());
    timer++;
    
    if (timer == 550) Greenfoot.setWorld(new Level3(MyWorld.hp));
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boxdua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boxdua extends Actor
{
    GifImage myGif = new GifImage("intro.gif");
    /**
     * Act - do whatever the Boxdua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;  
    public void act()
    {
    setImage(myGif.getCurrentImage());
    timer++;
    if (timer == 298) Greenfoot.setWorld(new MyWorld());
    }
}

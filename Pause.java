import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause extends Actor
{
    /**
     * Act - do whatever the Pause wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer;
    public void act()
    {
        if (timer>0)timer--;
        if(Greenfoot.mouseClicked(this))
        {
        timer=4222;
        
        
        }
        
        if (timer==4218)
        {
        
        getWorld().addObject(new Play(), 45, 40);
        getWorld().removeObject(this);
        }
        if (timer<4210 && timer>1)
        {
        Greenfoot.delay(10000);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 6; // Sesuaikan kecepatan sesuai kebutuhan

    public void act()
    {
        setLocation(getX() - speed, getY());

        // Add your action code here.
        if (getX() <= 0)
        {
            getWorld().removeObject(this);
        }
    }
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mainmenuhara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mainmenuhara extends Actor
{
    /**
     * Act - do whatever the Mainmenuhara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mainmenuhara(){
        GreenfootImage image = getImage();
        image.scale(1100, 600);
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        
        Greenfoot.setWorld(new Intro());
        }
    }
}

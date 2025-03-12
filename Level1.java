import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Actor
{
    /**
     * Act - do whatever the Level1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Level1()
    {
        GreenfootImage img = new GreenfootImage(100,100);
        img.setFont(img.getFont().deriveFont(20f));
        img.setColor(Color.WHITE);
        img.drawString("Level 1",20,20);
        setImage(img);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}

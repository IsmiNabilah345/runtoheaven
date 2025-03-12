import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leveltiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leveltiga extends Actor
{
    /**
     * Act - do whatever the Leveltiga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Leveltiga(int hp)
    {
        GreenfootImage img = new GreenfootImage(100,100);
        img.setFont(img.getFont().deriveFont(20f));
        img.setColor(Color.WHITE);
        img.drawString("Level 3",20,20);
        setImage(img);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}

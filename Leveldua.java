import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leveldua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leveldua extends Actor
{
    /**
     * Act - do whatever the Leveldua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Leveldua(int hp)
    {
        GreenfootImage img = new GreenfootImage(100,100);
        img.setFont(img.getFont().deriveFont(20f));
        img.setColor(Color.WHITE);
        img.drawString("Level 2",20,20);
        setImage(img);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}

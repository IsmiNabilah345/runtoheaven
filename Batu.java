import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Batu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Batu extends Actor
{
    /**
     * Act - do whatever the Batu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2; // kcpatan 
    
    public Batu() 
    { 
        GreenfootImage image = getImage(); 
        image.scale(image.getWidth(), image.getHeight()); 
        setImage(image);
        
    }
    
    public void act() 
    { 
        // Add your action code here.
        move(-speed); // biar kekiri
        if (getX() <= -getImage().getWidth() / 2) 
        { 
            getWorld().removeObject(this); //hps objek jika keluar dari layar 
        } 
    }
}

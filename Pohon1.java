import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pohon1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pohon1 extends Actor
{
    /**
     * Act - do whatever the Pohon1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2;
    public void act()
    {
        // Add your action code here.
        move(-speed); // biar kekiri
        if (getX() <= 0) 
        { 
            getWorld().removeObject(this); //hps objek jika keluar dari layar 
        } 
    }
}

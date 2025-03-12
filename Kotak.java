import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kotak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kotak extends Actor
{
    /**
     * Act - do whatever the Kotak wants to do. This method is called whenever
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

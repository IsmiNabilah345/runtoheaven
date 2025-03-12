import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulet extends Actor
{
    /**
     * Act - do whatever the Bulet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move(-5);
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}

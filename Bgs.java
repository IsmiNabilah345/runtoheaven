import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bgs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bgs extends Actor
{
    /**
     * Act - do whatever the Bgs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif = new GifImage("bgs.gif");
    public void act()
    {
        setImage(myGif.getCurrentImage());
        int bgsspeed=Greenfoot.getRandomNumber(8)-8;
    setLocation(getX()+bgsspeed, getY());
    if(getX()==0){
    getWorld().removeObject(this);
    }
    }
}

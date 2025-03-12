import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{

    //public static GreenfootSound bgm = new GreenfootSound("bgsmain.mp3");
    /**
     * Constructor for objects of class Intro.
     * 
     */
    MyWorld thisGame;
    public Intro()
    {    
        super(1100,600,1);
        addObject(new Boxdua(), 518, 330);
        //bgm.playLoop();
        
        act();
        
        
    }
    
    public void act()
    {
        //main.mainbgm.stop();
    }
}

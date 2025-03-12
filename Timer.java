import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        
    private int time;
    
    public Timer(int time)
    {
        this.time = time;
        updateImage();
    }

    public void act() 
    {
        if (time > 0)
        {
            time--;
            updateImage();
        }
        
    }    

    private void updateImage()
    {
        setImage(new GreenfootImage("your time: " + time, 24, Color.WHITE, null));
    }

    public int getTime()
    {
        return time;
    }

    public void setTime(int time)
    {
        this.time = time;
        updateImage();
    }

}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hp extends Actor
{
    /**
     * Act - do whatever the Hp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage h7 = new GreenfootImage("h7.png");
    GreenfootImage h6 = new GreenfootImage("h6.png");
    GreenfootImage h5 = new GreenfootImage("h5.png");
    GreenfootImage h4 = new GreenfootImage("h4.png");
    GreenfootImage h3 = new GreenfootImage("h3.png");
    GreenfootImage h2 = new GreenfootImage("h2.png");
    GreenfootImage h1 = new GreenfootImage("h1.png");
    MyWorld thisGame;
    public void act()
    {
        setImage(h5);
        if(thisGame.hp==7)
        {
            setImage(h7);
        }
        if(thisGame.hp==6)
        {
            setImage(h6);
        }
        if(thisGame.hp==4)
        {
            setImage(h4);
        }
        if(thisGame.hp==3)
        {
            setImage(h3);
        }
        if(thisGame.hp==2)
        {
            setImage(h2);
        }
        if(thisGame.hp==1)
        {
            setImage(h1);
        }
    }
    
    public void updateHpImage(int hp) 
    { 
        if (hp > 0 && hp <= 7) 
        { 
            setImage("h" + hp + ".png"); 
        } 
    }
}

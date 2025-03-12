import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{

    /**
     * Constructor for objects of class Main.
     * 
     */
    //public static GreenfootSound bgsmain = new GreenfootSound("bgsmain.mp3");
    MyWorld thisGame;
    private int timer7;
    //Main Mainmenu;
    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100,600,1); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {
        addObject(new Mainmenuhara(), 560, 250);
        addObject(new Jalan(), 551, 300);
        //bgsmain.playLoop();
        Ints ints = new Ints();
        addObject(ints,57,57);
        
        setPaintOrder(Back.class, Ints.class, Instruction.class,  Mainmenuhara.class, Bgs.class, Box.class);
    }
    
    public void act()
    {
    thisGame.hp=9999;
        
    if (timer7 > 0 ) timer7--;
     if (timer7 == 0)
     {
        timer7 = 50;
     }
     if ( timer7 == 1)
     {

     addObject(new Bgs(), 2000, Greenfoot.getRandomNumber(720));
     
     }
    }
}

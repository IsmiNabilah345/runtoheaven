import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinGame extends World
{

    /**
     * Constructor for objects of class WinGame.
     * 
     */
    //public static GreenfootSound bgsmain = new GreenfootSound("bgsmain.mp3");
    private GreenfootImage image1; 
    private GreenfootImage image2; 
    private GreenfootImage image3; 
    private GreenfootImage image4; 
    
    private int scrollSpeed = 8; 
    
    private int x1; 
    private int x2;
    
    private int spawnTimer = 50;
    private int spawnInterval = 50;
    
    public WinGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100,600,1); 
        image1 = new GreenfootImage("bgsone.png"); 
        image2 = new GreenfootImage("bgsone.png");
        image3 = new GreenfootImage("awan.png"); 
        image4 = new GreenfootImage("awan.png");
        //bgsmain.playLoop();
        
        x1 = 0; 
        x2 = image1.getWidth();
        
        addObject(new Hara(), 89, 481);
        addObject(new Thx(),640,360);
        
        addObject(new TryAgain(), 1042, 50);
        addObject(new Home(), 55, 50);
        spawnRandomObject();
        
        setPaintOrder(Home.class, TryAgain.class, Hara.class, Thx.class, Bulet.class, Bgs.class);
    }
    
    public void act()
    {
        bergulir();
        spawnObjects();
    }
    
    private void bergulir() 
    { 
        x1 -= scrollSpeed; 
        x2 -= scrollSpeed; 
        
        if(x1 <= -image1.getWidth()) 
        { 
            x1 = x2 + image1.getWidth(); 
        } 
        if(x2 <= -image2.getWidth()) 
        { 
            x2 = x1 + image2.getWidth(); 
        } 
        if(x1 <= -image3.getWidth()) 
        { 
            x1 = x2 + image3.getWidth(); 
        } 
        if(x2 <= -image4.getWidth()) 
        { 
            x2 = x1 + image4.getWidth(); 
        } 
        
        getBackground().clear(); 
        getBackground().drawImage(image1, x1, 0); 
        getBackground().drawImage(image2, x2, 0);
        getBackground().drawImage(image3, x1, 0);
        getBackground().drawImage(image4, x2, 0);
    }
    
    private void spawnObjects()
    {
        if (spawnTimer <= 0)
        {
            spawnRandomObject();
            spawnTimer = spawnInterval; 
        }
        else
        {
            spawnTimer--; 
        }
    }
    
    private void spawnRandomObject()
    {
        int xPosition = getWidth();
        int yPosition = Greenfoot.getRandomNumber(getHeight());
        
        int randomObject = Greenfoot.getRandomNumber(2);
        if (randomObject == 0) 
        { 
            addObject(new Bgs(), xPosition, yPosition); 
        } 
        else if (randomObject == 1) 
        { 
            addObject(new Star(), xPosition, yPosition); 
        }
    }
}

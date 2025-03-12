import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //public static GreenfootSound bgsmain = new GreenfootSound("bgsmain.mp3");
    private int objekwaktu = 250;
    private int jmlh = 0;
    
    private GreenfootImage image1; 
    private GreenfootImage image2; 
    private GreenfootImage image3; 
    private GreenfootImage image4; 
    private int scrollSpeed = 6; 
    private int x1; 
    private int x2;
    
    private int timer = 6000;
    private Timer timerDisplay;
    public static int hp=5;
    MyWorld thisGame;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100,600,1, false); 
        image1 = new GreenfootImage("bgsone.png"); 
        image2 = new GreenfootImage("bgsone.png");
        image3 = new GreenfootImage("awan.png"); 
        image4 = new GreenfootImage("awan.png");
        //bgsmain.playLoop();
        x1 = 0; 
        x2 = image1.getWidth();
        
        addObject(new Hara(), 89, 481);
        addObject(new Hp(), 130, 570);
        
        prepare();
        
        Level1 l1 = new Level1();
        addObject(l1, 545, 55);
        
        timerDisplay = new Timer(6000);
        addObject(timerDisplay, 1025, 18);
        
        addObject(new Batu(), 500, getHeight() - 85); 
        addObject(new Pohon1(), 990, getHeight() - 85);
        
        setPaintOrder(Hp.class,Level1.class,Hara.class,Bgs.class);
        reset();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        /**Pohon2 pohon2 = new Pohon2();
        addObject(pohon2,1083,370);
        Pohon3 pohon3 = new Pohon3();
        addObject(pohon3,711,382);
        Pohon2 pohon22 = new Pohon2();
        addObject(pohon22,355,372);*/
        //bgsmain.playLoop();
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
    
    public void act()
    {
        hp();
        bergulir();
        muncul();
        updateTimer();
        timerDisplay.act(); 
    }

    private void updateTimer() 
    { 
        if (timer > 0) 
        { 
            timer--; 
        } 
        else 
        { 
            check(); 
        } 
        
        if (timerDisplay.getTime() > 0) 
        { 
        timerDisplay.setTime(timerDisplay.getTime() - 1); 
        } 
        else 
        { 
            check(); 
        }
    }
    
    public void check() 
    { 
        Hara player = (Hara) getObjects(Hara.class).get(0);
        if (player != null && player.getHp() > 0) 
        { 
            int newHp = player.getHp(); 
            player.setHp(newHp);
            Greenfoot.setWorld(new Introdua()); 
        } else 
        { 
            Greenfoot.setWorld(new GameOver()); 
        } 
    }
    
    public void hp()
    {
        if(hp==0)
        {
        Greenfoot.setWorld(new GameOver());
        
        }
        if(hp>=8)
        {
            hp=7;
        }
        
    }
    
    public void reset()
    {
        hp = 6;
    }
    
    private void muncul() {
        jmlh++; 
        
        if (jmlh % objekwaktu == 0) 
        { // bikin objek baru dibawah 
            int yPosition = getHeight() - 85 + Greenfoot.getRandomNumber(30) - 15;; 
            int xPosition = getWidth() + 50; 
            int randomObject = Greenfoot.getRandomNumber(3);
            
            if (randomObject == 0) 
            { 
                addObject(new Batu(), xPosition, yPosition); 
            } 
            else if (randomObject == 1) 
            { 
                addObject(new Pohon1(), xPosition, yPosition); 
            }
            else if (randomObject == 2) 
            { 
                addObject(new Kotak(), xPosition, yPosition); 
            }
        } 
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World {

    //public static GreenfootSound bgsmain = new GreenfootSound("bgsmain.mp3");
    private int objekwaktu = 200;
    private int jmlh = 0;
    
    private GreenfootImage image1; 
    private GreenfootImage image2;
    private GreenfootImage image3; 
    private GreenfootImage image4;
    private int scrollSpeed = 8; 
    private int x1; 
    private int x2;
    
    private int timer = 5000;
    private Timer timerDisplay;

    MyWorld thisGame;
    public Level2(int hp) {
        super(1100,600,1, false);
        MyWorld.hp = hp; 
        //bgsmain.playLoop();
        
        image1 = new GreenfootImage("bgsone.png"); 
        image2 = new GreenfootImage("bgsone.png");
        image3 = new GreenfootImage("awan.png"); 
        image4 = new GreenfootImage("awan.png");
        
        x1 = 0; 
        x2 = image1.getWidth();
        
        addObject(new Hara(), 89, 481);
        addObject(new Hp(), 130, 570);
        
        prepare();
        
        Leveldua l2 = new Leveldua(MyWorld.hp);
        addObject(l2, 545, 55);
        
        timerDisplay = new Timer(5000);
        addObject(timerDisplay, 1025, 18);
        
        addObject(new Batu(), 300, getHeight() - 85); 
        addObject(new Pohon1(), 990, getHeight() - 85);
        
        setPaintOrder(Hp.class, Level2.class, Hara.class, Bgs.class, Jamur.class);
    }
    
    private void prepare() {
        
    }

    private void bergulir() {
        x1 -= scrollSpeed; 
        x2 -= scrollSpeed; 
        
        if(x1 <= -image1.getWidth()) { 
            x1 = x2 + image1.getWidth(); 
        }
        if(x2 <= -image2.getWidth()) { 
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
    
    public void act() {
        hp();
        bergulir();
        muncul();
        updateTimer();
    }

    private void updateTimer() {
        if (timer > 0) {
            timer--;
        } else {
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
    
    public void check() {
        Hara player = (Hara) getObjects(Hara.class).get(0);
        if (player != null && player.getHp() > 0) {
            int newHp = player.getHp(); 
            player.setHp(newHp);
            Greenfoot.setWorld(new Introtiga()); 
        } else {
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    public void hp() {
        if(MyWorld.hp == 0) {
            Greenfoot.setWorld(new GameOver());
        }
        if(MyWorld.hp >= 8) {
            MyWorld.hp = 7;
        }
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
                addObject(new Jamur(), xPosition, yPosition); 
            } 
            else if (randomObject == 1) 
            { 
                addObject(new Pohon1(), xPosition, yPosition); 
            }
            else if (randomObject == 2) 
            { 
                addObject(new Batu(), xPosition, yPosition); 
            }
        } 
    }
}

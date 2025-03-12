import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hara extends Actor
{
    /**
     * Act - do whatever the Hara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif = new GifImage("harabaru.gif");
    private int speed = 5; 
    private double velocityY = 0;
    private double gravity = 0.5;
    private int jumpHeight = 15; 
    //private int health = 100; 
    MyWorld thisGame;
    private boolean isJumping = false; 

    private int hp; 
    private GreenfootImage[] hpImages;
    private Hp hpDisplay;
    public Hara() 
    { 
        this.hp = 5; 
        hpImages = new GreenfootImage[7];
        
        for (int i = 0; i < hpImages.length; i++) 
        {
            hpImages[i] = new GreenfootImage("h" + (i + 1) + ".png"); 
        } 
        setImage(myGif.getCurrentImage());
    }
    
    public int getHp() 
    { 
        return hp; 
    }
    
    public void setHp(int hp) 
    { 
        this.hp = hp;
    }
    
    private void updateHpImage() 
    { 
        if (hp > 0 && hp <= hpImages.length) 
        { 
            setImage(hpImages[hp - 1]); 
        } 
        }
    
    public void act()
    {
        // Add your action code here.
        setImage(myGif.getCurrentImage());
        movement();
        applyGravity();
        hit();
    }
    
    private void movement() 
    { 
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) 
        { 
            setLocation(getX() - speed, getY()); 
        } 
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) 
        { 
            setLocation(getX() + speed, getY()); 
        } 
        /**if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) 
        { 
            setLocation(getX(), getY() - speed); 
        } 
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) 
        { 
            setLocation(getX(), getY() + speed); 
        } **/
        if (Greenfoot.isKeyDown("space") && !isJumping) 
        { 
            jump(); 
        } 
    }
    
    private void jump() { // lgika lompat 
        isJumping = true; 
        velocityY = -jumpHeight; 
        Greenfoot.playSound("jump.mp3");
    }
    
    private void applyGravity() 
    { 
        if (isJumping) 
        { 
            velocityY += gravity; 
            setLocation(getX(), getY() + (int)velocityY); 
            
            if (getY() >= getWorld().getHeight() - 85) 
            { 
                isJumping = false; velocityY = 0; 
                setLocation(getX(), getWorld().getHeight() - 114); 
            } 
        } 
    }
    
    public void hit ()
    {
        if (isTouching(Batu.class)) 
        { 
            Greenfoot.playSound("hit.mp3"); 
            thisGame.hp -= 1; 
            removeTouching(Batu.class); 
        } else if (isTouching(Pohon1.class)) 
        { 
            Greenfoot.playSound("hit.mp3"); 
            thisGame.hp -= 1; 
            removeTouching(Pohon1.class); 
        } else if (isTouching(Kotak.class)) 
        { 
            Greenfoot.playSound("hit.mp3"); 
            thisGame.hp -= 1; 
            removeTouching(Kotak.class); 
        }else if (isTouching(Jamur.class)) 
        { 
            Greenfoot.playSound("hit.mp3"); 
            thisGame.hp -= 1; 
            removeTouching(Jamur.class); 
            
            Greenfoot.delay(10); 
            setLocation(getX(), getWorld().getHeight());
            Greenfoot.delay(10);
            setLocation(getX(), 0);
            
            isJumping = true;
            velocityY = jumpHeight;
        } else if (isTouching(Star.class)) {
            Greenfoot.playSound("star.mp3"); 
            thisGame.hp += 1; 
            removeTouching(Star.class);
        } else if (isTouching(Bulet.class)) {
            Greenfoot.playSound("hit.mp3"); 
            thisGame.hp -= 1; 
            removeTouching(Bulet.class);
        }
    }
}

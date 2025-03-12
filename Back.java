import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
         getWorld().addObject(new Mainmenuhara(), 560, 250);
         getWorld().addObject(new Jalan(), 551, 300);
         getWorld().addObject(new Ints(), 57,57);
         if (!getWorld().getObjects(Hara.class).isEmpty())
        {
            getWorld().removeObjects(getWorld().getObjects(Hara.class));
        }
         if (!getWorld().getObjects(Instruction.class).isEmpty())
        {
            getWorld().removeObjects(getWorld().getObjects(Instruction.class));
        }
         getWorld().removeObject(this);
        }
    }
}


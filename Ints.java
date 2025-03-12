import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ints extends Actor
{
    /**
     * Act - do whatever the Ints wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
         getWorld().addObject(new Instruction(), 555, 300);
         getWorld().addObject(new Back(), 57,57);
        
         if (!getWorld().getObjects(Mainmenuhara.class).isEmpty())
        {
            getWorld().removeObjects(getWorld().getObjects(Mainmenuhara.class));
            getWorld().removeObjects(getWorld().getObjects(Jalan.class));
        }
         getWorld().removeObject(this);
        }
    }
}

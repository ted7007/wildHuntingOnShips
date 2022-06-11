import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heal extends Actor
{
    protected int plusHp;
    
    public Heal(int plusHp)
    {
        this.plusHp = plusHp;
    }
    
    public void act()
    {
        TouchMainHero();
    }
    
    public void TouchMainHero()
    {
        if (isTouching(MainHero.class))
        {
            var Hero = (MainHero)getOneIntersectingObject(MainHero.class);
            Hero.plusHp(plusHp);
            getWorld().removeObject(this);
        }
    } 
}


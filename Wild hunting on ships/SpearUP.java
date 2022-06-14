import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpearUP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpearUP extends Actor
{
    protected int SpearUP;
    
    public SpearUP(int SpearUP)
    {
        this.SpearUP = SpearUP;
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
            Hero.SpearUpdate(SpearUP);
            getWorld().removeObject(this);
        }
    } 
}

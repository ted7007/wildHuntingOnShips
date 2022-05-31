import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Semen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semen extends bullet
{
    public Semen(int targetX, int targetY, int velocity, int damage, boolean damagePlayer)
    {
        super(targetX,targetY,velocity,damage, damagePlayer);
    }
    
    public void CheckGetTarget()
    {
        if (!isTouching(MainHero.class) && !isGotPoint() && !isAtEdge())
            return;
        else if (isTouching(MainHero.class))
        {
            
            var enemy = (MainHero)getOneIntersectingObject(MainHero.class);
            Hurt(enemy);
            Destroy();
            return;
        }
        else if (isGotPoint() || isAtEdge())
            Destroy();
    }
    
    public void GoToTarget()
    {
        turnTowards(targetX,targetY);
        move(velocity);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spear extends bullet
{

    public Spear(int targetX, int targetY, int velocity, int damage, boolean damagePlayer)
    {
        super(targetX,targetY,velocity,damage,damagePlayer);
    }
    
    public void act()
    {
        GoToTarget();
        CheckGetTarget();
        // Add your action code here.
    }
    
    public void GoToTarget()
    {
        turnTowards(targetX, targetY);
        move(velocity);
        
        
    }
    
    public void CheckGetTarget()
    {
        if (!isTouching(Boss.class) && !isGotPoint() && !isAtEdge())
            return;
        else if (isTouching(Boss.class))
        {
            
            var enemy = (Boss)getOneIntersectingObject(Boss.class);
            Hurt(enemy);
            Destroy();
            return;
        }
        else if (isGotPoint() || isAtEdge())
            Destroy();

    }
   
    
}

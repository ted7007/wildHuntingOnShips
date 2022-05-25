import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spear extends Actor
{
    /**
     * Act - do whatever the Spear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int TargetX;
    private int TargetY;
    private int Damage;
    private int Velocity;
    private boolean GotTarget;
    
    public Spear(int targetX, int targetY, int velocity, int damage)
    {
        TargetX = targetX;
        TargetY = targetY;
        Velocity = velocity;
        Damage = damage;
        GotTarget = false;
    }
    
    public void act()
    {
        GoToTarget();
        CheckGetTarget();
        // Add your action code here.
    }
    
    public void GoToTarget()
    {
        turnTowards(TargetX, TargetY);
        move(Velocity);
        
        
    }
    
    public void CheckGetTarget()
    {
        if (!isTouching(Savage.class) && !isGotPoint() && !isAtEdge())
            return;
<<<<<<< HEAD
        else if (isTouching(Enemy.class))
        {
            
            var enemy = (Enemy)getOneIntersectingObject(Enemy.class);
=======
        else if (isTouching(enemy.class))
        {
            
            var enemy = (enemy)getOneIntersectingObject(enemy.class);
>>>>>>> e4df7943f36226bdd5e42f1f221310eaf3395ca6
            Hurt(enemy);
            Destroy();
            return;
        }
        else if (isGotPoint() || isAtEdge())
            Destroy();

    }
    
    public boolean isGotPoint()
    {
        int plusMinus = 10;
        if(((getX() < TargetX+plusMinus) && (getX() > TargetX-plusMinus) &&(getY() < TargetY+plusMinus)&& (getY() > TargetY-plusMinus)))
            return true;
        return false;
    }
    
<<<<<<< HEAD
    private void Hurt(Enemy enemy)
=======
    private void Hurt(enemy enemy)
>>>>>>> e4df7943f36226bdd5e42f1f221310eaf3395ca6
    {
        if (enemy != null)
           enemy.minusHP(Damage);
    }
    
    private void Destroy()
    {
        getWorld().removeObject(this);
    }
    
}

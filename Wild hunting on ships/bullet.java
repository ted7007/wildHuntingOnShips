import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class bullet<A> extends Actor
{

    protected int targetX;
    protected int targetY;
    protected int damage;
    protected int velocity;
    protected boolean gotTarget;
    protected boolean damagePlayer;
    
    public bullet(int targetX, int targetY, int velocity, int damage, boolean damagePlayer)
    {
        this.targetX = targetX;
        this.targetY = targetY;
        this.velocity = velocity;
        this.damage = damage;
        this.gotTarget = false;
        this.damagePlayer = damagePlayer;
    }
    
    public void act()
    {
        GoToTarget();
        CheckGetTarget();
        // Add your action code here.
    }
    
    public abstract void GoToTarget();
    
    public abstract void CheckGetTarget();
    
    public boolean isGotPoint()
    {
        int plusMinus = 10;
        if(((getX() < targetX+plusMinus) && (getX() > targetX-plusMinus)
        && (getY() < targetY+plusMinus) && (getY() > targetY-plusMinus)))
            return true;
        return false;
    }
    
    protected void Hurt(ILiveable target)
    {
        if (target == null)
            return;
        //if (target instanceof MainHero && damagePlayer == true)
          //  return;
        target.minusHp(damage);
    }
    
    protected void Destroy()
    {
        getWorld().removeObject(this);
    }
}

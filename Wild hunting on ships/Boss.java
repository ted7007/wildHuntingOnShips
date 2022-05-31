import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Boss extends Actor implements ILiveable
{
    private int hp;
    
    protected int velocity;
    
    protected int defaultDamage;
    
    protected int bulletVelocity;
    
    public Boss(int hp, int velocity, int defaultDamage, int bulletVelocity)
    {
        this.hp = hp; this.velocity = velocity; this.defaultDamage = defaultDamage; this.bulletVelocity = bulletVelocity;
    }
    
    public void minusHp(int damage)
    {
    
        hp = hp - damage;
        if (hp <= 0) 
        {
            Destroy();
        }  
    }
    
    private void Destroy()
    {
        getWorld().removeObject(this);
    }

}

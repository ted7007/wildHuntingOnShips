import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Savage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Savage extends Actor implements ILiveable
{
    protected int Hp;
    
    protected int Velocity;
    
    protected int SpearVelocity;
    
    protected int SpearDamage;
    
    protected int SpearCount;
    public Savage(int hp, int velocity)
    {
        Hp = hp;
        Velocity = velocity;
        SpearVelocity = 7; SpearDamage = 34; SpearCount = 10;
    }
    /**
     * Act - do whatever the Savage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public int getHp() {return Hp; }
    
    
    public void minusHp(int damage)
    {
    
        Hp = Hp - damage;
        if (Hp <= 0) 
        {
            getWorld().removeObject(this);
        }  
    }
    public void MoveTo(int x, int y)
    {
        turnTowards(x,y);
        
    }
    
    public void Shot(int targetX, int targetY)
    {
        if(SpearCount > 0)
        {
            getWorld().addObject(new Spear(targetX,targetY,SpearVelocity,SpearDamage, false),getX(),getY());
            SpearCount = SpearCount - 1;
        }
    }
}

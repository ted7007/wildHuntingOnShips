import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Savage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Savage extends Actor
{
    private int HP;
    
    protected int Velocity;
    
<<<<<<< HEAD
    protected int SpearVelocity;
    
    protected int SpearDamage;
    
=======
>>>>>>> e4df7943f36226bdd5e42f1f221310eaf3395ca6
    public Savage(int hp, int velocity)
    {
        HP = hp;
        Velocity = velocity;
<<<<<<< HEAD
        SpearVelocity = 7; SpearDamage = 34;
=======
>>>>>>> e4df7943f36226bdd5e42f1f221310eaf3395ca6
    }
    /**
     * Act - do whatever the Savage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public int getHP() {return HP; }
    
    
    public void minusHP(int damage)
    {
    
        HP = HP - damage;
        if (HP <= 0) 
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
<<<<<<< HEAD
        getWorld().addObject(new Spear(targetX,targetY,SpearVelocity,SpearDamage),getX(),getY());
=======
        getWorld().addObject(new Spear(targetX,targetY,10,10),getX(),getY());
>>>>>>> e4df7943f36226bdd5e42f1f221310eaf3395ca6
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainHero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainHero extends Savage
{
    /**
     * Act - do whatever the MainHero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int cdShot;
    public int heal = 15;
    public int SpearUP = 10;
    
    public void act()
    {
        checkMove();
        checkShot();
        Hpcheck();
        SpearCheak();
    }
    
    public MainHero(int hp, int velocity) 
    {
        super(hp,velocity);
    }
    
    public void checkMove()
    {
         if(Greenfoot.isKeyDown("left"))
        {
            turn(Velocity/-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(Velocity/3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(Velocity);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-Velocity);
        }
    }
    
    public void checkShot()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(mouse == null)
            return;
        cdShot--;
        
        if(mouse.getButton() == 1 && cdShot <= 0)
        {
            cdShot=30;
            Shot(mouse.getX(), mouse.getY());
        }
        
    }
    
    @Override
    public void minusHp(int damage)
    {
        Hp = Hp - damage;
        if (Hp <= 0) 
        {
            Greenfoot.stop();
        }  
    }
    
    public void plusHp(int heal)
    {
        Hp = Hp + heal;
        /*if (isTouching(heal.class))
        {
            Hp = Hp + heal;
            Actor heal = getOneIntersectingObject(heal.class);
            getWorld().removeObject(heal);
        }*/
    }
    
    public void SpearUpdate(int SpearUP)
    {
        SpearCount = SpearCount + SpearUP;
    }
    
    public void Hpcheck()
    {
        getWorld().showText("hp:" + Hp,50,50);
    }
     public void SpearCheak()
    {
        getWorld().showText("spear:"+ SpearCount,50,70);
    }
}

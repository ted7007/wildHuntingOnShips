import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class BossCock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossCock extends Boss
{
    ArrayList<Target> targets;
    int countTargets;
    int currentTarget;
    boolean targetExists;
    int defaultCd;
    int currentCd;
    
    public BossCock(int hp,int velocity, int defaultDamage, int bulletVelocity, int defaultCd)
    {
        super(hp,velocity,defaultDamage,bulletVelocity);
        targets = Target.Targets;
        countTargets = targets.size();
        currentTarget = -1;
        this.defaultCd = defaultCd;
        currentCd = 0;
        if (countTargets == 0)
            targetExists = false;
        else
        {
            currentTarget = 0;
        }
        
    }
    
    /**
     * Act - do whatever the BossCock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(gotTarget(currentTarget))
            currentTarget++;
        if (currentTarget >= countTargets)
            currentTarget = 0;
        goToTarget(currentTarget);
        
        ShotOnPlayer();
        // Add your action code here.
    }
    
    void goToTarget(int index)
    {
        int targetX = targets.get(index).getX();
        int targetY = targets.get(index).getY();
        turnTowards(targetX, targetY);
        move(super.velocity);
    }
    
    boolean gotTarget(int index)
    {
        int plusMinus = 5;
        int targetX = targets.get(index).getX();
        int targetY = targets.get(index).getY();
        if(((getX() < targetX+plusMinus) && (getX() > targetX-plusMinus)
        && (getY() < targetY+plusMinus) && (getY() > targetY-plusMinus)))
            return true;
        return false;
    }
    
    void ShotOnPlayer()
    {
        if (currentCd < defaultCd)
        {
            currentCd++;
            return;
        }
        MainHero player = getWorld().getObjects(MainHero.class).get(0);
        currentCd = 0;
        getWorld().addObject(new Semen(player.getX(),player.getY(),bulletVelocity,defaultDamage,true),getX(),getY());
    }
    
}

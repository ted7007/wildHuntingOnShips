import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1200, 700, 1);
        prepare();
        }
    
    private void prepare()
    {
        addObject(new MainHero(100,3), 100, 100);
        addObject(new heal(20), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(700));
        addObject(new SpearUP(10), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(700));
        spawnEnemies();
    }

    private void spawnEnemies()
    {
        Target target = new Target();
        addObject(target,364,545);
        Target target2 = new Target();
        addObject(target2,832,540);
        Target target3 = new Target();
        addObject(target3,886,286);
        BossCock bossCock = new BossCock(50, 4, 15, 3,60);
        addObject(bossCock,636,424);
        //Enemy enemy = new Enemy(100, 3);
        
        //addObject(enemy, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
    }
     
}

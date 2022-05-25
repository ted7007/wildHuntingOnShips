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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
<<<<<<< HEAD
        prepare();
        spawnEnemies();
=======

        addObject(new MainHero(100,3), 100, 100);
        addObject(new enemy(100,3), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        addObject(new enemy(100,3), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        addObject(new enemy(100,3), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        prepare();
>>>>>>> e4df7943f36226bdd5e42f1f221310eaf3395ca6
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
<<<<<<< HEAD
        addObject(new MainHero(100,3), 100, 100);
    }
    private void spawnEnemies()
    {
        Enemy enemy = new Enemy(100, 3);
        
        addObject(enemy, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        
=======
>>>>>>> e4df7943f36226bdd5e42f1f221310eaf3395ca6
    }
}

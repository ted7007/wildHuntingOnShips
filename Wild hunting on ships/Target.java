import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    static ArrayList<Target> Targets;
    
    static
    {
        Targets = new ArrayList<Target>();
    }
    /**
     * Act - do whatever the target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Target()
    {
        Targets.add(this);
    }
    public void act()
    {
        // Add your action code here.
    }
}

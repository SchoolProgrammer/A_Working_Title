/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import javax.swing.*;
import sun.awt.resources.awt;

/**
 *
 * @author arya
 */
public class Main extends JFrame implements Runnable, KeyListener
{
    private final int WIDTH = 640;
    private final int HEIGHT = 480;
    Thread gameloop;
    int keyCode;
    char keyChar;
    String allKeys = ""; 
    
    BufferedImage doubleBuffer;//Overcomes flicker
    Graphics2D doubleBufferG2D;
    
    public static Main instance = null;//Only need 1 display surface
    
    private Main()
    {
        super(); //Creates a invislbe JFrame
        //Next line defines frame properties
        this.setSize(this.WIDTH, this.HEIGHT);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.doubleBuffer = new BufferedImage(this.WIDTH, this.HEIGHT, BufferedImage.TYPE_INT_RGB);
        this.doubleBufferG2D = (Graphics2D) doubleBuffer.createGraphics();
    }
    public static Main getInstance ()
    {
        if (instance == null)
        {
            instance = new Main();
        }
        return instance;
    }
//    @Override
//    public void update(Graphics g)
//    {
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setColor(Color.red);
//        g2d.fillRect(0, 0, 50, 50);
//    }
    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g; //Gets the grahics object to draw on 
        //Deletes everything off background
 /*       g2d.setColor(g2d.getBackground());
        g2d.fillRect(0, 0, instance.WIDTH, instance.HEIGHT);
        g2d.setColor(Color.red);
        g2d.fillRect(0, 0, 50, 50);
        
        g2d.drawString("Key Code: " + keyCode, 20, 90);
        g2d.drawString("Key Code: " + keyChar, 20, 110);
        g2d.drawString(allKeys, 20, 130);
*/        
        //Draws what we need on the backbuffer
        instance.paintToBackbuffer();
        g2d.drawImage(doubleBuffer, null, 0, 0);//Let's the backbuffer draw into the screen
        
    }
    private void paintToBackbuffer()//Paints to backbuffer first to eliminate flicker
    {
        //Backbuffer version of drawing
        instance.doubleBufferG2D.setColor(Color.WHITE);
        instance.doubleBufferG2D.fillRect(0, 0, instance.WIDTH, instance.HEIGHT);
        instance.doubleBufferG2D.setColor(Color.red);//Causes flickering
        instance.doubleBufferG2D.fillRect(0, 0, 50, 50);
        
        //Displays keys on screen
        instance.doubleBufferG2D.drawString("Key Code: " + keyCode, 20, 90);
        instance.doubleBufferG2D.drawString("Key char: " + keyChar, 20, 110);
        instance.doubleBufferG2D.drawString(allKeys, 20, 130);
        
    }
    public void run()
    {
        Thread current = Thread.currentThread();
        while (current == gameloop)
        {
            try
            {
                Thread.sleep(5);
            }
            catch (InterruptedException e)
            {
                //Do nothing
                e.printStackTrace();
            }
            //updateGame();
            //System.out.println("I'm running: " + System.currentTimeMillis());
            repaint(); //Draws on screen
        }
    }
    public void start ()
    {
        addKeyListener(this);//Starts listening for key events
        gameloop = new Thread(this);
        gameloop.start(); 
    }
    public void keyTyped (KeyEvent e)//Method for keys is useful for stuff like chats
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        keyChar = e.getKeyChar();
        allKeys += keyChar;
        repaint(); // Runs the paint() method
    }
    public void keyPressed (KeyEvent e)//Provides keycodes (like VK_LEFT (left arrow)) 
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        keyCode = e.getKeyCode();
        keyChar = ' ';//Empty since not the method to see keyChars, it's looked at it in keyTyped()
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            allKeys = ""; //Clear that line on enter
        }
        repaint();//Run the paint() method
    }
    public void keyReleased (KeyEvent e)//Not used
    {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    //Creates Sprites for game with initial positions
    public void intializeSprites()
    {
        //Sprite test = new Sprite(width, height, instance.doubleBuffer);
        //test.loadSpriteImage("NFS.jpg");
        //instance.addSprite(test);
        Sprites animeGirl = new Sprites(200, 200, instance.doubleBuffer);
        animeGirl.loadSpriteImage("alice20chan_anime.gif");
        animeGirl.setSpriteXPosition(230);
        animeGirl.setSpriteYPosition(140);
        //instance.addSprite(animeGirl);
        Sprites animeGuy = new Sprites(200, 200, instance.doubleBuffer);
        animeGuy.loadSpriteImage("jojo_sprite.png");
        animeGuy.setSpriteXPosition(150);
        animeGuy.setSpriteYPosition(170);
        //instance.addSprite(animeGuy);
    }
}


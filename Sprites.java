/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author arya
 */
import java.applet.Applet;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Sprites 
{
    private Image spriteImage;//Properties and image for sprite
    private Graphics2D spriteImageG2D;//Graphics object for sprite
    //Positioning of Sprite via AffineTransform, position variables are doubles
    //Pixel coordinates are ints
    private double spriteXPosition;
    private double spriteYPosition;
    private int spriteHeight;
    private int spriteWidth;
    
    private AffineTransform spriteTransform;//Matrix to do geometric transformations
    
    BufferedImage spriteDoubleBuffer;//Double buffer for Sprite object draws itself on 
    Graphics2D spriteDoubleBufferG2D;//Double buffer's graphics context
    
    public Sprites (int width, int height, BufferedImage doubleBuffer)
    {
        //Position is set via setters
        this.spriteXPosition = 0;
        this.spriteYPosition = 0;
        this.spriteWidth = width;
        this.spriteHeight = height;
        this.spriteDoubleBufferG2D = (Graphics2D) doubleBuffer.getGraphics();
        this.spriteTransform = new AffineTransform();
        //this.spriteImageG2D = (Graphics2D)this.spriteImage.getGraphics(); <-- Try that
        
    }
    //Getters and Setters
    public Graphics2D setSpriteDoubleBufferG2D (Graphics2D spriteDoubleBufferG2D)
    {
        return spriteDoubleBufferG2D;
    }
/*    public void setSpriteDoubleBufferG2D (Graphics2D spriteDoubleBufferG2D)
    {
        this.spriteDoubleBufferG2D = spriteDoubleBufferG2D;
    }
*/
    //Translates matrix for sprite based on x and y coordinates, moves the right way
    public void transform()
    {
        this.spriteTransform.setToIdentity();//Resets transfm to the identity transform
        //Translate based off of x and y and dimensions of image
        this.spriteTransform.translate((int)this.getSpriteXPosition(), (int)this.getSpriteYPosition());
    }
    public void draw()//Draws sprite, based on image object and affinetransform for location/transformation
    //operates taht have been done to it on backbuffer, draws according to location
    {
        this.transform();
        //ImageObserver? Either backbuffer of JFrame?
        //this.spriteDoubleBufferG2D.drawImage(this.getSpriteImage(), spriteTransform, null);
        this.spriteDoubleBufferG2D.drawImage(this.getSpriteImage(), spriteTransform, Main.getInstance());
        //this.spriteDoubleBufferG2D.drawImage(spriteImage, 0, 0, null);
    }
    //Loads the specific image from Spirtes folder of project, method uses Toolkit's createImage(),
    //can only load .gif, .jpg, or .png
    public void loadSpriteImage(String name)// name is the full name of the image, including extensionf
    { 
        this.setSpriteImage(Toolkit.getDefaultToolkit().getImage("/src/Sprites/" + name));
    }
    public Image getSpriteImage()
    {
        return spriteImage;
    }
    public void setSpriteImage(Image spriteImage)
    {
       this.spriteImage = spriteImage; 
    }
    public Graphics2D getSpriteImageG2D()
    {
        return spriteImageG2D;
    }
    public void setSpriteImageG2D(Graphics2D spriteImageG2D)
    {
        this.spriteImageG2D = spriteImageG2D;
    }
    //----------------------------------------------------------
    public int getSpriteHeight()
    {
        return spriteHeight;
    }
    public void setSpriteHeight(int spriteHeight)
    {
        this.spriteHeight = spriteHeight;
    }
    public int getSpriteWidth()
    {
        return spriteWidth;
    }
    public void setSpriteWidth(int spriteWidth)
    {
        this.spriteWidth = spriteWidth;
    }
    public double getSpriteXPosition()
    {
        return spriteXPosition;
    }
    public void setSpriteXPosition(double spriteXPosition)
    {
        this.spriteXPosition = spriteXPosition;
    }
    public double getSpriteYPosition()
    {
        return spriteYPosition;
    }
    public void setSpriteYPosition(double spriteYPosition)
    {
        this.spriteYPosition = spriteYPosition;
    }
}

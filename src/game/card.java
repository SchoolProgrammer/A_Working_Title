/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.*;


public class card {
    private int value;
    private ImageIcon card;
    private boolean used;
    
    public void setImage(ImageIcon face) {
        card = face;
    }
    
    public ImageIcon getImage() {
        return card;
    }
    
    public void setValue(int points) {
        value = points;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setUsed() {
        used = true;
    }
    
    public void setUnused() {
        used = false;
    }
    
    public boolean getUsed() {
        return used;
    }
    
}

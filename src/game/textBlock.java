/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Will
 */
public class textBlock extends JFrame {
    
    public textBlock(String words, JButton next) {
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setPreferredSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        
        JLabel text = new JLabel();
        text.setFont(new java.awt.Font("Comic Sans", 0, 48));
        text.setText(words);
        
        p.add(text, BorderLayout.CENTER);
        
        p.add(next, BorderLayout.SOUTH);
        
        setVisible(true);
        
    }
    
    
}

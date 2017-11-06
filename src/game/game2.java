package game;

import javax.swing.JFrame;

/**
 *
 * @author Will
 */

public class game2 {
    public static void main(String[] args) {
        fight f = new fight(100, 100);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        f.setVisible(true);
    }
}
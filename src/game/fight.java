/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import javax.swing.JFrame;
/**
 *
 * @author Carey
 */
public class fight extends javax.swing.JFrame {

    /**
     * Creates new form fight
     */
    public fight(int h, int y, int r) {
        hisHealth = h;
        yourHealth = y;
        result = r;
        
        if (r == 2 || r== 6 || r == 7) {
            hisHealth = hisHealth - 33;
        } else if (r == 3 || r== 4 || r == 8) {
            yourHealth = yourHealth - 33;
        }
        
        if (yourHealth == 1) {
            fightLost lose = new fightLost();
            setVisible(false);
            lose.setResizable(false);
            lose.setVisible(true);
        } else if (hisHealth == 1) {
            fightWin win = new fightWin();
            setVisible(false);
            win.setResizable(false);
            win.setVisible(true);
        } else {

        
            Random random = new Random();
            AIMove = random.nextInt(2);
        
            initComponents();
            setResizable(false);
            setVisible(true);
        }
        
                
    }

    /**
     * RESULTS LIST
     * -1: New Game
     *  1: I throw Punch, He throws Punch
     *  2: I throw Punch, He throws Dodge
     *  3: I throw Punch, He throws Kick
     *  4: I throw Dodge, He throws Punch
     *  5: I throw Dodge, He throws Dodge
     *  6: I throw Dodge, He throws Kick
     *  7: I throw Kick, He throws Punch
     *  8: I throw Kick, He throws Dodge
     *  9: I throw Kick, He throws Kick
     * 
     * Punch beats Dodge
     * Dodge beats Kick
     * Kick beats Punch
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/T-Dog.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        String text = "Prepare to Fight";
        
        if (result == 1) {
            text = "You both punch, and your fists collide in mid air";
        } else if (result == 2) {
            text = "He tries to dodge, but you punch him anyway";
        } else if (result == 3) {
            text = "You try to punch him, but he kicks you";
        } else if (result == 4) {
            text = "You try to dodge, but he punches you anyway";
        } else if (result == 5) {
            text = "You both dodge, doing nothing";
        } else if (result == 6) {
            text = "He kicks but you dodge, leaving him open to a punch";
        } else if (result == 7) {
            text = "He tries to punch you, but you kick him";
        } else if (result == 8) {
            text = "You kick but he dodges, leaving you open to a punch";
        } else if (result == 9) {
            text = "You both kick, and your feet collide in mid air";
        } 
       
        
        jLabel2.setText(text);
        jLabel2.setToolTipText("");

        jButton1.setText("PUNCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DODGE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("KICK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Your Health: " + yourHealth);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("His Health: " + hisHealth);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (AIMove == 0) {
            fight f = new fight(hisHealth, yourHealth, 1);
        }
        if (AIMove == 1) {
            fight f = new fight(hisHealth, yourHealth, 2);
        }
        if (AIMove == 2) {
            fight f = new fight(hisHealth, yourHealth, 3);
        }
        setVisible(false);
    }  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (AIMove == 0) {
            fight f = new fight(hisHealth, yourHealth, 4);
        }
        if (AIMove == 1) {
            fight f = new fight(hisHealth, yourHealth, 5);
        }
        if (AIMove == 2) {
            fight f = new fight(hisHealth, yourHealth, 6);
        }
        setVisible(false);
    }  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (AIMove == 0) {
            fight f = new fight(hisHealth, yourHealth, 7);
        }
        if (AIMove == 1) {
            fight f = new fight(hisHealth, yourHealth, 8);
        }
        if (AIMove == 2) {
            fight f = new fight(hisHealth, yourHealth, 9);
        }
        setVisible(false);
    }  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fight(hisHealth,yourHealth,result).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify    
    private static int hisHealth;
    private static int yourHealth;
    private static int hisMove;
    private static int AIMove;
    private static int result;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo3d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jayant
 */

public class Game extends javax.swing.JFrame implements MouseListener,ActionListener {

    /**
     * Creates new form Game
     */
    static String playerO="Player 1",playerX="Player 2";
    String []winnerOfFace;      //shows facewinner name;
    String currentPlayer;
    String winner="NOT DECIDED";
    JButton[] jb ;
    int value[];
    boolean isO;
    boolean gameOver;
    ImageIcon imgO,imgX,imgNull;
    int[][][] d3;
    int[] faceWin;
    int faceNumber[][];
    int[] decideDraw;
    int draw;
    int winsOfX, winsOfO;
    static JFrame frame;
    
    public Game(String player1 ,String player2) {
        
     //   setContentPane(new JLabel(new ImageIcon("title.png")));
        initComponents();
        
        
       // playerO = "Player 1";
       // playerX = "Player 2";
       
        playerO=player1;
        playerX= player2;
        
        initLabels();
        currentPlayer = playerO + ": O";
        winnerOfFace = new String[7];
        jb = new JButton[63];
        value = new int[63];
        faceWin = new int[7];
        faceNumber = new int[27][];
        winsOfX = 0;
        winsOfO = 0;
        decideDraw = new int[7];
        for(int i=0 ;i<63 ;i++){
            value[i]=0;
        }
        
        isO=true;
        gameOver = false;
        
        imgO=new ImageIcon("o.png");
        imgX=new ImageIcon("x.png");
        imgNull=new ImageIcon("null.png");
        
        /*
        JLabel background = new JLabel(new ImageIcon("title.png"));
        background.setLayout( new BorderLayout() );
        setContentPane( background );*/
        int count=0;
        for(int i=0 ; i<9;i++){
            jb[count] = new JButton();
            jPanel1.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel2.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel3.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel4.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel5.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel6.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel7.add(jb[count]);
            count++;
        }
        jButton1.addActionListener(this);
       
          
        for(int i=0 ;i<63 ;i++){
          //  jb[i].setIcon(imgNull);
            jb[i].addMouseListener(this);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3D Tic Tac Toe");
        setBackground(new java.awt.Color(204, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1800, 960));
        setSize(new java.awt.Dimension(1800, 960));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jPanel1.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jLabel17.setText("jLabel17");

        jPanel2.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        jPanel3.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel3.setLayout(new java.awt.GridLayout(3, 3));

        jPanel4.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel4.setLayout(new java.awt.GridLayout(3, 3));

        jPanel5.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel5.setLayout(new java.awt.GridLayout(3, 3));

        jPanel6.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel6.setLayout(new java.awt.GridLayout(3, 3));

        jPanel7.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel7.setLayout(new java.awt.GridLayout(3, 3));

        jPanel8.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel18.setText("jLabel18");

        jLabel19.setText("jLabel19");

        jLabel20.setText("jLabel20");

        jLabel21.setText("jLabel21");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addGap(40, 40, 40))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(52, 52, 52)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel14)))
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(257, 257, 257)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(257, 257, 257)
                                        .addComponent(jLabel4)))
                                .addGap(249, 249, 249)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(250, 250, 250)
                                        .addComponent(jLabel12)
                                        .addGap(19, 19, 19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(235, 235, 235)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(236, 236, 236)
                                        .addComponent(jLabel17)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(742, 742, 742)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel17))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
                
            }
        });
        
    }
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
    public void initLabels(){
        jLabel2.setText("TOP");
        jLabel3.setText("MIDDLE");
        jLabel4.setText("BOTTOM");
        jLabel5.setText("SCORE");
        jLabel10.setText("BACK");
        jLabel11.setText("LEFT");
        jLabel12.setText("FRONT");
        jLabel13.setText("RIGHT");
        jLabel18.setText(playerO);
        jLabel20.setText(playerX);
        
        jLabel1.setText("");
        jLabel6.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel14.setText("");
        jLabel15.setText("");
        jLabel16.setText("");
        jLabel17.setText("");
        jLabel19.setText("0");
        jLabel21.setText("0");
        
        jLabel1.setFont(new Font("Aerial", Font.PLAIN, 20));
        
        
    }
    
    public void update(int i){
        switch(i){
            case 0:
                value[27]=value[i];
                value[38]=value[i];
                break;
            case 1:
                value[28]=value[i];
                break;
            case 2:
                value[29]=value[i];
                value[54]=value[i];
                break;
            case 3:
                value[37]=value[i];
                break;
            case 4:
                break;
            case 5:
                value[55]=value[i];
                
                break;
            case 6:
                value[47]=value[i];
                value[36]=value[i];
                break;
            case 7:
                value[46]=value[i];
                break;
            case 8:
                value[45]=value[i];
                value[56]=value[i];
                break;
            case 9:
                value[30]=value[i];
                value[41]=value[i];
                break;
            case 10:
                value[31]=value[i];
                break;
            case 11:
                value[32]=value[i];
                value[57]=value[i];
                break;
            case 12:
                value[40]=value[i];
                break;
            case 13:
                break;
            case 14:
                value[58]=value[i];
                break;
            case 15:
                value[39]=value[i];
                value[50]=value[i];
                break;
            case 16:
                value[49]=value[i];
                break;
            case 17:
                value[48]=value[i];
                value[59]=value[i];
                break;
            case 18:
                value[33]=value[i];
                value[44]=value[i];
                break;
            case 19:
                value[34]=value[i];
                break;
            case 20:
                value[35]=value[i];
                value[60]=value[i];
                break;
            case 21:
                value[43]=value[i];
                break;
            case 22:
                break;
            case 23:
                value[61]=value[i];
                break;
            case 24:
                value[42]=value[i];
                value[53]=value[i];
                break;
            case 25:
                value[52]=value[i];
                break;
            case 26:
                value[51]=value[i];
                value[62]=value[i];
                break;
        }
        
        
    }
    

    public void paint3D() {
    	for(int i=27 ; i<63 ;i++) {
    		if(value[i]==1) {
    			jb[i].setIcon(imgO);
    		}
    		if(value[i]==2) {
    			jb[i].setIcon(imgX);
    		}
    	}
    }
    
    public void faceWinner(int[] facenos) {
    	for(int faceno :facenos) {
            boolean noWinner = true;
	    	int t = faceno*9;
	    	if(faceWin[faceno]==0) {
                        decideDraw[faceno]++;
		    	for(int i=0 ;i<3 && noWinner; i++) {
		    		if(value[t]==value[t+3]&& value[t+3]==value[t+6] ) {
		    			faceWin[faceno]=value[t];
                                        noWinner = false;
                                        continue;
		    		}
		    		t++;
		    	}
                        if(noWinner) {
                            t = faceno*9;
                            for(int i=0 ;i<3 && noWinner; i++) {
		    		if(value[t]==value[t+1]&& value[t+1]==value[t+2] ) {
		    			faceWin[faceno]=value[t];
                                        noWinner = false;
                                        continue;
		    		}
		    		t+=3;
                            }
                        }
                        if(noWinner) {
                            t = faceno*9;
                            if(value[t]==value[t+4]&& value[t+4]==value[t+8]) {
                                    faceWin[faceno]=value[t];
                                    noWinner = false;
                            }
                            if(value[t+2]==value[t+4]&& value[t+4]==value[t+6] && noWinner) {
                                    faceWin[faceno]=value[t];
                                    noWinner = false;
                            }
                        }
                        if(value[t]==1 && !noWinner) {
                            winnerOfFace[faceno] = playerO;
                            winsOfO++;
                        }
                        else if(value[t]==2 && !noWinner) {
                            winnerOfFace[faceno] = playerX;
                            winsOfX++;
                        }
                        if(decideDraw[faceno]==9 && noWinner){
                            winnerOfFace[faceno]="Draw";
                            draw++;
                        }
	    	}
                winnerOfFaceLabel(faceno);
                updateScore();
    	}
        if((winsOfO+winsOfX +draw) == 7) {
            gameWinner();
            return;
        }
    }
    private void updateScore(){
        jLabel19.setText(String.valueOf(winsOfO));
        jLabel21.setText(String.valueOf(winsOfX));
    }
    private void winnerOfFaceLabel(int faceno){
        switch(faceno){
            case 0:
                jLabel6.setText(winnerOfFace[faceno]);
                break;
            case 1:
                jLabel7.setText(winnerOfFace[faceno]);
                break;
            case 2:
                jLabel8.setText(winnerOfFace[faceno]);
                break;
            case 3:
                jLabel14.setText(winnerOfFace[faceno]);
                break;
            case 4:
                jLabel15.setText(winnerOfFace[faceno]);
                break;
            case 5:
                jLabel16.setText(winnerOfFace[faceno]);
                break;
            case 6:
                jLabel17.setText(winnerOfFace[faceno]);
                break;
        }
    }
    void gameWinner() {
        if(winsOfX > winsOfO) {
            winner = playerX;
        }
        else if(winsOfX<winsOfO){
            winner = playerO;
        }
        else{
            winner = "Draw";
        }
        jLabel9.setText(winner);
        Winner win = new Winner(winner);
        win.setVisible(true);
        
        
        
        gameOver = true;
    }
    public void setFaceNumber(int i) {
    	switch(i) {
    	case 0:
    	case (0+9):
    	case 0+18:
    		faceNumber[i] = new int[3];
    		faceNumber[i][0] = 0+i/9;
    		faceNumber[i][1] = 3;
    		faceNumber[i][2] = 4;
    		break;
    	case 1:
    	case (1+9):
    	case 1+18:
    		faceNumber[i] = new int[2];
    		faceNumber[i][0] = 0+i/9;
    		faceNumber[i][1] = 3;
    		break;
    	case 2:
    	case (2+9):
    	case 2+18:
    		faceNumber[i] = new int[3];
    		faceNumber[i][0] = 0+i/9;
    		faceNumber[i][1] = 3;
    		faceNumber[i][2] = 6;
    		break;
    	case 3:
    	case (3+9):
    	case 3+18:
    		faceNumber[i] = new int[2];
    		faceNumber[i][0] = 0+i/9;
    		faceNumber[i][1] = 4;
    		break;
    	case 4:
    	case (4+9):
    	case 4+18:
    		faceNumber[i] = new int[1];
    		faceNumber[i][0] = 0+i/9;
    		break;
    	case 5:
    	case (5+9):
    	case 5+18:
    		faceNumber[i] = new int[2];
    		faceNumber[i][0] = 0+i/9;
    		faceNumber[i][1] = 6;
    		break;
    	case 6:
    	case 6+9:
    	case 6+18:
    		faceNumber[i] = new int[3];
    		faceNumber[i][0] = 0+i/9;
    		faceNumber[i][1] = 4;
    		faceNumber[i][2] = 5;
    		break;
    	case 7:
    	case 7+9:
    	case 7+18:
    		faceNumber[i] = new int[2];
    		faceNumber[i][0] = 0+i/9;
    		faceNumber[i][1] = 5;
    		break;
    	case 8:
    	case 8+9:
    	case 8+18:
    		faceNumber[i] = new int[3];
    		faceNumber[i][0] = 0+i/9;
    		faceNumber[i][1] = 5;
    		faceNumber[i][2] = 6;
    		break;
    	}
    }
    public int [] getFaceNumber(int i){
    	return faceNumber[i];
    }
    private void setFontLabel1(String currentPlayer){
        jLabel1.setText(currentPlayer);
        if(currentPlayer.endsWith("O")){
            jLabel1.setForeground(Color.BLUE);
            
        }
        else{
            jLabel1.setForeground(Color.RED);
        }
    }
   
    @Override
    public void mouseClicked(MouseEvent e) {
        for(int i=0 ;i<27 && !gameOver;i++){
            if(e.getSource().equals(jb[i])){
            	
                if(value[i]==0){
                    if(isO){
                        value[i]=1;
                        jb[i].setIcon(imgO);
                        update(i);
                        paint3D();
                        setFaceNumber(i);
                        faceWinner(getFaceNumber(i));
                        isO=false;
                        currentPlayer = playerX +": X";
                        
                    }
                    else{
                        value[i]=2;
                        jb[i].setIcon(imgX);
                        update(i);
                        paint3D();
                        setFaceNumber(i);
                        faceWinner(getFaceNumber(i));
                        isO=true;
                        currentPlayer = playerO + ": O";
                    }
                    setFontLabel1(currentPlayer);
                    
                }
            }
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(jButton1)){
            dispose();
            PlayerNames p = new PlayerNames();
            p.setVisible(true);
        }
    }
    
}

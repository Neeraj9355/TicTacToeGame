package demo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GamePanel implements ActionListener{
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    int count = 0;
    String xo_value="",titleStr="";
    Color color;
    Boolean win=false;
    String player1,player2;
    int totalSeries;
    int seriesCount = 1 ;
    String playerWhoWins;
    Boolean player1Turn= true;
    int player1WinCount = 0,player2WinCount = 0;
    
    GamePanel(String player1 , String player2 , int totalSeries){
        this.player1 = player1;
        this.player2 = player2;
        this.totalSeries = totalSeries;
    }
    void openPanel(){
        jf = new JFrame();
        jf.setTitle(player1+"(X) Turn");
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3,3));
        
        jb1 = new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jb2 = new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3 = new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7 = new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);
        
        jb8 = new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9 = new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count=count+1;
        if(player1Turn == true){
            color=Color.YELLOW;
            xo_value="X";
            titleStr="O";
            jf.setTitle(player2+"("+titleStr+") Turn");
            player1Turn = false;
        }else{
            color=Color.RED;
            xo_value="O";
            titleStr="X";
            jf.setTitle(player1+"("+titleStr+") Turn");
            player1Turn = true;
        }
        
        if(e.getSource() == jb1){
            jb1.setBackground(color);
            jb1.setFont(new Font("Arial",1,50));
            jb1.setText(xo_value);
            jb1.setEnabled(false);
        }
        if(e.getSource() == jb2){
            jb2.setBackground(color);
            jb2.setFont(new Font("Arial",1,50));
            jb2.setText(xo_value);
            jb2.setEnabled(false);
        }
        if(e.getSource() == jb3){
            jb3.setBackground(color);
            jb3.setFont(new Font("Arial",1,50));
            jb3.setText(xo_value);
            jb3.setEnabled(false);
        }
        if(e.getSource() == jb4){
            jb4.setBackground(color);
            jb4.setFont(new Font("Arial",1,50));
            jb4.setText(xo_value);
            jb4.setEnabled(false);
        }
        if(e.getSource() == jb5){
            jb5.setBackground(color);
            jb5.setFont(new Font("Arial",1,50));
            jb5.setText(xo_value);
            jb5.setEnabled(false);
        }
        if(e.getSource() == jb6){
            jb6.setBackground(color);
            jb6.setFont(new Font("Arial",1,50));
            jb6.setText(xo_value);
            jb6.setEnabled(false);
        }
        if(e.getSource() == jb7){
            jb7.setBackground(color);
            jb7.setFont(new Font("Arial",1,50));
            jb7.setText(xo_value);
            jb7.setEnabled(false);
        }
        if(e.getSource() == jb8){
            jb8.setBackground(color);
            jb8.setFont(new Font("Arial",1,50));
            jb8.setText(xo_value);
            jb8.setEnabled(false);
        }
        if(e.getSource() == jb9){
            jb9.setBackground(color);
            jb9.setFont(new Font("Arial",1,50));
            jb9.setText(xo_value);
            jb9.setEnabled(false);
        }
        winningPossibilities();
        whoWins();
    }
    void winningPossibilities(){
        if(((jb1.getText() == jb2.getText()) && (jb2.getText() == jb3.getText()) && (jb1.getText() == jb3.getText()))&& jb3.getText() != "" ){
            win=true;
        }
        else if(((jb4.getText() == jb4.getText()) && (jb5.getText() == jb6.getText()) && (jb4.getText() == jb6.getText()))&& jb6.getText() != "" ){
            win=true;
        }
        else if(((jb7.getText() == jb8.getText()) && (jb8.getText() == jb9.getText()) && (jb7.getText() == jb9.getText()))&& jb9.getText() != "" ){
            win=true;
        }
        else if(((jb1.getText() == jb4.getText()) && (jb4.getText() == jb7.getText()) && (jb1.getText() == jb7.getText()))&& jb7.getText() != "" ){
            win=true;
        }
        else if(((jb2.getText() == jb5.getText()) && (jb5.getText() == jb8.getText()) && (jb2.getText() == jb8.getText()))&& jb8.getText() != "" ){
           win=true;
        }
        else if(((jb3.getText() == jb6.getText()) && (jb6.getText() == jb9.getText()) && (jb3.getText() == jb9.getText()))&& jb9.getText() != "" ){
            win=true;
        }
        else if(((jb1.getText() == jb5.getText()) && (jb5.getText() == jb9.getText()) && (jb1.getText() == jb9.getText()))&& jb9.getText() != "" ){
            win=true;
        }
        else if(((jb3.getText() == jb5.getText()) && (jb5.getText() == jb7.getText()) && (jb3.getText() == jb7.getText()))&& jb7.getText() != "" ){
            win=true;
        }
        else{
            win=false;
        }
    }
    void whoWins(){
        if(win == true){
            seriesCount = seriesCount + 1;
            if(xo_value.equals("X")){
                playerWhoWins=player1;
                player1WinCount = player1WinCount+1;
            }else{
                playerWhoWins=player2;
                player2WinCount = player2WinCount+1;
            }
            String winTitle = playerWhoWins+"("+xo_value+")"+ " win";
            jf.setTitle(winTitle);
            JOptionPane.showMessageDialog(jf,winTitle);
            restartGame();
        }else if(win == false && count == 9){
            seriesCount = seriesCount + 1;
            JOptionPane.showMessageDialog(jf,"Match Draw");
            restartGame();
        }
    }
    void restartGame(){
        if (totalSeries >= seriesCount) {
            int i=JOptionPane.showConfirmDialog(jf,"Do you want to restart the game ?");
            if(i == 0){
                jb1.setText("");
                jb2.setText("");
                jb3.setText("");
                jb4.setText("");
                jb5.setText("");
                jb6.setText("");
                jb7.setText("");
                jb8.setText("");
                jb9.setText("");

                jb1.setBackground(null);
                jb2.setBackground(null);
                jb3.setBackground(null);
                jb4.setBackground(null);
                jb5.setBackground(null);
                jb6.setBackground(null);
                jb7.setBackground(null);
                jb8.setBackground(null);
                jb9.setBackground(null);
                btnSetEnabling(true);

                count = 0;
                if(playerWhoWins == player1){
                    player1Turn = true;
                }else{
                    player1Turn = false;
                }
                jf.setTitle(playerWhoWins +"("+xo_value+") Turn");
            }
            else if(i == 1){
                System.exit(0);
            }
            else if(i == 2){
                btnSetEnabling(false);
            }
        }else{
            JOptionPane.showMessageDialog(jf,"Series Completed....! ");
            if (player1WinCount > player2WinCount) {
                JOptionPane.showMessageDialog(jf,player1+" win series");
                System.exit(0);
            }else if(player2WinCount > player1WinCount){
                JOptionPane.showMessageDialog(jf,player2+" win series");
                System.exit(0);
            }else{
                JOptionPane.showMessageDialog(jf, "Series Draw");
                System.exit(0);
            }
        }    
    }
    void btnSetEnabling(Boolean b){
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
}
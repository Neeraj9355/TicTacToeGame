package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserPanel implements ActionListener{
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jt1,jt2;
    JButton jb;
    JComboBox jc;
    UserPanel(){
        jf = new JFrame("TicTacToe Game By Neeraj");
        jf.setSize(550,550);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jl1 = new JLabel("Enter Player One(X) : ");
        jl1.setBounds(50,100,150,50);
        jf.add(jl1);
        
        jt1 = new JTextField();
        jt1.setBounds(200, 100, 230, 50);
        jf.add(jt1);
        
        jl2 = new JLabel("Enter Second Two(O) : ");
        jl2.setBounds(50,200,150,40);
        jf.add(jl2);
        
        jt2 = new JTextField();
        jt2.setBounds(200, 200, 230, 50);
        jf.add(jt2);
        
        jl2 = new JLabel("Select Series : ");
        jl2.setBounds(50,300,150,40);
        jf.add(jl2);
        
        String[] item = {"Select One item","3","5","7","9"};
        jc = new JComboBox(item);
        jc.setBounds(200, 300, 230, 50);
        jf.add(jc);
            
        jb = new JButton("Start Game");
        jb.addActionListener(this);
        jb.setBounds(180, 400, 100, 40);
        jf.add(jb);
        
        jf.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb){
            String player1 = jt1.getText();
            String player2 = jt2.getText();
            String totalSeries =(String) jc.getSelectedItem();
            
            GamePanel gp = new GamePanel(player1,player2,Integer.parseInt(totalSeries));
            gp.openPanel();
            jf.setVisible(false);
        }
    }
}

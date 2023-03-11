
package gfm_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
    a project by : 

                   Joori Abdullah Alsaif 411201823 
                 , Rahaf Mukhled Almotari 411216754

*/


public class Forms extends JFrame implements ActionListener{


    private JButton r,c,s,d;
    static Rectangle tabRect[] = new Rectangle[20];
    static Square tabsq[] = new Square[20];
    static Circle tabc[] = new Circle[20];
    static int Rcount = 0 ;
    static int Scount = 0 ;
    static int Ccount = 0 ;
    
    public Forms(){
        
        super("GUI Forme");
        this.setLocation(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        r = new JButton("Create Rectangle");
        c = new JButton("Create Circle");
        s = new JButton("Create Square");
        d = new JButton("Display Forms");
        
        JPanel P = (JPanel)this.getContentPane();
        P.setLayout(new GridLayout(4,1,0,0));
        P.add(r);
        P.add(c);
        P.add(s);
        P.add(d);
        
        r.addActionListener(this);
        s.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        
        this.pack();
        this.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if( (JButton)e.getSource() == r){
               
            Rectangle rec = new Rectangle();   
        }
        else if( (JButton)e.getSource() == c){ 
                             
            Circle cir = new Circle();
             
        }
        else if( (JButton)e.getSource() == s){ 
            
            Square s = new Square();
            
        }else if ((JButton)e.getSource() == d){
            DisplayForms display = new DisplayForms();
        }
    }      

    public static void main(String[] args) {
        
        
        Forms f = new Forms();

        // rectangles[] arr = new rectangles[100];
        //circles[] arr2 = new circles[100];
        //squares[] arr3 = new squares[100];
        
        
       
    }
    
}
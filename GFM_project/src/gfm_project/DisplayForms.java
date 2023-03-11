
package gfm_project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DisplayForms extends JFrame implements ActionListener {
    
    

    private JRadioButton Circle;
    private JRadioButton Rectangle;
    private JRadioButton Square;
    private JButton bt ; 
    
    public DisplayForms() {
        
        super("DisplayForms");
        this.setLocation(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        Circle = new JRadioButton("show all circles");
        Rectangle = new JRadioButton("show all rectangles");
        Square = new JRadioButton("show all squares");

        bt = new JButton("Done");
        
        ButtonGroup group = new ButtonGroup();
        group.add(Circle);
        group.add(Rectangle);
        group.add(Square);
        
        JPanel p = (JPanel)this.getContentPane();
        p.setLayout(new GridLayout(4,1,3,3));
        
        p.add(Circle);
        p.add(Rectangle);
        p.add(Square);
        p.add(bt);
        
        
        Circle.addActionListener(this);
        Rectangle.addActionListener(this);
        Square.addActionListener(this);
        bt.addActionListener(this);
        
        
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
          if(e.getSource()==Circle && Forms.Ccount != 0) {
              System.out.println("Circles { ");
              for(int i=0 ; i<Forms.Ccount ; i++){
                  int j = i +1 ;
                  System.out.println("Circle "+ j +Forms.tabc[i]+",");
              
              }
              System.out.println("} ");   
          }
           else if(e.getSource()==Rectangle && Forms.Rcount !=0) {
               System.out.println("Recatangles { ");
               for(int i=0 ; i<Forms.Rcount ; i++){
                  int j = i +1 ;
                  System.out.println("Rectangle "+ j +Forms.tabRect[i]+",");
              }
               System.out.println("} ");
           }
           else if(e.getSource()==Square && Forms.Scount != 0) {
                System.out.println("Squares {");  
                for(int i=0 ; i<Forms.Scount ; i++){
                    int j = i +1 ;
                    System.out.println("Square "+ j +Forms.tabsq[i]+",");
              
                }
               System.out.println("} ");
           }else if( e.getSource()== bt ){
               System.exit(0);
            }
          else
               JOptionPane.showMessageDialog(null,"No forms created ","message",JOptionPane.INFORMATION_MESSAGE); 
    }
       
}




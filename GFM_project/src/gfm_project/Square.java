
package gfm_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Square extends JFrame implements ActionListener , calc{

    private JLabel len;
    private JTextField t1;
    private JButton cr,ca;
    private int length;
   
    public Square(int l){
    this.length = l;
    }
    
    public Square(){
        
        super("Square");
        this.setLocation(400, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        
        len = new JLabel("Length");
       
        t1 = new JTextField(10);
        
        cr = new JButton("Create");
        ca = new JButton("Cancel");
        
        JPanel j = new JPanel();
        JPanel j2 = new JPanel();

        j.setLayout(new FlowLayout());
        j.add(len);
        j.add(t1);
        
        j2.setLayout(new FlowLayout());
        j2.add(cr);
        j2.add(ca);
        
        JPanel P = (JPanel)this.getContentPane();
        P.setLayout(new BorderLayout());
        
        P.add(j,BorderLayout.WEST);
        P.add(j2, BorderLayout.SOUTH);
        
        cr.addActionListener(this);
        ca.addActionListener(this);
        
        
        this.pack();
        this.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if( (JButton)e.getSource() == cr){
            if(t1.getText().equals(""))
                
                JOptionPane.showMessageDialog(null, "you need to enter a value","empty input",JOptionPane.WARNING_MESSAGE);
     
            else{    
                try{
                    
                    Square s = new Square (Integer.parseInt(t1.getText()));
                    Forms.tabsq[Forms.Scount] = s ;
                    Forms.Scount++;


                    JOptionPane.showMessageDialog(null,"Square Created","message",JOptionPane.INFORMATION_MESSAGE);

                    t1.setText("");
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Only Numbers Are Allowed","empty input",JOptionPane.ERROR_MESSAGE);
                }
                
                
               }
        }
        else { 
            
            if(t1.getText().equals(""))
                 
                JOptionPane.showMessageDialog(null, "Fields Are Already Empty","empty input",JOptionPane.WARNING_MESSAGE);
            
            else{
                
                t1.setText("");
            }

                
            }
            
    }  

    @Override
    public double perimeterCalculation() {
        return this.length+this.length+this.length+this.length;  
    }

    @Override
    public double AreaCalculation() {
        return this.length*this.length;    }
    
    public void display(){
        System.out.println(this);
    }
    
     @Override
    public String toString() {
        return "{ length=" + length + " ,Area= "+AreaCalculation()+" ,perimeter= "+perimeterCalculation()+"}";
    }

}

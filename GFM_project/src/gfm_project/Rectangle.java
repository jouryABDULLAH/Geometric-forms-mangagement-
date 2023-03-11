
package gfm_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Rectangle extends JFrame implements ActionListener , calc{

    private JLabel len,wid;
    private JTextField t1,t2;
    private JButton creat,cancel;
    private int length,width;
       
    public Rectangle(int l , int w ){
        this.length = l ;  
        this.width = w ;
    }
    
    public Rectangle(){
        
        super("Rectangle");
        this.setLocation(400, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        
        len = new JLabel("Length");
        wid = new JLabel("Width");
       
        t1 = new JTextField(10);
        t2 = new JTextField(10);
    
        creat = new JButton("Create");
        cancel = new JButton("Cancel");
        
        JPanel j = new JPanel();
        JPanel j2 = new JPanel();

        j.setLayout(new FlowLayout());
        j.add(len);
        j.add(t1);
        j.add(wid);
        j.add(t2);
        
        j2.setLayout(new FlowLayout());
        j2.add(creat);
        j2.add(cancel);
        
        JPanel P = (JPanel)this.getContentPane();
        P.setLayout(new BorderLayout());
        
        P.add(j,BorderLayout.WEST);
        P.add(j2, BorderLayout.SOUTH);
        
        creat.addActionListener(this);
        cancel.addActionListener(this);
        
        
        this.pack();
        this.setVisible(true);
    }
    
      
    @Override
    public void actionPerformed(ActionEvent e) {

        if( (JButton)e.getSource() == creat){
            if(t1.getText().equals("")&& t2.getText().equals(""))
                
                JOptionPane.showMessageDialog(null, "you need to enter a value","empty input",JOptionPane.WARNING_MESSAGE);
     
            else if(t1.getText().equals("")|| t2.getText().equals(""))
                
                JOptionPane.showMessageDialog(null, "you need to enter a value","empty input",JOptionPane.WARNING_MESSAGE);
   
            else{   
                
                try{
                        Rectangle r = new Rectangle(  Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText() ));
                        Forms.tabRect[Forms.Rcount] = r ;
                        Forms.Rcount++;
                        JOptionPane.showMessageDialog(null,"Rectangle Created","message",JOptionPane.INFORMATION_MESSAGE);

                        t1.setText("");
                        t2.setText("");
                }
                catch(NumberFormatException ex){ 
                    
                    JOptionPane.showMessageDialog(null, "Only Numbers Are Allowed","empty input",JOptionPane.ERROR_MESSAGE);
               }
            }
        }
        else { 
            
            if(t1.getText().equals("")&& t2.getText().equals(""))
                 
                JOptionPane.showMessageDialog(null, "Fields Are Already Empty","empty input",JOptionPane.WARNING_MESSAGE);
            
            else{
                
                t1.setText("");
                t2.setText("");

                
            }      
        }      
    } 

    @Override
    public double perimeterCalculation() {

        return (double) 2 * ( this.width + this.length) ;

    }

    @Override
    public double AreaCalculation() {
         return (double)this.length * this.width ;   
    
    }

    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "{ length= " + length + ", width= " + width +" ,Area= "+ AreaCalculation()+" ,perinmeter= "+perimeterCalculation()+ "}";
    }
    
}

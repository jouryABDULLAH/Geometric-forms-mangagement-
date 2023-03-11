
package gfm_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class Circle extends JFrame implements ActionListener , calc{

    private JLabel Cx,Cy,radius;
    private JTextField tx,ty,tr;
    private JButton creat,cancel;
    private int r;
    private Point p;
   
    public  Circle(Point p,int r){
        
        this.p=p;
        this.r = r;
    }
    public Circle(){
        
        super("Circle");
        this.setLocation(400, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        
        Cx = new JLabel("Center x:");
        Cy = new JLabel("y:");
        radius = new JLabel("Radius:");
        
        tx = new JTextField(10);
        ty = new JTextField(10);
        tr = new JTextField(10);
     
        creat = new JButton("Create");
        cancel = new JButton("Cancel");
        
        JPanel j = new JPanel();
        JPanel j2 = new JPanel();
        JPanel j3 = new JPanel();

        j.setLayout(new FlowLayout());
        j.add(Cx);
        j.add(tx);
        j.add(Cy);
        j.add(ty);
        
        
        j2.setLayout(new FlowLayout());
        j2.add(radius);
        j2.add(tr);
        
        j3.setLayout(new FlowLayout());
        j3.add(creat);
        j3.add(cancel);
        
        JPanel P = (JPanel)this.getContentPane();
        P.setLayout(new GridLayout(3,1,3,3));
        
        P.add(j,BorderLayout.WEST);
        P.add(j2,BorderLayout.CENTER);
        P.add(j3, BorderLayout.SOUTH);
        
        creat.addActionListener(this);
        cancel.addActionListener(this);
        
        
        this.pack();
        this.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if( (JButton)e.getSource() == creat){
            if(tx.getText().equals("")&& ty.getText().equals("")&&tr.getText().equals(""))
                
                JOptionPane.showMessageDialog(null, "you need to enter a value","empty input",JOptionPane.WARNING_MESSAGE);
     
            else if(tx.getText().equals("")|| ty.getText().equals("")||tr.getText().equals(""))
                
                JOptionPane.showMessageDialog(null, "you need to fill all the blanks","empty input",JOptionPane.WARNING_MESSAGE);
   
            else{    
                try{
                    Point P = new Point( Integer.parseInt(tx.getText()) , Integer.parseInt(ty.getText()) ); // inner class inside class Circle
                    Circle c = new Circle(P,Integer.parseInt(tr.getText()));

                    Forms.tabc[Forms.Ccount] = c ;
                    Forms.Ccount++;

                    JOptionPane.showMessageDialog(null,"Circle Created","message",JOptionPane.INFORMATION_MESSAGE);

                    tx.setText("");
                    ty.setText("");
                    tr.setText("");
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Only Numbers Are Allowed","empty input",JOptionPane.ERROR_MESSAGE);
                }
                
                
                }
        }
        else {
            
            if(tx.getText().equals("")&& ty.getText().equals("") && tr.getText().equals(""))
                 
                JOptionPane.showMessageDialog(null, "Fields Are Already Empty","empty input",JOptionPane.WARNING_MESSAGE);
            
            else{
                
                tx.setText("");
                ty.setText("");
                tr.setText("");
                
            }      
        }     
    }    


    @Override
    public double perimeterCalculation() {
        return 2*3.14*this.r;
    }

    @Override
    public double AreaCalculation() {
        return 3.14*(this.r*this.r);
    }
    
     public void display(){
        System.out.println(this);
    }
     
    @Override
    public String toString() {
        return " { Center: " + p + " , radius="+r+" ,area= "+AreaCalculation()+" ,perimeter= "+perimeterCalculation()+'}';
    }
    
    //Inner class Point
    public class Point {
        private int x,y;
        
        public Point(int x , int y){
            this.x = x ;
            this.y = y ;   
        } 

        @Override
        public String toString() {
            return "Point( " + x + ", " + y + ')';
        }
    
    
    }
}
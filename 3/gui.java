package guievent;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Frame fr=new Frame("Student Marks");
        
        Label l1,l2,l3,l4,l5,l6;
        TextField tf1,tf2,tf3,tf4,tf5,tf6;
        Button b1,b2;
        
        l1=new Label("Name of Student: ");
        l1.setBounds(50, 50, 100, 30);
        
        tf1=new TextField();
        tf1.setBounds(150, 50, 130, 30);
        
        l2=new Label("Class: ");
        l2.setBounds(350, 50, 80, 30);
        
        tf2=new TextField();
        tf2.setBounds(450, 50, 130, 30);
        
        l3=new Label("Subject 1 Marks: ");
        l3.setBounds(50, 100, 100, 30);
        
        tf3=new TextField();
        tf3.setBounds(150, 100, 50, 30);
        
        l4=new Label("Subject 2 Marks: ");
        l4.setBounds(350, 100, 100, 30);
        
        tf4=new TextField();
        tf4.setBounds(450, 100, 50, 30);
        
        l5=new Label("Subject 3 Marks: ");
        l5.setBounds(50, 150, 100, 30);
        
        tf5=new TextField();
        tf5.setBounds(150, 150, 50, 30);
        
        l6=new Label("Subject 4 Marks: ");
        l6.setBounds(350, 150, 80, 30);
        
        tf6=new TextField();
        tf6.setBounds(450, 150, 50, 30);
        
        b1=new Button("Result");
        b1.setBounds(150, 200, 80, 30);
        b2=new Button("Close");
        b2.setBounds(350, 200, 80, 30);
        
        b1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int s1=Integer.parseInt(tf3.getText());
                int s2=Integer.parseInt(tf4.getText());
                int s3=Integer.parseInt(tf5.getText());
                int s4=Integer.parseInt(tf6.getText());
                
                int sum=s1+s2+s3+s4;
                String total=Integer.toString(sum);
                Label res=new Label("The result for " + tf1.getText() + " is " + total);
                
                Frame fr2=new Frame("Result");
                fr2.add(res);
                fr2.setSize(500,200);
                fr2.setVisible(true);
            }
        });
        
        b2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                fr.dispose();
            }
        });
        
        fr.add(l1);
        fr.add(tf1);
        fr.add(l2);
        fr.add(tf2);
        fr.add(l3);
        fr.add(tf3);
        fr.add(l4);
        fr.add(tf4);
        fr.add(l5);
        fr.add(tf5);
        fr.add(l6);
        fr.add(tf6);
        fr.add(b1);
        fr.add(b2);
        fr.setLayout(null);
        fr.setSize(800,400);
        fr.setVisible(true);
 
    }
 
}
 
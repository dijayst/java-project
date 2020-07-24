/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_project;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class add_contact_Form extends JFrame {
    private JTextArea menu;
    private JButton add_address,add_phone,add_email_address,add_birthday,add_anniversary,add_reminder;
    private JButton btn;
   
    public add_contact_Form(){
    
        menu= new JTextArea("Menu For Adding Corresponding Data");
        add_address=new JButton("Add Address");
        add_phone =new JButton("Add Phone");
        add_email_address =new JButton("Add Email Address");
        add_birthday=new JButton("Add Birthday");
        add_anniversary=new JButton("add Anniversary");
        add_reminder=new JButton(" Add Reminder");
        btn=new JButton ("back");
        
        
     add_address.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(add_address)){
                    setVisible(false
                    );
                  
               Address_Entry_Form input= new Address_Entry_Form();
                
            }
            }
 });
          
     btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
         if (arg0.getSource().equals(btn)){
                    setVisible(false
                    );
                 
     }
               mainform input= new mainform();
            
            }

 });
        
        
       add( add_address);
         add( add_phone );
           add(add_email_address);
             add(add_birthday);
               add(add_anniversary);
                 add(add_reminder);
                 add(btn);
                  add(menu);       
                
                  setLayout(null);
                  menu.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
                  add_address.setBounds(50,200,200,40);
                  add_phone.setBounds(270,200,200,40);
                  add_email_address.setBounds(50,250,200,40);
                  add_birthday.setBounds(270,250,200,40);
                  add_anniversary.setBounds(50,300,200,40);
                  add_reminder.setBounds(270,300,200,40);
                   btn.setBounds(10,400,480,30);
                   
   setSize (500,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
    }

    add_contact_Form(String add_contact_Form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setlayout(BorderLayout borderLayout) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


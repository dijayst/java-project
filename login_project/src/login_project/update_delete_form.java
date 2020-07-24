package login_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;



public class update_delete_form extends JFrame {
 


    
    private JButton Address;
    private JButton phone;
    private JButton mail;
    private JButton birth;
    private JButton reminder;
    private JButton anni;
    private JButton Back;
       
    public update_delete_form(){
    
    
    Address=new JButton("update/delete address");
    phone=new JButton("update/delete phone no");
    mail=new JButton("update/delete email");
    birth=new JButton("update/delete birthday");
    reminder=new JButton("update/delete reminder");
    anni=new JButton("update/delete anniversary");
    Back =new JButton("Back");   
    
    
 Address.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(Address)){
                    setVisible(false
                    );
                 
     }
                email_update_deleteform input=new email_update_deleteform();
            }

 });
 
 
 Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(Back)){
                    setVisible(false
                    );
                 
     }
                reminder_entry_form input=new   reminder_entry_form ();
            }

 });
  
    add(Address);
     add(phone);
      add(mail); 
      add(birth);
      add(reminder);
      add(anni);
      add(Back );
    
       
 
           setLayout(null);
  Address.setBounds(20,100,200,30);
  phone.setBounds(20,150,200,30);
   mail.setBounds(20,200,200,30);
    birth.setBounds(20,250,200,30);
    reminder.setBounds(20,300,200,30);
     anni.setBounds(20,350,200,30);
   Back.setBounds(20,400,200,30);
    
       
       
   setSize (300,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   
   
    }
    }
  

   


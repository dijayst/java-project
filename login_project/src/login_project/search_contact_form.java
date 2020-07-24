package login_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class search_contact_form extends JFrame {
 


    
    private JButton Address;
    private JButton phone;
    private JButton mail;
    private JButton birth;
    private JButton reminder;
    private JButton anni;
    private JButton Back;
       
    public search_contact_form(){
    
    
    Address=new JButton("search address");
    phone=new JButton("search email");
    mail=new JButton("search phonenum");
    birth=new JButton("search birthday");
    reminder=new JButton("search anniversary");
    anni=new JButton("search reminder");
    Back =new JButton("Back");   
    
    
 Address.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(Address)){
                    setVisible(false
                    );
                 
     }
                search_address_form input=new search_address_form();
            }

 });
 
    
 phone.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(phone)){
                    setVisible(false
                    );
                 
     }
                search_email_form input=new search_email_form();
            }

 });
 
    
 mail.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(mail)){
                    setVisible(false
                    );
                 
     }
                search_phonenumber_form input=new search_phonenumber_form();
            }

 });
 
    
 birth.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                search_bithday_form input=new search_bithday_form();
            }

 });
 
 
 reminder.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                search_anniversary_form input=new search_anniversary_form();
            }

 });
 
 
    
 anni.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
               search_address_form  input=new search_address_form();
            }

 });
 
 Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
               update_delete_reminder_form input=new   update_delete_reminder_form ();
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
  

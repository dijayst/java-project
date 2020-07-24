/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_project;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class email_entry_form extends JFrame {
    
    private JTextArea phone;
    private JButton add_record,back;
    private JLabel entry_id,name,email_id;
    private JTextField entry,nam,email;
               public email_entry_form(){
    
        phone    =new JTextArea("Email_Entry_form");
       add_record=new JButton("add_record");
        back=new JButton("Back");
        entry_id=new JLabel("Entry ID:");
        name= new JLabel("Name:");
        email_id=new JLabel("email_id:");
        entry=new JTextField(50);
        nam=new JTextField(50);
        email=new JTextField(50);
        
         
    add_record.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(add_record)){
                    setVisible(false
                    );
                 
     }
               anniversary_entry_form input= new anniversary_entry_form();
                
            }

 });              
    
     back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(back)){
                    setVisible(false
                    );
                 
     }
               phone_entry_form input= new phone_entry_form();
                
            }

 });              
    
 
        
     add(phone);
    add(add_record);
    add(back);
     add(entry_id);
     add(name);
     add(email_id);
      add(entry);
      add(nam);
      add(email);
    
      
      setLayout(null);
      phone.setBounds(100,20,150,20);
        entry_id.setBounds(100,60,100,30);
       entry.setBounds(250,60,130,30);
        name.setBounds(100,100,100,30);
        nam.setBounds(250,100,130,30);
         email_id.setBounds(100,140,100,30);
         email.setBounds(250,140,130,30);
          back.setBounds(250,400,100,30);
       add_record.setBounds(140,400,100,30);
     
     
      
   setSize (500,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    
    
}
}

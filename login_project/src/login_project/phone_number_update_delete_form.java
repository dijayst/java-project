package login_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class phone_number_update_delete_form extends JFrame implements ActionListener {
    
    private JTextArea phone;
    private JButton add_record,back,backing;
    private JComboBox select_name;
    private JLabel entry_id,name,phone_no;
    private JTextField entry,nam,phn;
               public phone_number_update_delete_form(){
    
        phone =new JTextArea("phone_number_update_deleteform");
        add_record=new JButton("update");
        select_name=new JComboBox();
        back=new JButton("delete");
        backing=new JButton("back");
        entry_id=new JLabel("Entry ID:");
        name= new JLabel("Name:");
        phone_no=new JLabel("phone number:");
        entry=new JTextField(50);
        nam=new JTextField(50);
        phn=new JTextField(50);
        
         
        DefaultComboBoxModel inputt=new DefaultComboBoxModel();
                inputt.addElement("select_name");   
                     inputt.addElement("");    
                          inputt.addElement("");
                          select_name.setModel(inputt);
        
        
   add_record.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(add_record)){
                    setVisible(false
                    );
                 
     }
               address_update_delete_form input= new address_update_delete_form();
                
            }

 });              
    
     back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(back)){
                    setVisible(false
                    );
                 
     }
                 StimulateBckSpacekeyWithButton(0);
            
            }

            private void StimulateBckSpacekeyWithButton(int i) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

 });              
    
     
     backing.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(backing)){
                    setVisible(false
                    );
                 
     }
                  email_update_deleteform input= new email_update_deleteform();
               
            }


 });       
    
 
        add(backing);
     add(phone);
    add(add_record);
    add(back);
     add(entry_id);
     add(name);
     add(phone_no);
      add(entry);
      add(nam);
      add(phn);
    add(select_name);
      
      setLayout(null);
      phone.setBounds(100,20,150,20);
        entry_id.setBounds(100,100,100,30);
       entry.setBounds(250,100,130,30);
        name.setBounds(100,140,100,30);
        nam.setBounds(250,140,130,30);
         phone_no.setBounds(100,180,100,30);
         phn.setBounds(250,180,130,30);
         backing.setBounds(20,400,450,30);
          back.setBounds(250,60,100,30);
       add_record.setBounds(100,60,100,30);
     select_name.setBounds(400,60,100,30);
      
   setSize (500,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    
    
    }

    private void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    


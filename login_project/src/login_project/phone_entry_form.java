package login_project;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class phone_entry_form extends JFrame implements ActionListener {
    
    private JTextArea phone;
    private JButton add_record,back;
    private JLabel entry_id,name,phone_no;
    private JTextField entry,nam,phn;
               public phone_entry_form(){
    
        phone    =new JTextArea("phone number,Entry_form");
        add_record=new JButton("add_record");
        back=new JButton("back");
        entry_id=new JLabel("Entry ID:");
        name= new JLabel("Name:");
        phone_no=new JLabel("Phone no:");
        entry=new JTextField(50);
        nam=new JTextField(50);
        phn=new JTextField(50);
        
         
     add_record.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(add_record)){
                    setVisible(false
                    );
                 
     }
               email_entry_form input= new email_entry_form();
                
            }

 });              
    
     back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(back)){
                    setVisible(false
                    );
                 
     }
               Address_Entry_Form input= new Address_Entry_Form();
                
            }

 });              
    
 
        
     add(phone);
    add(add_record);
    add(back);
     add(entry_id);
     add(name);
     add(phone_no);
      add(entry);
      add(nam);
      add(phn);
    
      
      setLayout(null);
      phone.setBounds(100,20,150,20);
        entry_id.setBounds(100,60,100,30);
       entry.setBounds(250,60,130,30);
        name.setBounds(100,100,100,30);
        nam.setBounds(250,100,130,30);
         phone_no.setBounds(100,140,100,30);
         phn.setBounds(250,140,130,30);
          back.setBounds(250,400,100,30);
       add_record.setBounds(140,400,100,30);
     
      
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

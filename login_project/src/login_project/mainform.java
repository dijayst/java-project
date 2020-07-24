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


public  class mainform extends JFrame implements ActionListener {
    
    
    private JButton Add_contact;
    private JButton Update_contact;
    private JButton Search_contact;
    private JButton Back;
       
    public mainform(){
        //constructor
    
    super("EVENT INC");
    
    Add_contact=new JButton("add_contact");
    Update_contact=new JButton("Update_contactt");
    Search_contact=new JButton("Search_Contact");
    Back =new JButton("Back");   
    
    
 Add_contact.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (arg0.getSource().equals(Add_contact)){
                    setVisible(false
                    );
                    add_contact_Form input=new add_contact_Form();
                }
                
            }

 });
  
 
    
 Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (arg0.getSource().equals( Back)){
                    setVisible(false
                    );
                 loginform input=new loginform();
                }
                
            }

 });
    
    add(Add_contact);
     add(Update_contact);
      add(Search_contact);
      add(Back );
    
       
 
           setLayout(null);
  Add_contact.setBounds(20,50,260,80);
   Update_contact.setBounds(20,150,260,80);
   Search_contact.setBounds(20,250,260,80);
   Back.setBounds(20,350,260,80);
    
       
       
   setSize (300,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
   
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}

    


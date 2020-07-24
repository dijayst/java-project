package login_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class search_anniversary_form extends JFrame{
    
    
    private JComboBox month;
    private JButton search,back;
    public search_anniversary_form(){
    
        month= new JComboBox();
        search= new JButton ("search");
        back = new JButton("back");
        
      /*  search.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                mainform input= new mainform();
            }
 });*/
  
 
 back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(back)){
                    setVisible(false
                    );
                 
     }
                 search_contact_form input= new  search_contact_form();
            }
 });
        
        
        add(month);
        add(back);
        add(search);
   
        
        DefaultComboBoxModel pinput = new DefaultComboBoxModel();
            pinput.addElement("1");
             pinput.addElement("2");
                  pinput.addElement("3");
                     pinput.addElement("4");
                        pinput.addElement("5");
                           pinput.addElement("6");
                              pinput.addElement("7");
                                 pinput.addElement("8");
                                    pinput.addElement("9");
                                       pinput.addElement("10");
                                          pinput.addElement("11");
                                            pinput.addElement("12");
                            month.setModel(pinput);
        
      setLayout(null);
      month.setBounds(100,20,150,20);
       back.setBounds(250,400,100,30);
       search.setBounds(140,400,100,30);
     
        
           
     
   setSize (500,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
        
    
    

    
    }
}

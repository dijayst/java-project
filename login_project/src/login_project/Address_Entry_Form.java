
package login_project;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
        
        
public class Address_Entry_Form extends JFrame {
    private JTextArea address_entry;
    private JLabel entrylabel;
    private JLabel namelabel;
    private JLabel addresslabel;
    private JLabel citylabel;
    private JLabel statelabel;
    private JLabel countryLabel;
    private JLabel pincodelabel;
    private JTextField entry,name,address,city,state,country,pincode;
    private JButton backbtn;
    private JButton addbtn;
    private JButton newrecordbtn;
    
    
    
    
              public Address_Entry_Form(){
        
    //setLayout(new FlowLayout());
        
        address_entry = new JTextArea ("ADDRESS ENTRY FORM");
    entrylabel= new JLabel("ENTRY id:");
    entry= new JTextField(50);
    namelabel=new JLabel("NAME:");
    name=new JTextField(50);
    addresslabel=new JLabel("ADDRESS:");
    address=new JTextField(50);
    citylabel=new JLabel("CITY:");
    city=new JTextField(50);
    statelabel=new JLabel("STATE:");
    state=new JTextField(50);
    countryLabel=new JLabel("COUNTRY:");
    country=new JTextField(50);
    pincodelabel=new JLabel("PINCODE:");
    pincode=new JTextField(50);
    backbtn=new JButton("BACK");
    addbtn=new JButton("Add_record");
    newrecordbtn=new JButton("New_Record");
    
    
      
     addbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(addbtn)){
                    setVisible(false
                    );
                 
     }
               phone_entry_form input= new phone_entry_form();
                
            }

 });              
    
     backbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(backbtn)){
                    setVisible(false
                    );
                 
     }
               add_contact_Form input= new add_contact_Form();
                
            }

 });              
    
    
    
    add(address_entry);
    add(entrylabel);
    add(entry);
    add( namelabel);
    add(name);
    add(addresslabel);
    add(address);
    add(citylabel);
    add(city);
    add(statelabel);
    add(state);
    add(countryLabel);
    add(country);
    add(pincodelabel);
    add(pincode);
    add(backbtn);
    add(addbtn);
    add(newrecordbtn);
   
    
      setLayout(null);
      address_entry.setBounds(100,20,150,20);
       entrylabel.setBounds(100,60,100,30);
       entry.setBounds(250,60,130,30);
        namelabel.setBounds(100,100,100,30);
        name.setBounds(250,100,130,30);
         addresslabel.setBounds(100,140,100,30);
         address.setBounds(250,140,130,30);
         citylabel.setBounds(100,180,100,30);
        city.setBounds(250,180,130,30);
       statelabel.setBounds(100,220,100,30);
    state.setBounds(250,220,130,30);
      countryLabel.setBounds(100,260,100,30);
         country.setBounds(250,260,130,30);
         pincodelabel.setBounds(100,300,100,30);
         pincode.setBounds(250,300,130,30);
        backbtn.setBounds(250,400,100,30);
       addbtn.setBounds(140,400,100,30);
      newrecordbtn.setBounds(20,400,100,30);
     
      
   
   setSize (500,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    
}
}




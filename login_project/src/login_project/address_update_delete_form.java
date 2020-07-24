
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

public class address_update_delete_form extends JFrame {
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
    private JComboBox select;
    
              public address_update_delete_form(){
        
    //setLayout(new FlowLayout());
        select= new JComboBox();
        address_entry = new JTextArea ("address_update_delete_form");
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
    
    
      DefaultComboBoxModel inputt=new DefaultComboBoxModel();
                inputt.addElement("select_name");   
                     inputt.addElement("");    
                          inputt.addElement("");
                          select.setModel(inputt);
        
        
      
     addbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(addbtn)){
                    setVisible(false
                    );
                 
     }
               update_delete_anniversary_form input= new update_delete_anniversary_form();
                
            }

 });              
    
     backbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(backbtn)){
                    setVisible(false
                    );
                 
     }
               phone_number_update_delete_form input= new phone_number_update_delete_form();
                
            }

 });              
    
    
      add(select);
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
       entrylabel.setBounds(100,100,100,30);
       entry.setBounds(250,100,130,30);
        namelabel.setBounds(100,140,100,30);
        name.setBounds(250,140,130,30);
         addresslabel.setBounds(100,180,100,30);
         address.setBounds(250,180,130,30);
         citylabel.setBounds(100,220,100,30);
        city.setBounds(250,220,130,30);
       statelabel.setBounds(100,260,100,30);
    state.setBounds(250,260,130,30);
      countryLabel.setBounds(100,300,100,30);
         country.setBounds(250,300,130,30);
         pincodelabel.setBounds(100,340,100,30);
         pincode.setBounds(250,340,130,30);
        backbtn.setBounds(250,400,100,30);
       addbtn.setBounds(140,60,100,30);
      newrecordbtn.setBounds(20,60,100,30);
     select.setBounds(250,60,100,30);
      
   
   setSize (500,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    
}
}




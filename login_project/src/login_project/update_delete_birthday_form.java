
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



public class update_delete_birthday_form  extends JFrame {

    private JTextArea phone;
    private JButton save,back;
    private JLabel entry_id,name,enter_date,day,month,year,enter,selec;
    private JTextField entry,nam,yr,ent;
    private JComboBox da,mon,select;
               public update_delete_birthday_form(){
                   
     selec=new JLabel("select contact:");
    select=new JComboBox();
        phone =new JTextArea(" update_delete_birthday_form");
       save=new JButton("save");
        back=new JButton("Back");
        entry_id=new JLabel("Entry ID:");
        name= new JLabel("Name:");
        enter_date= new JLabel("select anniversary date:");
        enter= new JLabel("enter reminder text:");
        ent= new JTextField(50);
         day= new JLabel("day:");
         month= new JLabel("month:");
        year= new JLabel("year:");
           yr=new JTextField(50);
          da =new JComboBox();
           mon =new JComboBox();
           entry=new JTextField(50);
          nam=new JTextField(50);
       
        
         
     save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(save)){
                    setVisible(false
                    );
                 
     }
               update_delete_reminder_form  input= new update_delete_reminder_form ();
                
            }

 });              
    
     back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(back)){
                    setVisible(false
                    );
                 
     }
                update_delete_anniversary_form input= new  update_delete_anniversary_form();
                
            }

 });             
    
     
     
     DefaultComboBoxModel input =new  DefaultComboBoxModel();
       input.addElement("1");
         input.addElement("2");
           input.addElement("3");
             input.addElement("4");
               input.addElement("5");
                 input.addElement("6");
                   input.addElement("7");
                 da.setModel(input);  
        
                 
                 
     DefaultComboBoxModel iinput =new  DefaultComboBoxModel();
       iinput.addElement("1");
         iinput.addElement("2");
           iinput.addElement("3");
             iinput.addElement("4");
               iinput.addElement("5");
                 iinput.addElement("6");
                   iinput.addElement("7");
                   iinput.addElement("8");
                   iinput.addElement("9");
                   iinput.addElement("10");
                   iinput.addElement("11");
                   iinput.addElement("12");
                 mon.setModel(iinput);  
                 
                 
                 DefaultComboBoxModel miinput =new  DefaultComboBoxModel();
       miinput.addElement("1");
         miinput.addElement("2");
           miinput.addElement("3");
             miinput.addElement("4");
               miinput.addElement("5");
                 miinput.addElement("6");
                   miinput.addElement("7");
                   miinput.addElement("8");
                   miinput.addElement("9");
                   miinput.addElement("10");
                   miinput.addElement("11");
                   miinput.addElement("12");
                 select.setModel(miinput);  
                 
                 
                 
      add(selec);
    add(select);
     add(phone);
    add(save);
    add(back);
     add(entry_id);
     add(name);
     add(enter_date);
     add(enter);
     add(ent);
     add(month);
     add(day);
     add(year);
     add(mon);
     add(da);
     add(yr);
      add(entry);
      add(nam);
    
      
      setLayout(null);
                 
      selec.setBounds(10,220,100,30);
      select.setBounds(110,220,130,30);
       enter_date.setBounds(5,180,100,30);
         enter.setBounds(100,140,130,30);
         ent.setBounds(250,140,130,30);
         month.setBounds(230,180,100,30);
         mon.setBounds(270,180,100,30);
           year.setBounds(380,180,100,30);
          yr.setBounds(420,180,100,30);
            day.setBounds(90,180,100,30);
            da.setBounds(120,180,100,30);
      phone.setBounds(100,20,150,20);
        entry_id.setBounds(100,60,100,30);
       entry.setBounds(250,60,130,30);
        name.setBounds(100,100,100,30);
        nam.setBounds(250,100,130,30);
          back.setBounds(250,400,100,30);
       save.setBounds(140,400,100,30);
     
     
      
   setSize (600,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    
    
}
}

  
    
    



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

public class search_bithday_form  extends JFrame {

    private JTextArea phone;
    private JButton save, back;
    private JComboBox jan;

    public search_bithday_form() {

        phone = new JTextArea(" search_bithday_form");
        save = new JButton("search");
        back = new JButton("Back");
       jan =new JComboBox();

       /* save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 phone_search_form input= new  phone_search_form();

            }

        });*/

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 if (arg0.getSource().equals(back)){
                    setVisible(false
                    );
                 
     }
                search_contact_form input = new search_contact_form();

            }

        });
        
        
     DefaultComboBoxModel input =new  DefaultComboBoxModel();
       input.addElement("jan");
         input.addElement("feb");
           input.addElement("mar");
             input.addElement("april");
               input.addElement("may");
                 input.addElement("jun");
                   input.addElement("july");
                 jan.setModel(input);  
        
                
        add(jan);
        add(phone);
        add(save);
        add(back);


        setLayout(null);

        phone.setBounds(100, 20, 150, 20);
        jan.setBounds(250, 60, 130, 30);
        back.setBounds(250, 400, 100, 30);
        save.setBounds(140, 400, 100, 30);

        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}




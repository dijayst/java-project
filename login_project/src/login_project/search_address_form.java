package login_project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class search_address_form extends JFrame {

    private JTextArea phone;
    private JButton save, back;
    private JLabel entry_id;
    private JTextField entry;
    private  address_search tablepanel;
            
    public search_address_form() {

        phone = new JTextArea("search_address_form");
        save = new JButton("save");
        back = new JButton("Back");
        entry_id = new JLabel("Name:");
        entry = new JTextField(50);
        tablepanel= new address_search();
        
        
       /* save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                address_search input = new address_search();

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
        setLayout(new BorderLayout());
           add(tablepanel,BorderLayout.CENTER);
         

        add(phone);
        add(save);
        add(back);
        add(entry_id);
        add(entry);

        setLayout(null);

        phone.setBounds(100, 20, 150, 20);
        entry_id.setBounds(100, 60, 100, 30);
        entry.setBounds(250, 60, 130, 30);
        back.setBounds(250, 400, 100, 30);
        save.setBounds(140, 400, 100, 30);

        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

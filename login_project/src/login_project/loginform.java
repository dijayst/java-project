package login_project;

//import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginform extends JFrame implements ActionListener 
{

    // private JDialog mainDial;
    private JButton loginbutton;
    private JButton cancelbutton;
    private JButton exitbutton;
    private JTextField username;
    private JLabel namelabel, passwordlabel;
    private JPasswordField passwordfield;
  //  public static Connection conn;

    //constructor
    public loginform() {
        super("LOGIN FORM");
       // connectToDatabase();

        namelabel = new JLabel("Username:");
        passwordlabel = new JLabel("Password:");
        loginbutton = new JButton("Login");
        cancelbutton = new JButton("Cancel");
        exitbutton = new JButton("Exit");
        username = new JTextField("enter text here");
        passwordfield = new JPasswordField("mypass");

        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (arg0.getSource().equals(loginbutton)) {
                    setVisible(false
                    );
                    mainform input = new mainform();
                }

            }
        });

        cancelbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (arg0.getSource().equals(cancelbutton)) {
                    setVisible(false
                    );
                    loginform input = new loginform();
                }

            }
        });

      /*  exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }

        });
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
*/
      
       exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (arg0.getSource().equals(exitbutton)) {
                    setVisible(false
                    );
                    loginform input = new loginform();
                }

            }
        });

        add(namelabel);
        add(passwordlabel);
        add(username);
        add(passwordfield);
        add(loginbutton);
        add(cancelbutton);
        add(exitbutton);

 mainform input= new mainform();
        setLayout(null);
        //(posi going to left-/+right,position up-down,lengt,size)
        namelabel.setBounds(150, 135, 100, 30);
        username.setBounds(250, 135, 100, 30);
        passwordlabel.setBounds(150, 170, 100, 30);
        passwordfield.setBounds(250, 170, 100, 30);
        loginbutton.setBounds(50, 260, 100, 30);
        cancelbutton.setBounds(180, 260, 100, 30);
        exitbutton.setBounds(300, 260, 100, 30);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

   /* public void connectToDatabase(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_proj?zeroDateTimeBehavior=convertToNull", "root", "");
            System.out.println("Successfully connected to database");
        }catch(SQLException ex){
            System.out.println("Was'nt able to connect to database because of the following errors: \n " + ex);
        }
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

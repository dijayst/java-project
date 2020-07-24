package login_project;

import javax.swing.SwingUtilities;


public class joining {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            

            public void run() {
               
                new loginform();

            }
        });

    }
}

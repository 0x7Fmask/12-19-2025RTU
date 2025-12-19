
import javax.swing.*;
import java.util.ArrayList;

public class Autoserviss {
    public static void main(String[] args) {
       while(true){
            String[] options = {
                    "Create car",
                    "List cars",
                    "Delete car",
                    "Save cars to file",
                    "View saved file",
                    "Exit"
            };
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Autoserviss Menu",
                    "Autoserviss",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );
             if (choice == 0)       ;
             else if (choice == 1)  ;
             else if (choice == 2)  ;
             else if (choice == 3)  ;
             else if (choice == 4)  ;
             else break;
            



       }
    }
}
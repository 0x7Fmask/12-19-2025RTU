
import javax.swing.*;
import java.util.ArrayList;

public class Autoserviss {
    static ArrayList<Car> cars = new ArrayList<>();
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
             if (choice == 0)      addCar() ;
             else if (choice == 1)  listCars();
             else if (choice == 2)  ;
             else if (choice == 3)  ;
             else if (choice == 4)  ;
             else break;
            



       }
    }
    static void addCar() {
        String brand = askText("Brand:");
        String model = askText("Model:");
        int year = askInt("Gads:");

        int hp = askInt("Dzinēja HP/Jauda:");
        String gearbox = askText("Ātrumkārba (manual/auto):");
        int wheelSize = askInt("Riepu izmērs (col):");

        Engine e = new Engine(hp);
        Car c = new Car(brand, model, year, e, gearbox, wheelSize);   
        cars.add(c);
        JOptionPane.showMessageDialog(null, "Pievienots");
    }
    static void listCars() {
        if (cars.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nav mašīna pievienota.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cars.size(); i++) {
            sb.append(i).append(") ").append(cars.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }





























    // Util lietas lai parbaudīt ievadītos datus 1. Teksts 2. Cipari
    static String askText(String msg) {
        while (true) {
            String s = JOptionPane.showInputDialog(msg);
            if (s != null && !s.trim().isEmpty()) return s.trim();
            JOptionPane.showMessageDialog(null, "Nevar ievadīt tukšu tekstu!");
        }
    }
    static int askInt(String msg) {
        while (true) {
            String s = JOptionPane.showInputDialog(msg);
            try { return Integer.parseInt(s.trim()); }
            catch (Exception e) { JOptionPane.showMessageDialog(null, "Ievadi numuru"); }
        }
    }
}
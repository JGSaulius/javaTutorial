package BinarySearch;
import javax.swing.*;

public class PasswordCheck {
    public static void main(String[] args) {
        String  name = JOptionPane.showInputDialog("Type your user name");
        String start = name.substring(0, 3);
        if (start.equals("Adm")) {
            JOptionPane.showMessageDialog(null, "You are Administrator");
            String password = JOptionPane.showInputDialog("Type your password");
            if (password.equals("Kryptonite")) {
                JOptionPane.showMessageDialog(null, "Correct"); }
            else {
                JOptionPane.showMessageDialog(null, "Bad password");
            }
        }
        else JOptionPane.showMessageDialog(null, "Bad user name");
    }
}

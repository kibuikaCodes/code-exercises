import javax.swing.JOptionPane;

// public class HelloGUI {
//     static public void main( String args[]) {
//         JOptionPane.showMessageDialog(null, "Hujambo");
//     }
    
// }

public class HelloGUI {
    static public void main( String args[]) {
        String name = JOptionPane.showInputDialog(null, "Wewe ni?");
        // System.out.println("Sawa " + name);
        JOptionPane.showMessageDialog(null, "Sawa " + name);
    }
    
}
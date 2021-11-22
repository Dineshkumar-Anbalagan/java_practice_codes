import javax.swing.JOptionPane;

public class JavaGraphicalUserInterfaceProgram {
    public static void main(String[] args){
        
        String name = JOptionPane.showInputDialog("Enter your name : ");
        JOptionPane.showMessageDialog(null, "Hello "+name+". Welcome to my mac XD");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age please : "));
        JOptionPane.showMessageDialog(null, "Cool "+name+". I'm also the same age as you "+age+" hehe \n let's be frnds");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height? "));
        JOptionPane.showMessageDialog(null, "Hehe,.. are you just "+height+". you are shorter than me ><");

    }
}

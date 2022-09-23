import javax.swing.*;

class LearJava1{
    public static void main(String[] args) {
        System.out.println("Belajar JAVA");
        System.out.println("Sangat mudah sekali");
        System.out.println("dan sangat menyenangkan");

        

        String input=JOptionPane.showInputDialog( "Apakah kamu suka java  ? ");
        
        JOptionPane.showMessageDialog(null,input);
    }
}

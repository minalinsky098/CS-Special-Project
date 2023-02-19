import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class Main_Project {
    //Para ma dasig differenciate ang Objects
    Border DefaultBorder = BorderFactory.createLineBorder(Color.black,5);
    public Main_Project(){
        //Initializing Start Frame
        JFrame StartFrame = new JFrame("Starting Page");
        StartFrame.setVisible(true);
        StartFrame.setSize(1550,825);
        StartFrame.setResizable(false);
        StartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JPanels in StartFrame
        
    }
    public static void main(String args[]){
        new Main_Project();
    }
}
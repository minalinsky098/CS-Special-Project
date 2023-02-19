import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class Main_Project {

    //Design and Fonts
    Border DefaultBorder = BorderFactory.createLineBorder(Color.black,3); //Para ma dasig differenciate ang Objects Remove lang sa Final
    Font TitleFont = new Font("Helvetica", Font.BOLD, 50);


    //Objects in StartFrame
    JFrame StartFrame = new JFrame("Starting Page");
    JPanel SFTitlePanel = new JPanel();
    JPanel SFCreatorPanel = new JPanel();
    JPanel SFButtonPanel = new JPanel();
    JLabel SFTitle = new JLabel("Insert name");
    JLabel SFCreator = new JLabel("Creators: Names");
    JButton SFButton = new JButton("Start Quiz");

    //Objects in QuizFrame
    JFrame Quizframe = new JFrame("Quiz Frame");
    public Main_Project(){
        //Initializing Start Frame
        StartFrame.setVisible(true);
        StartFrame.setSize(1550,825);
        StartFrame.setResizable(false);
        StartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StartFrame.setLayout(new GridLayout(3,1));
        StartFrame.add(SFTitlePanel);
        StartFrame.add(SFCreatorPanel);
        StartFrame.add(SFButtonPanel);
        //JLabel in StartFrame
        SFTitle.setFont(TitleFont);
        SFTitle.setBorder(DefaultBorder);

        SFCreator.setFont(TitleFont);
        SFCreator.setBorder(DefaultBorder);
        //JPanels in StartFrame
        SFTitlePanel.setBorder(DefaultBorder);
        SFTitlePanel.add(SFTitle);

        SFCreatorPanel.setBorder(DefaultBorder);
        SFCreatorPanel.add(SFCreator);


        SFButtonPanel.setBorder(DefaultBorder);
        SFButtonPanel.add(SFButton);

        //JButtons in StartFrame
        SFButton.setFont(TitleFont);
        SFButton.setFocusable(false);
        Actions SFButtonPressed = new Actions();
        SFButton.addActionListener(SFButtonPressed);

        //Initializing QuizFrame
        Quizframe.setSize(1550,825);
        Quizframe.setVisible(false);
        Quizframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JRadioButton
        JRadioButton option1, option2, option3, option4;
        
    }
    public static void main(String args[]){
        new Main_Project();
    }
    public class Actions implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == SFButton){
                StartFrame.setVisible(false);
                Quizframe.setVisible(true);
            }
        }
    }
}
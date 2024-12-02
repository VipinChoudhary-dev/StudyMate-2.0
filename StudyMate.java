import javax.swing.*;
import java.awt.*;

public class StudyMate {
    public static void main(String[] args) {
       // for look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // for the outside GUI frame
        JFrame frame = new JFrame("StudyMate");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.getContentPane().setBackground(Color.decode("#424242"));

        // for the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 15, 15));
        panel.setBackground(Color.decode("#424242"));

        // for the button creation
        JButton studyvideoButton = new JButton("Video Links");
        JButton quizButton = new JButton("Tests");
        JButton assignmentButton = new JButton("Assignments");
        JButton wordGameButton = new JButton("Word Game");
        JButton numberGameButton = new JButton("Number Game");

        // for the button font style
        studyvideoButton.setFont(new Font("Arial", Font.BOLD, 30));
        quizButton.setFont(new Font("Arial", Font.BOLD, 30));
        assignmentButton.setFont(new Font("Arial", Font.BOLD, 30));
        wordGameButton.setFont(new Font("Arial", Font.BOLD, 30));
        numberGameButton.setFont(new Font("Arial", Font.BOLD, 30));
        
        // action listeners for buttons
        studyvideoButton.addActionListener(e -> {
            StudyVideos studyvideo = new StudyVideos();
            studyvideo.showVideoLinks();
        });

        quizButton.addActionListener(e -> {
            Quiz quiz = new Quiz();
            quiz.start();
        });

        assignmentButton.addActionListener(e -> {
            Assignment assignment = new Assignment();
            assignment.showAssignments();
        });

        wordGameButton.addActionListener(e -> {
            WordGuessGame wordGame = new WordGuessGame();
            wordGame.start();
        });

        numberGameButton.addActionListener(e -> {
            GuessTheNumberGame numberGame = new GuessTheNumberGame();
            numberGame.start();
        });

        // for adding buttons to panel
        panel.add(studyvideoButton);
        panel.add(quizButton);
        panel.add(assignmentButton);
        panel.add(wordGameButton);
        panel.add(numberGameButton);
        
        // for adding panel to frame
        frame.add(panel);
        // for making frame visible to screen
        frame.setVisible(true);
    }
}

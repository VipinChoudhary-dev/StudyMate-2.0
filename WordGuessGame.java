import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class WordGuessGame extends Game {
    private String[] wordList = {
        "array", "linkedlist", "stack", "queue", "deque"
    };

    public void start() {
        // for a random word
        Random random = new Random();
        String wordToGuess = wordList[random.nextInt(wordList.length)];

        // for starting the game
        JFrame gameFrame = new JFrame("Guess the Linear Data Structure Name :");
        gameFrame.setSize(800, 700);
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gameFrame.getContentPane().setBackground(Color.decode("#424242"));


        // Panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // text field for input
        JTextField guessField = new JTextField();
        guessField.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(guessField);

        // Label for instructions and results
        JLabel messageLabel = new JLabel("Guess the Linear Data Structure", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(messageLabel);

        // Button to submit guess
        JButton guessButton = new JButton("Submit Guess");
        guessButton.setFont(new Font("Arial", Font.BOLD, 22));

        // Action listener for button
        guessButton.addActionListener(e -> {
            String userGuess = guessField.getText().toLowerCase();

            // Check if the guess is correct
            if (userGuess.equals(wordToGuess)) {
                messageLabel.setText("Correct! The word was " + wordToGuess + ".");
                guessButton.setEnabled(false);
                displayMessage(gameFrame, "You guessed the word! The word was: " + wordToGuess);
            } else {
                messageLabel.setText("Wrong guess! Try again.");
            }
        });

        panel.add(guessButton);

        // Adding panel to frame
        gameFrame.add(panel, BorderLayout.CENTER);
        gameFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new WordGuessGame().start();
    }
}

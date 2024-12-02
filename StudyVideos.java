import javax.swing.*;
import java.awt.*;
import java.net.URI;

public class StudyVideos {
    public void showVideoLinks() {
        // Frame for video links
        JFrame frame = new JFrame("Study Videos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(new GridLayout(3, 1, 10, 10)); // Adjust rows for the number of links
        frame.getContentPane().setBackground(Color.decode("#424242"));

        // Video Links
        String[] videoTitles = {
            "1. Java Full Course for Beginners",
            "2. Data Structures and Algorithms for Beginners",
            "3. Operating Systems Course for Beginners"
        };
        String[] videoLinks = {
            "https://www.youtube.com/watch?v=eIrMbAQSU34&t=8s",
            "https://www.youtube.com/watch?v=BBpAmxU_NQo",
            "https://www.youtube.com/watch?v=yK1uBHPdp30"
        };

        // Create buttons for each video link
        for (int i = 0; i < videoTitles.length; i++) {
            String title = videoTitles[i];
            String link = videoLinks[i];

            JButton button = new JButton(title);
            button.setFont(new Font("Arial", Font.BOLD, 22));

            // Add action listener using a lambda expression
            button.addActionListener(e -> {
                try {
                    Desktop.getDesktop().browse(new URI(link));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Unable to open link: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            });

            frame.add(button);
        }

        // Display the frame
        frame.setVisible(true);
    }
}

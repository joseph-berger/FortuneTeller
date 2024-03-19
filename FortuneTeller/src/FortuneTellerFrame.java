import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class FortuneTellerFrame extends JFrame {
    private ArrayList<String> fortunes;
    private JTextArea fortuneTextArea;
    private int lastIndex = -1; // Initialize with -1 to ensure the first fortune is not repeated

    public FortuneTellerFrame(ArrayList<String> fortunes) {
        this.fortunes = fortunes;
        setTitle("Fortune Teller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Creating fonts
        Font titleFont = new Font("Monotype Corsiva", Font.BOLD, 36);
        Font buttonFont = new Font("Arial", Font.PLAIN, 16);
        Font fortuneFont = new Font("Arial", Font.PLAIN, 14);

        // Top panel
        JPanel topPanel = new JPanel();
        JLabel titleLabel = new JLabel("Fortune Teller");
        titleLabel.setFont(titleFont);
        ImageIcon icon = new ImageIcon("placeholder_image.png"); // Placeholder for the ImageIcon
        JLabel iconLabel = new JLabel(icon);
        topPanel.add(titleLabel);
        topPanel.add(iconLabel);

        // Middle panel
        JPanel middlePanel = new JPanel(new BorderLayout());
        fortuneTextArea = new JTextArea(10, 30);
        fortuneTextArea.setFont(fortuneFont);
        JScrollPane scrollPane = new JScrollPane(fortuneTextArea);
        middlePanel.add(scrollPane, BorderLayout.CENTER);

        // Bottom panel
        JPanel bottomPanel = new JPanel();
        JButton fortuneButton = new JButton("Read My Fortune!");
        fortuneButton.setFont(buttonFont);
        fortuneButton.addActionListener(e -> displayFortune());
        JButton quitButton = new JButton("Quit");
        quitButton.setFont(buttonFont);
        quitButton.addActionListener(e -> System.exit(0));
        bottomPanel.add(fortuneButton);
        bottomPanel.add(quitButton);

        // Adding panels to the frame
        add(topPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void displayFortune() {
        Random random = new Random();
        int index = random.nextInt(fortunes.size());
        // Make sure the same fortune is not repeated
        while (index == lastIndex) {
            index = random.nextInt(fortunes.size());
        }
        lastIndex = index;
        String fortune = fortunes.get(index);
        fortuneTextArea.append(fortune + "\n");
    }
}

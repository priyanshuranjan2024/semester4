package lab10;

import javax.swing.*;
import java.awt.*;

public class SimpleRGBSelector {
    
    public static void main(String[] args) {
        // Create frame on EDT
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    
    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("RGB Color Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        // Create main content panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Create controls panel for top section
        JPanel controlsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
        
        // Create the color display panel
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK);  // Initial color
        colorPanel.setPreferredSize(new Dimension(400, 250));
        
        // Create combo boxes
        JComboBox<Integer> redComboBox = createColorComboBox();
        JComboBox<Integer> greenComboBox = createColorComboBox();
        JComboBox<Integer> blueComboBox = createColorComboBox();
        
        // Create labels
        JLabel redLabel = new JLabel("Red");
        JLabel greenLabel = new JLabel("Green");
        JLabel blueLabel = new JLabel("Blue");
        redLabel.setForeground(Color.RED);
        greenLabel.setForeground(Color.GREEN);
        blueLabel.setForeground(Color.BLUE);
        
        // Create button
        JButton showOutputButton = new JButton("Show Output");
        
        // Add action listener to button
        showOutputButton.addActionListener(e -> {
            // Get values from combo boxes
            int red = (Integer) redComboBox.getSelectedItem();
            int green = (Integer) greenComboBox.getSelectedItem();
            int blue = (Integer) blueComboBox.getSelectedItem();
            
            // Create new color and update panel
            Color newColor = new Color(red, green, blue);
            colorPanel.setBackground(newColor);
            
            // Update frame title with RGB values
            frame.setTitle(String.format("RGB Color Selector - R:%d G:%d B:%d", red, green, blue));
            
            // Debug output
            System.out.println("Changed color to RGB: " + red + ", " + green + ", " + blue);
        });
        
        // Add everything to control panel
        controlsPanel.add(redLabel);
        controlsPanel.add(redComboBox);
        controlsPanel.add(greenLabel);
        controlsPanel.add(greenComboBox);
        controlsPanel.add(blueLabel);
        controlsPanel.add(blueComboBox);
        controlsPanel.add(showOutputButton);
        
        // Add panels to main panel
        mainPanel.add(controlsPanel, BorderLayout.NORTH);
        mainPanel.add(colorPanel, BorderLayout.CENTER);
        
        // Add main panel to frame
        frame.add(mainPanel);
        
        // Display the frame
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }
    
    // Helper method to create color combo boxes
    private static JComboBox<Integer> createColorComboBox() {
        Integer[] values = new Integer[256];
        for (int i = 0; i <= 255; i++) {
            values[i] = i;
        }
        JComboBox<Integer> comboBox = new JComboBox<>(values);
        comboBox.setPreferredSize(new Dimension(70, 25));
        return comboBox;
    }
}
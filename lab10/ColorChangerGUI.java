package lab10;

import javax.swing.*;
import java.awt.*;

public class ColorChangerGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        JList<String> colorList = new JList<>(colors);
        JButton changeColorButton = new JButton("Change Color");

        changeColorButton.addActionListener(e -> {
            String selectedColor = colorList.getSelectedValue();
            if (selectedColor != null) {
                switch (selectedColor) {
                    case "Red": panel.setBackground(Color.RED); break;
                    case "Green": panel.setBackground(Color.GREEN); break;
                    case "Blue": panel.setBackground(Color.BLUE); break;
                    case "Yellow": panel.setBackground(Color.YELLOW); break;
                }
            }
        });

        frame.add(new JScrollPane(colorList), BorderLayout.WEST);
        frame.add(changeColorButton, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
}


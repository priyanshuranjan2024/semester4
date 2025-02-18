package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Stopwatch implements ActionListener {
    private JFrame frame;
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private boolean running = false;
    private int elapsedTime = 0; // Time in milliseconds
    private Thread timerThread;

    public Stopwatch() {
        frame = new JFrame("Stopwatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        timeLabel = new JLabel("Time: 0 sec");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(timeLabel);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        frame.setVisible(true);
    }

    public void startTimer() {
        running = true;
        timerThread = new Thread(() -> {
            while (running) {
                try {
                    Thread.sleep(1000); // Update every second
                    elapsedTime++;
                    timeLabel.setText("Time: " + elapsedTime + " sec");
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });
        timerThread.start();
    }

    public void stopTimer() {
        running = false;
    }

    public void resetTimer() {
        stopTimer();
        elapsedTime = 0;
        timeLabel.setText("Time: 0 sec");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!running) startTimer();
        } else if (e.getSource() == stopButton) {
            stopTimer();
        } else if (e.getSource() == resetButton) {
            resetTimer();
        }
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}

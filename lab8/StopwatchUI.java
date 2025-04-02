package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopwatchUI implements ActionListener {
    private JFrame frame;
    private JLabel titleLabel, timeLabel;
    private JButton startButton, resetButton;
    private boolean running = false;

    private int hours = 0, minutes = 0, seconds = 0, milliseconds = 0;

    private Thread timerThread; 

    public StopwatchUI() {
        frame = new JFrame("Stopwatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(null);

        titleLabel = new JLabel("Stop Watch");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setBounds(120, 10, 200, 30);
        frame.add(titleLabel);

        timeLabel = new JLabel("00 : 00 : 00 . 00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timeLabel.setBounds(80, 50, 250, 30);
        frame.add(timeLabel);

        startButton = new JButton("Start");
        startButton.setBounds(70, 100, 90, 30);
        startButton.addActionListener(this);
        frame.add(startButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(180, 100, 90, 30);
        resetButton.addActionListener(this);
        frame.add(resetButton);

        frame.setVisible(true);
    }

    public void startTimer() {
        running = true;
        timerThread = new Thread(() -> {
            while (running) {
                try {
                    Thread.sleep(10); // Update every 10ms
                    milliseconds += 10;
                    if (milliseconds >= 1000) {
                        milliseconds = 0;
                        seconds++;
                    }
                    if (seconds >= 60) {
                        seconds = 0;
                        minutes++;
                    }
                    if (minutes >= 60) {
                        minutes = 0;
                        hours++;
                    }
                    timeLabel.setText(String.format("%02d : %02d : %02d . %02d", hours, minutes, seconds, milliseconds / 10));
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
        hours = minutes = seconds = milliseconds = 0;
        timeLabel.setText("00 : 00 : 00 . 00");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!running) {
                startButton.setText("Stop");
                startTimer();
            } else {
                startButton.setText("Start");
                stopTimer();
            }
        } else if (e.getSource() == resetButton) {
            startButton.setText("Start");
            resetTimer();
        }
    }

    public static void main(String[] args) {
        new StopwatchUI();
    }
}

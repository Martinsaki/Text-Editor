package editor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Add Frame to Main
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Shut down program
        frame.setVisible(true);
    }
}

class Frame extends JFrame{
    // Constructor Frame
    public Frame() {
        // Set Frame
        setBounds(300,300,300,300);
        setTitle("Text Editor");

        // Add Panel to Frame
        Panel panel = new Panel();
        add(panel);
    }
}

class Panel extends JPanel{
    // Constructor Panel
    public Panel() {

    }
}

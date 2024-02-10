package com.ajan.swingpaint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingPaint {

    JButton clearBtn, blackBtn, blueBtn, greenBtn, redBtn, magentaBtn, yellowBtn, cyanBtn, grayBtn;
    DrawArea drawArea;

    ActionListener actionListener = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clearBtn) {
                drawArea.clear();
            } else if (e.getSource() == blackBtn) {
                drawArea.black();
            } else if (e.getSource() == blueBtn) {
                drawArea.blue();
            } else if (e.getSource() == greenBtn) {
                drawArea.green();
            } else if (e.getSource() == redBtn) {
                drawArea.red();
            } else if (e.getSource() == magentaBtn) {
                drawArea.magenta();
            } else if (e.getSource() == yellowBtn) {
                drawArea.yellow();
            } 
             else if (e.getSource() == grayBtn) {
                drawArea.gray();
            }
        }
    };

    public static void main(String[] args) {
        new SwingPaint().show();
    }

    public void show() {
        // create main frame
        JFrame frame = new JFrame("Swing Paint");
        Container content = frame.getContentPane();
        // set layout on content pane
        content.setLayout(new BorderLayout());
        // create draw area
        drawArea = new DrawArea();

        // add to content pane
        content.add(drawArea, BorderLayout.CENTER);

        // create controls to apply colors and call clear feature
        JPanel controls = new JPanel();

        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(actionListener);

        blackBtn = new JButton("Black");
        blackBtn.addActionListener(actionListener);

        blueBtn = new JButton("Blue");
        blueBtn.addActionListener(actionListener);

        greenBtn = new JButton("Green");
        greenBtn.addActionListener(actionListener);

        redBtn = new JButton("Red");
        redBtn.addActionListener(actionListener);

        magentaBtn = new JButton("Magenta");
        magentaBtn.addActionListener(actionListener);

        yellowBtn = new JButton("Yellow");
        yellowBtn.addActionListener(actionListener);

        cyanBtn = new JButton("Cyan");
        cyanBtn.addActionListener(actionListener);

        grayBtn = new JButton("Gray");
        grayBtn.addActionListener(actionListener);

        // add to panel
        controls.add(greenBtn);
        controls.add(blueBtn);
        controls.add(blackBtn);
        controls.add(redBtn);
        controls.add(magentaBtn);

        // Add space for readability
        controls.add(new JPanel());
        controls.add(new JPanel());
        controls.add(new JPanel());

        controls.add(yellowBtn);
        controls.add(cyanBtn);
        controls.add(grayBtn);
        controls.add(clearBtn);

        // add to content pane
        content.add(controls, BorderLayout.NORTH);

        frame.setSize(1920, 1080);

        // can close frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show the swing paint result
        frame.setVisible(true);
    }
}

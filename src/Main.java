// swing

import javax.swing.*;
import java.awt.*;

class Main{

    static class Swing extends JFrame{

        // make a window container

        JFrame frame = new JFrame();

        // declare labels for form
        JLabel name = new JLabel("Name");
        JLabel surname = new JLabel("Surname");
        JLabel age = new JLabel("age");

        // make inputbox for labels textarea

        JTextField inputName = new JTextField("your name");
        JTextField inputSurname = new JTextField("your surname");
        JTextField inputAge = new JTextField("age");

        // submit button
        JButton button = new JButton("submit");

        public Swing()
        {
            // setting container
            frame.setVisible(true);
            frame.setSize(600,600);
            frame.setLayout(new GridLayout(5,3));
            // adding components
            frame.add(name);
            frame.add(inputName);
            frame.add(surname);
            frame.add(inputSurname);
            frame.add(age);
            frame.add(inputAge);
            frame.add(button);
        }



        public static void main(String[] args){

            new Swing();


        }


    }

}
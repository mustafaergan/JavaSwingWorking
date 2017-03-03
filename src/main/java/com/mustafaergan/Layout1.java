package com.mustafaergan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class Layout1 extends JFrame {

    public Layout1(){

        final Person person = new Person();

        FlowLayout flwLayout = new FlowLayout();

        setLayout(flwLayout);

        add(new JLabel("Veri"));

        final JTextField jTextField = new JTextField(15);

        add(jTextField);

        JButton button = new JButton("Gonder");

        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                person.setId(1);
                person.setName(jTextField.getText());
                Layout2 layout2 = new Layout2(person);
                layout2.setSize(100,100);
                layout2.setVisible(true);
                dispose();
            }
        });

    }
}

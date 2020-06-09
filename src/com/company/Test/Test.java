package com.company.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    private JButton buttonMsg;
    private JPanel containerMain;

    public Test() {
        buttonMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Que pedo");
            }
        });
    }

    public JPanel getContainerMain() {
        return containerMain;
    }
}

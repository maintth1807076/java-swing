package com.heleyquin;

import com.heleyquin.dao.UserDAO;
import com.heleyquin.entity.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JPanel {
    private JButton viewButton;
    private JTextField username;
    private UserDAO userDAO = new UserDAO();

    public void init() {
        add(viewButton);
        add(username);
        viewButton.addActionListener(e -> {
            viewButton.setText("Change");
            String usernameText = username.getText();
            User user = User.builder().username(usernameText).build();
            userDAO.insertUser(user);
        });
    }
}

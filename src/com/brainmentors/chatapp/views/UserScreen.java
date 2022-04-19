package com.brainmentors.chatapp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class UserScreen extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;


	public static void main(String[] args) {
		
					UserScreen window = new UserScreen();
				
	}

	/**
	 * Create the application.
	 */
	public UserScreen() {
		setResizable(false);
		setTitle("LOGIN");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(119, 73, 134, -55);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(195, 11, 185, 59);
		getContentPane().add(lblNewLabel_1);
		
		JLabel useridlbl = new JLabel("Userid\r\n");
		useridlbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		useridlbl.setBounds(89, 116, 65, 14);
		getContentPane().add(useridlbl);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(242, 116, 214, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel pwdlbl = new JLabel("Password");
		pwdlbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		pwdlbl.setBounds(89, 169, 112, 14);
		getContentPane().add(pwdlbl);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(242, 169, 214, 20);
		getContentPane().add(passwordField);
		
		JButton loginbt = new JButton("Login\r\n");
		loginbt.setFont(new Font("Tahoma", Font.BOLD, 16));
		loginbt.setBounds(164, 228, 89, 23);
		getContentPane().add(loginbt);
		
		JButton registerbt = new JButton("Register");
		registerbt.setFont(new Font("Tahoma", Font.BOLD, 16));
		registerbt.setBounds(287, 228, 124, 23);
		getContentPane().add(registerbt);
		setBackground(Color.WHITE);
		setBounds(100,300,557,319);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}



package com.johannpando.chapter8._1.SampleApplicationUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewFlashCard implements ActionListener {

	JFrame f = new JFrame("OCP Java SE 7 - New FlashCard");
	JTextField tfMainObj = null;
	JTextField tfSubObj = null;
	JTextField tfNote = null;
	JButton btnSave = null;
	JButton btnClear = null;
	JButton btnExit = null;

	@Override
	public void actionPerformed(ActionEvent e) {
		String baseDir = "C:\\OCPJAVA7\\";
		String subDir = tfMainObj.getText();
		String fileName = tfSubObj.getText() + ".txt";
		Path path = Paths.get(baseDir, subDir, fileName);

		JOptionPane.showMessageDialog(f, path.toString());
	}

	private void buildUI() {
		tfMainObj = new JTextField();
		tfSubObj = new JTextField();
		tfNote = new JTextField();
		btnSave = new JButton("Save");
		btnSave.addActionListener(this);

		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(6, 2));
		topPanel.add(new JLabel(""));
		topPanel.add(new JLabel(""));

		topPanel.add(new JLabel(" Main objective number"));
		topPanel.add(tfMainObj);
		topPanel.add(new JLabel(""));
		topPanel.add(new JLabel(""));
		topPanel.add(new JLabel(" Sub objective number"));
		topPanel.add(tfSubObj);
		topPanel.add(new JLabel(""));
		topPanel.add(new JLabel(""));
		topPanel.add(new JLabel(" FlashCard text:"));
		topPanel.add(new JLabel(""));

		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new BorderLayout());
		middlePanel.add(tfNote);

		JPanel bottomPanel = new JPanel();
		bottomPanel.add(btnSave);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(BorderLayout.NORTH, topPanel);
		mainPanel.add(BorderLayout.CENTER, middlePanel);
		mainPanel.add(BorderLayout.SOUTH, bottomPanel);

		f.getContentPane().setLayout(new BorderLayout());
		f.setSize(500, 250);
		f.getContentPane().add(mainPanel);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		NewFlashCard nfc = new NewFlashCard();
		nfc.buildUI();
	}
}

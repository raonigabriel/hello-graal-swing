package com.github.raonigabriel;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SwingApp {

	private JFrame frmHelloGraalSwin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingApp window = new SwingApp();
					window.frmHelloGraalSwin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHelloGraalSwin = new JFrame();
		frmHelloGraalSwin.setTitle("Hello Graal Swing");
		frmHelloGraalSwin.setBounds(100, 100, 450, 300);
		frmHelloGraalSwin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

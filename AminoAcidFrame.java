package project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Matrix.Main;

public class AminoAcidFrame extends AmAcidFrame {

	public AminoAcidFrame() {
	}

	public static void createGUI() {

		// Main frame
		final AmAcidFrame frame = new AmAcidFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 650));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		JFrame.setDefaultLookAndFeelDecorated(true);

		// Info Pane
		InfoPane infoPane = new InfoPane();
		infoPane.setBackground(Color.WHITE);
		infoPane.setSize(200, 400);
		infoPane.setLocation(760, 150);
		infoPane.setLayout(null);
		frame.add(infoPane);
		JLabel labelInf = new JLabel("Amino acid info");
		labelInf.setSize(200, 20);
		labelInf.setLocation(765, 120);
		frame.add(labelInf);

		JTextArea acidName = new JTextArea("kkk");
		acidName.setSize(150, 20);
		acidName.setLocation(765, 220);
		acidName.setBackground(Color.GRAY);
		acidName.setVisible(true);
		infoPane.add(acidName);

		// NONPOLAR PANE

		final AmAcidPane nonPolPane = frame.addAmAcidPane(frame);
		nonPolPane.addAmAcid1(nonPolPane, infoPane, "Glycine", "glycine.jpg");
		nonPolPane.addAmAcid2(nonPolPane, "Alanine", "alanine.jpg");
		nonPolPane.addAmAcid3(nonPolPane, "Valine", "valine.jpg");
		nonPolPane.addAmAcid4(nonPolPane, "Leucine", "leucine.jpg");
		nonPolPane.addAmAcid5(nonPolPane, "Methionine", "methionine.jpg");
		nonPolPane.addAmAcid6(nonPolPane, "Isoleucine", "isoleucine.jpg");

		// Polar pane
		final AmAcidPane polPane = frame.addAmAcidPane(frame);
		polPane.addAmAcid1(polPane, infoPane, "Serine", "ser.jpg");
		polPane.addAmAcid2(polPane, "Theronine", "thr.jpg");
		polPane.addAmAcid3(polPane, "Cysteine", "cys.jpg");
		polPane.addAmAcid4(polPane, "Proline", "pro.jpg");
		polPane.addAmAcid5(polPane, "Asparagine", "asn.jpg");
		polPane.addAmAcid6(polPane, "Glutamine", "gln.jpg");

		final AmAcidPane aromPane = frame.addAmAcidPane(frame);
		aromPane.addAmAcid1(aromPane, infoPane, "Phenylalanine", "phe.jpg");
		aromPane.addAmAcid2(aromPane, "Tyrosine", "tyr.jpg");
		aromPane.addAmAcid3(aromPane, "Tryptophan", "trp.jpg");

		// Buttons
		JButton nonPButton = frame.addButton(frame, "Nonpolar", 30, 25);
		JButton polButton = frame.addButton(frame, "Polar", 150, 25);
		JButton aromButton = frame.addButton(frame, "Aromatic", 270, 25);

		// обработка нажатия 
		class NonPolListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				nonPolPane.setVisible(true);
				polPane.setVisible(false);
				aromPane.setVisible(false);
			}
		}
		ActionListener nonPolListener = new NonPolListener();
		nonPButton.addActionListener(nonPolListener);

		class PolListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				polPane.setVisible(true);
				nonPolPane.setVisible(false);
				aromPane.setVisible(false);
			}
		}
		ActionListener polListener = new PolListener();
		polButton.addActionListener(polListener);

		class AromListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				aromPane.setVisible(true);
				polPane.setVisible(false);
				nonPolPane.setVisible(false);
			}
		}
		ActionListener aromListener = new AromListener();
		aromButton.addActionListener(aromListener);

		frame.setLayout(null);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					createGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

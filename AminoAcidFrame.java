public class AminoAcidFrame {

	public static void createGUI() {

		// Main frame
		JFrame frame = new JFrame("Информация об аминокислотах");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 700));
		frame.getContentPane().setBackground(Color.WHITE);
		// JFrame.setDefaultLookAndFeelDecorated(true);
		// Lys
		/*
		 * JLabel labelLys = new JLabel("Lysine");
		 * frame.getContentPane().add(labelLys); labelLys.setSize(100, 100);
		 * labelLys.setLocation(250, 0); frame.add(labelLys); JPanel
		 * imagePane1Lys = new JPanel(); JLabel imageLabelLys = new JLabel(new
		 * ImageIcon("lysine.jpg")); imagePane1Lys.add(imageLabelLys);
		 * imageLabelLys.setSize(100, 163);
		 * imageLabelLys.setBackground(Color.GRAY);
		 * imageLabelLys.setLocation(220, 50); frame.add(imageLabelLys);
		 */

		// Gly
		JLabel labelGly = new JLabel("Glycine");
		frame.getContentPane().add(labelGly);
		labelGly.setSize(100, 100);
		labelGly.setLocation(100, 0);
		frame.add(labelGly);
		JPanel imagePane1Gly = new JPanel();
		JLabel imageLabelGly = new JLabel(new ImageIcon("glycine.jpg"));
		imagePane1Gly.add(imageLabelGly);
		imageLabelGly.setSize(200, 200);
		imageLabelGly.setLocation(20, 45);
		frame.add(imageLabelGly);

		// Ala
		JLabel labelAla = new JLabel("Alanine");
		frame.getContentPane().add(labelAla);
		labelAla.setSize(100, 100);
		labelAla.setLocation(310, 0);
		frame.add(labelAla);
		JPanel imagePane1Ala = new JPanel();
		JLabel imageLabelAla = new JLabel(new ImageIcon("alanine.jpg"));
		imagePane1Ala.add(imageLabelAla);
		imageLabelAla.setSize(200, 200);
		imageLabelAla.setLocation(220, 50);
		frame.add(imageLabelAla);

		// Val
		JLabel labelVal = new JLabel("Valine");
		frame.getContentPane().add(labelAla);
		labelVal.setSize(100, 100);
		labelVal.setLocation(510, 0);
		frame.add(labelVal);
		JPanel imagePane1Val = new JPanel();
		JLabel imageLabelVal = new JLabel(new ImageIcon("valine.jpg"));
		imagePane1Ala.add(imageLabelVal);
		imageLabelVal.setSize(200, 200);
		imageLabelVal.setLocation(420, 50);
		frame.add(imageLabelVal);

		// Leu
		JLabel labelLeu = new JLabel("Leucine");
		frame.getContentPane().add(labelAla);
		labelLeu.setSize(100, 100);
		labelLeu.setLocation(100, 200);
		frame.add(labelLeu);
		JPanel imagePane1Leu = new JPanel();
		JLabel imageLabelLeu = new JLabel(new ImageIcon("leucine.jpg"));
		imageLabelLeu.setSize(200, 200);
		imageLabelLeu.setLocation(20, 250);
		frame.add(imageLabelLeu);

		// Met
		JLabel labelMet = new JLabel("Methionine");
		frame.getContentPane().add(labelMet);
		labelMet.setSize(100, 100);
		labelMet.setLocation(310, 200);
		frame.add(labelMet);
		JPanel imagePane1Met = new JPanel();
		JLabel imageLabelMet = new JLabel(new ImageIcon("methionine.jpg"));
		imageLabelMet.setSize(200, 200);
		imageLabelMet.setLocation(220, 265);
		frame.add(imageLabelMet);

		// Ile
		JLabel labelIle = new JLabel("Isoleucine");
		frame.getContentPane().add(labelIle);
		labelIle.setSize(100, 100);
		labelIle.setLocation(500, 210);
		frame.add(labelIle);
		JPanel imagePane1Ile = new JPanel();
		JLabel imageLabelIle = new JLabel(new ImageIcon("isoleucine.jpg"));
		imageLabelIle.setSize(200, 200);
		imageLabelIle.setLocation(420, 265);
		frame.add(imageLabelIle);
		/*
		 * imagePane1Ile.addMouseListener(new MyMouseListener());
		 * 
		 * JLabel eventLabel = new JLabel("isoleucine.jpg");
		 * labelIle.setSize(100, 100); labelIle.setLocation(600, 500);
		 */
		frame.add(labelIle);

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

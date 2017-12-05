package returngift;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class AppUI {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppUI window = new AppUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1400, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		

		ImageIcon imageIcon = new ImageIcon("resources/Logomakr_0yrkeW.png"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(600, 490,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);

		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Account", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblIcon = new JLabel(imageIcon);
		GridBagConstraints gbc_lblIcon = new GridBagConstraints();
		gbc_lblIcon.gridheight = 19;
		gbc_lblIcon.gridwidth = 9;
		gbc_lblIcon.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcon.gridx = 2;
		gbc_lblIcon.gridy = 12;
		panel.add(lblIcon, gbc_lblIcon);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Search", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{200, 87, 110, 87, 250, 525, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{31, 22, 16, 22, 16, 22, 16, 25, 25, 25, 25, 25, 25, 16, 22, 16, 26, 16, 26, 16, 22, 16, 26, 53, 41, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblGender = new JLabel("Gender");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.SOUTH;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 2;
		gbc_lblGender.gridy = 0;
		panel_1.add(lblGender, gbc_lblGender);
		
		JComboBox comboBox_4 = new JComboBox();
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.gridwidth = 3;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 1;
		panel_1.add(comboBox_4, gbc_comboBox_4);
		
		JLabel lblAge = new JLabel("Age");
		GridBagConstraints gbc_lblAge = new GridBagConstraints();
		gbc_lblAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge.gridx = 2;
		gbc_lblAge.gridy = 2;
		panel_1.add(lblAge, gbc_lblAge);
		
		JComboBox comboBox_3 = new JComboBox();
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.gridwidth = 3;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 3;
		panel_1.add(comboBox_3, gbc_comboBox_3);
		
		JLabel lblPersonality = new JLabel("Personality");
		GridBagConstraints gbc_lblPersonality = new GridBagConstraints();
		gbc_lblPersonality.anchor = GridBagConstraints.NORTH;
		gbc_lblPersonality.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonality.gridx = 2;
		gbc_lblPersonality.gridy = 4;
		panel_1.add(lblPersonality, gbc_lblPersonality);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.gridwidth = 3;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 5;
		panel_1.add(comboBox_2, gbc_comboBox_2);
		
		JLabel lblInterests = new JLabel("Interests");
		GridBagConstraints gbc_lblInterests = new GridBagConstraints();
		gbc_lblInterests.anchor = GridBagConstraints.NORTH;
		gbc_lblInterests.insets = new Insets(0, 0, 5, 5);
		gbc_lblInterests.gridx = 2;
		gbc_lblInterests.gridy = 6;
		panel_1.add(lblInterests, gbc_lblInterests);
		
		JCheckBox chckbxInterest = new JCheckBox("Interest01");
		GridBagConstraints gbc_chckbxInterest = new GridBagConstraints();
		gbc_chckbxInterest.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest.gridx = 1;
		gbc_chckbxInterest.gridy = 7;
		panel_1.add(chckbxInterest, gbc_chckbxInterest);
		
		JCheckBox chckbxInterest_5 = new JCheckBox("Interest07");
		GridBagConstraints gbc_chckbxInterest_5 = new GridBagConstraints();
		gbc_chckbxInterest_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_5.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_5.gridx = 3;
		gbc_chckbxInterest_5.gridy = 7;
		panel_1.add(chckbxInterest_5, gbc_chckbxInterest_5);
		
		JCheckBox chckbxInterest_1 = new JCheckBox("Interest02");
		GridBagConstraints gbc_chckbxInterest_1 = new GridBagConstraints();
		gbc_chckbxInterest_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_1.gridx = 1;
		gbc_chckbxInterest_1.gridy = 8;
		panel_1.add(chckbxInterest_1, gbc_chckbxInterest_1);
		
		JCheckBox chckbxInterest_7 = new JCheckBox("Interest08");
		GridBagConstraints gbc_chckbxInterest_7 = new GridBagConstraints();
		gbc_chckbxInterest_7.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_7.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_7.gridx = 3;
		gbc_chckbxInterest_7.gridy = 8;
		panel_1.add(chckbxInterest_7, gbc_chckbxInterest_7);
		
		JCheckBox chckbxInterest_2 = new JCheckBox("Interest03");
		GridBagConstraints gbc_chckbxInterest_2 = new GridBagConstraints();
		gbc_chckbxInterest_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_2.gridx = 1;
		gbc_chckbxInterest_2.gridy = 9;
		panel_1.add(chckbxInterest_2, gbc_chckbxInterest_2);
		
		JCheckBox chckbxInterest_8 = new JCheckBox("Interest09");
		GridBagConstraints gbc_chckbxInterest_8 = new GridBagConstraints();
		gbc_chckbxInterest_8.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_8.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_8.gridx = 3;
		gbc_chckbxInterest_8.gridy = 9;
		panel_1.add(chckbxInterest_8, gbc_chckbxInterest_8);
		
		JCheckBox chckbxInterest_3 = new JCheckBox("Interest04");
		GridBagConstraints gbc_chckbxInterest_3 = new GridBagConstraints();
		gbc_chckbxInterest_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_3.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_3.gridx = 1;
		gbc_chckbxInterest_3.gridy = 10;
		panel_1.add(chckbxInterest_3, gbc_chckbxInterest_3);
		
		JCheckBox chckbxInterest_9 = new JCheckBox("Interest10");
		GridBagConstraints gbc_chckbxInterest_9 = new GridBagConstraints();
		gbc_chckbxInterest_9.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_9.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_9.gridx = 3;
		gbc_chckbxInterest_9.gridy = 10;
		panel_1.add(chckbxInterest_9, gbc_chckbxInterest_9);
		
		JCheckBox chckbxInterest_4 = new JCheckBox("Interest05");
		GridBagConstraints gbc_chckbxInterest_4 = new GridBagConstraints();
		gbc_chckbxInterest_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_4.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_4.gridx = 1;
		gbc_chckbxInterest_4.gridy = 11;
		panel_1.add(chckbxInterest_4, gbc_chckbxInterest_4);
		
		JCheckBox chckbxInterest_10 = new JCheckBox("Interest11");
		GridBagConstraints gbc_chckbxInterest_10 = new GridBagConstraints();
		gbc_chckbxInterest_10.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_10.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_10.gridx = 3;
		gbc_chckbxInterest_10.gridy = 11;
		panel_1.add(chckbxInterest_10, gbc_chckbxInterest_10);
		
		JCheckBox chckbxInterest_6 = new JCheckBox("Interest06");
		GridBagConstraints gbc_chckbxInterest_6 = new GridBagConstraints();
		gbc_chckbxInterest_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_6.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_6.gridx = 1;
		gbc_chckbxInterest_6.gridy = 12;
		panel_1.add(chckbxInterest_6, gbc_chckbxInterest_6);
		
		JCheckBox chckbxInterest_11 = new JCheckBox("Interest12");
		GridBagConstraints gbc_chckbxInterest_11 = new GridBagConstraints();
		gbc_chckbxInterest_11.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_11.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_11.gridx = 3;
		gbc_chckbxInterest_11.gridy = 12;
		panel_1.add(chckbxInterest_11, gbc_chckbxInterest_11);
		
		JLabel lblOccasion = new JLabel("Occasion");
		GridBagConstraints gbc_lblOccasion = new GridBagConstraints();
		gbc_lblOccasion.anchor = GridBagConstraints.NORTH;
		gbc_lblOccasion.insets = new Insets(0, 0, 5, 5);
		gbc_lblOccasion.gridx = 2;
		gbc_lblOccasion.gridy = 13;
		panel_1.add(lblOccasion, gbc_lblOccasion);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 14;
		panel_1.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblRelationshipLevel = new JLabel("Relationship Level");
		GridBagConstraints gbc_lblRelationshipLevel = new GridBagConstraints();
		gbc_lblRelationshipLevel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblRelationshipLevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblRelationshipLevel.gridwidth = 2;
		gbc_lblRelationshipLevel.gridx = 2;
		gbc_lblRelationshipLevel.gridy = 15;
		panel_1.add(lblRelationshipLevel, gbc_lblRelationshipLevel);
		
		JSlider slider_2 = new JSlider();
		GridBagConstraints gbc_slider_2 = new GridBagConstraints();
		gbc_slider_2.anchor = GridBagConstraints.NORTH;
		gbc_slider_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider_2.insets = new Insets(0, 0, 5, 5);
		gbc_slider_2.gridwidth = 3;
		gbc_slider_2.gridx = 1;
		gbc_slider_2.gridy = 16;
		panel_1.add(slider_2, gbc_slider_2);
		
		JLabel lblCreativityLevel = new JLabel("Creativity Level");
		GridBagConstraints gbc_lblCreativityLevel = new GridBagConstraints();
		gbc_lblCreativityLevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreativityLevel.gridx = 2;
		gbc_lblCreativityLevel.gridy = 17;
		panel_1.add(lblCreativityLevel, gbc_lblCreativityLevel);
		
		JSlider slider_1 = new JSlider();
		GridBagConstraints gbc_slider_1 = new GridBagConstraints();
		gbc_slider_1.anchor = GridBagConstraints.NORTH;
		gbc_slider_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider_1.insets = new Insets(0, 0, 5, 5);
		gbc_slider_1.gridwidth = 3;
		gbc_slider_1.gridx = 1;
		gbc_slider_1.gridy = 18;
		panel_1.add(slider_1, gbc_slider_1);
		
		JLabel lblColor = new JLabel("Color");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.anchor = GridBagConstraints.NORTH;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 2;
		gbc_lblColor.gridy = 19;
		panel_1.add(lblColor, gbc_lblColor);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 20;
		panel_1.add(comboBox, gbc_comboBox);
		
		JLabel lblPriceRange = new JLabel("Price Range");
		GridBagConstraints gbc_lblPriceRange = new GridBagConstraints();
		gbc_lblPriceRange.anchor = GridBagConstraints.NORTH;
		gbc_lblPriceRange.insets = new Insets(0, 0, 5, 5);
		gbc_lblPriceRange.gridx = 2;
		gbc_lblPriceRange.gridy = 21;
		panel_1.add(lblPriceRange, gbc_lblPriceRange);
		
		JSlider slider = new JSlider();
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.anchor = GridBagConstraints.NORTH;
		gbc_slider.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider.insets = new Insets(0, 0, 5, 5);
		gbc_slider.gridwidth = 3;
		gbc_slider.gridx = 1;
		gbc_slider.gridy = 22;
		panel_1.add(slider, gbc_slider);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.anchor = GridBagConstraints.NORTH;
		gbc_btnSearch.insets = new Insets(0, 0, 0, 5);
		gbc_btnSearch.gridwidth = 3;
		gbc_btnSearch.gridx = 1;
		gbc_btnSearch.gridy = 24;
		panel_1.add(btnSearch, gbc_btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridheight = 25;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 5;
		gbc_scrollPane.gridy = 0;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Browser", null, panel_2, null);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0};
		gbl_panel_2.rowHeights = new int[]{0};
		gbl_panel_2.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Personality Test", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Forum", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Feedback", null, panel_5, null);
		panel_5.setLayout(null);
	}
}

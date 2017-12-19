package returngift;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class PersonalityTest {

	public static JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6,
			lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12, lblNewLabel_13,
			lblNewLabel_14, lblNewLabel_15, lblNewLabel_16, lblNewLabel_17, lblNewLabel_18, lblNewLabel_19,
			lblNewLabel_20, lblNewLabel_21, lblNewLabel_22, lblNewLabel_23, lblNewLabel_24, lblNewLabel_25,
			lblNewLabel_26, lblPersonality_1;

	public static JRadioButton rdbtnNewRadioButton, rdbtnNewRadioButton_1, rdbtnNewRadioButton_2, rdbtnNewRadioButton_3,
			rdbtnNewRadioButton_4, rdbtnNewRadioButton_5, rdbtnNewRadioButton_6, rdbtnNewRadioButton_7,
			rdbtnNewRadioButton_8, rdbtnNewRadioButton_9, rdbtnNewRadioButton_10, rdbtnNewRadioButton_11,
			rdbtnNewRadioButton_12, rdbtnNewRadioButton_13, rdbtnNewRadioButton_14, rdbtnNewRadioButton_15,
			rdbtnNewRadioButton_16, rdbtnNewRadioButton_17, rdbtnNewRadioButton_18, rdbtnNewRadioButton_39,
			rdbtnNewRadioButton_19, rdbtnNewRadioButton_20, rdbtnNewRadioButton_21, rdbtnNewRadioButton_22,
			rdbtnNewRadioButton_23, rdbtnNewRadioButton_24, rdbtnNewRadioButton_25, rdbtnNewRadioButton_26,
			rdbtnNewRadioButton_27, rdbtnNewRadioButton_28, rdbtnNewRadioButton_29, rdbtnNewRadioButton_30,
			rdbtnNewRadioButton_31, rdbtnNewRadioButton_32, rdbtnNewRadioButton_33, rdbtnNewRadioButton_34,
			rdbtnNewRadioButton_35, rdbtnNewRadioButton_36, rdbtnNewRadioButton_37, rdbtnNewRadioButton_38;
	public static JSeparator separator;
	public static JButton btnSubmit, btnInfo;
	public static JTextField textfield;

	public static void personalityTest() {

		lblPersonality_1 = new JLabel("Personality Test");
		lblPersonality_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblPersonality_1 = new GridBagConstraints();
		gbc_lblPersonality_1.gridwidth = 5;
		gbc_lblPersonality_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblPersonality_1.gridx = 8;
		gbc_lblPersonality_1.gridy = 0;
		AppUI.personalitytest.add(lblPersonality_1, gbc_lblPersonality_1);

		lblNewLabel = new JLabel("© 2016 Personality Academy");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 8;
		gbc_lblNewLabel.gridy = 1;
		AppUI.personalitytest.add(lblNewLabel, gbc_lblNewLabel);

		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 5;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 8;
		gbc_separator.gridy = 2;
		AppUI.personalitytest.add(separator, gbc_separator);

		lblNewLabel_3 = new JLabel("General Orientation: Extraversion - Introversion");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 8;
		gbc_lblNewLabel_3.gridy = 4;
		AppUI.personalitytest.add(lblNewLabel_3, gbc_lblNewLabel_3);

		lblNewLabel_1 = new JLabel("Modes of Operation:  Planned - Spontaneous");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 9;
		gbc_lblNewLabel_1.gridy = 4;
		AppUI.personalitytest.add(lblNewLabel_1, gbc_lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Information Gathering: Hands-On - Theoretical");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 11;
		gbc_lblNewLabel_2.gridy = 4;
		AppUI.personalitytest.add(lblNewLabel_2, gbc_lblNewLabel_2);

		lblNewLabel_4 = new JLabel("Making Decisions: Objective- Subjective");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 12;
		gbc_lblNewLabel_4.gridy = 4;
		AppUI.personalitytest.add(lblNewLabel_4, gbc_lblNewLabel_4);

		ButtonGroup group1 = new ButtonGroup();
		ButtonGroup group2 = new ButtonGroup();
		ButtonGroup group3 = new ButtonGroup();
		ButtonGroup group4 = new ButtonGroup();
		ButtonGroup group5 = new ButtonGroup();
		ButtonGroup group6 = new ButtonGroup();
		ButtonGroup group7 = new ButtonGroup();
		ButtonGroup group8 = new ButtonGroup();
		ButtonGroup group9 = new ButtonGroup();
		ButtonGroup group10 = new ButtonGroup();
		ButtonGroup group11 = new ButtonGroup();
		ButtonGroup group12 = new ButtonGroup();
		ButtonGroup group13 = new ButtonGroup();
		ButtonGroup group14 = new ButtonGroup();
		ButtonGroup group15 = new ButtonGroup();
		ButtonGroup group16 = new ButtonGroup();
		ButtonGroup group17 = new ButtonGroup();
		ButtonGroup group18 = new ButtonGroup();
		ButtonGroup group19 = new ButtonGroup();
		ButtonGroup group20 = new ButtonGroup();

		lblNewLabel_5 = new JLabel("1. Study Environment");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 8;
		gbc_lblNewLabel_5.gridy = 6;
		AppUI.personalitytest.add(lblNewLabel_5, gbc_lblNewLabel_5);

		lblNewLabel_8 = new JLabel("1. Packing for a Trip");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 9;
		gbc_lblNewLabel_8.gridy = 6;
		AppUI.personalitytest.add(lblNewLabel_8, gbc_lblNewLabel_8);

		lblNewLabel_7 = new JLabel(" 1. Strengths");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 11;
		gbc_lblNewLabel_7.gridy = 6;
		AppUI.personalitytest.add(lblNewLabel_7, gbc_lblNewLabel_7);

		lblNewLabel_6 = new JLabel("1. Movie-Watching");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_6.gridx = 12;
		gbc_lblNewLabel_6.gridy = 6;
		AppUI.personalitytest.add(lblNewLabel_6, gbc_lblNewLabel_6);

		rdbtnNewRadioButton = new JRadioButton("prefer to study in a group having conversations");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 8;
		gbc_rdbtnNewRadioButton.gridy = 7;
		AppUI.personalitytest.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);

		rdbtnNewRadioButton_12 = new JRadioButton("prefer to study alone in a distraction free setting");
		GridBagConstraints gbc_rdbtnNewRadioButton_12 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_12.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_12.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_12.gridx = 8;
		gbc_rdbtnNewRadioButton_12.gridy = 8;
		AppUI.personalitytest.add(rdbtnNewRadioButton_12, gbc_rdbtnNewRadioButton_12);

		group1.add(rdbtnNewRadioButton);
		group1.add(rdbtnNewRadioButton_12);

		rdbtnNewRadioButton_2 = new JRadioButton("pack in advance for a trip (at least the night before)");
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 9;
		gbc_rdbtnNewRadioButton_2.gridy = 7;
		AppUI.personalitytest.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);

		rdbtnNewRadioButton_13 = new JRadioButton("pack the very last minute for a trip");
		GridBagConstraints gbc_rdbtnNewRadioButton_13 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_13.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_13.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_13.gridx = 9;
		gbc_rdbtnNewRadioButton_13.gridy = 8;
		AppUI.personalitytest.add(rdbtnNewRadioButton_13, gbc_rdbtnNewRadioButton_13);

		group2.add(rdbtnNewRadioButton_2);
		group2.add(rdbtnNewRadioButton_13);

		rdbtnNewRadioButton_3 = new JRadioButton("good at building, maintaining, and operating things");
		GridBagConstraints gbc_rdbtnNewRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_3.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_3.gridx = 11;
		gbc_rdbtnNewRadioButton_3.gridy = 7;
		AppUI.personalitytest.add(rdbtnNewRadioButton_3, gbc_rdbtnNewRadioButton_3);

		rdbtnNewRadioButton_14 = new JRadioButton("good at developing insights into creative designs");
		GridBagConstraints gbc_rdbtnNewRadioButton_14 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_14.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_14.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_14.gridx = 11;
		gbc_rdbtnNewRadioButton_14.gridy = 8;
		AppUI.personalitytest.add(rdbtnNewRadioButton_14, gbc_rdbtnNewRadioButton_14);

		group3.add(rdbtnNewRadioButton_3);
		group3.add(rdbtnNewRadioButton_14);

		rdbtnNewRadioButton_1 = new JRadioButton("mistakes in a movie significantly lessen enjoyment");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_1.gridx = 12;
		gbc_rdbtnNewRadioButton_1.gridy = 7;
		AppUI.personalitytest.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_15 = new JRadioButton("able to look past mistakes and enjoy a movie");
		GridBagConstraints gbc_rdbtnNewRadioButton_15 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_15.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_15.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_15.gridx = 12;
		gbc_rdbtnNewRadioButton_15.gridy = 8;
		AppUI.personalitytest.add(rdbtnNewRadioButton_15, gbc_rdbtnNewRadioButton_15);

		group4.add(rdbtnNewRadioButton_1);
		group4.add(rdbtnNewRadioButton_15);

		lblNewLabel_9 = new JLabel("2. How Thoughts Form");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 8;
		gbc_lblNewLabel_9.gridy = 9;
		AppUI.personalitytest.add(lblNewLabel_9, gbc_lblNewLabel_9);

		lblNewLabel_10 = new JLabel("2. Closure vs. Leaving Options Open");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 9;
		gbc_lblNewLabel_10.gridy = 9;
		AppUI.personalitytest.add(lblNewLabel_10, gbc_lblNewLabel_10);

		lblNewLabel_11 = new JLabel("2. Ways of Perceiving");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 11;
		gbc_lblNewLabel_11.gridy = 9;
		AppUI.personalitytest.add(lblNewLabel_11, gbc_lblNewLabel_11);

		lblNewLabel_12 = new JLabel("2. Needs");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_12.gridx = 12;
		gbc_lblNewLabel_12.gridy = 9;
		AppUI.personalitytest.add(lblNewLabel_12, gbc_lblNewLabel_12);

		rdbtnNewRadioButton_16 = new JRadioButton("process thoughts through conversations with others");
		GridBagConstraints gbc_rdbtnNewRadioButton_16 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_16.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_16.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_16.gridx = 8;
		gbc_rdbtnNewRadioButton_16.gridy = 10;
		AppUI.personalitytest.add(rdbtnNewRadioButton_16, gbc_rdbtnNewRadioButton_16);

		rdbtnNewRadioButton_20 = new JRadioButton("process thoughts inside your head");
		GridBagConstraints gbc_rdbtnNewRadioButton_20 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_20.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_20.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_20.gridx = 8;
		gbc_rdbtnNewRadioButton_20.gridy = 11;
		AppUI.personalitytest.add(rdbtnNewRadioButton_20, gbc_rdbtnNewRadioButton_20);

		group5.add(rdbtnNewRadioButton_16);
		group5.add(rdbtnNewRadioButton_20);

		rdbtnNewRadioButton_17 = new JRadioButton("prefer to have decisions made");
		GridBagConstraints gbc_rdbtnNewRadioButton_17 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_17.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_17.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_17.gridx = 9;
		gbc_rdbtnNewRadioButton_17.gridy = 10;
		AppUI.personalitytest.add(rdbtnNewRadioButton_17, gbc_rdbtnNewRadioButton_17);

		rdbtnNewRadioButton_21 = new JRadioButton("prefer to keep options open as long as possible");
		GridBagConstraints gbc_rdbtnNewRadioButton_21 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_21.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_21.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_21.gridx = 9;
		gbc_rdbtnNewRadioButton_21.gridy = 11;
		AppUI.personalitytest.add(rdbtnNewRadioButton_21, gbc_rdbtnNewRadioButton_21);

		group6.add(rdbtnNewRadioButton_17);
		group6.add(rdbtnNewRadioButton_21);

		rdbtnNewRadioButton_18 = new JRadioButton("trust only what I can see, hear, touch, taste, or smell");
		GridBagConstraints gbc_rdbtnNewRadioButton_18 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_18.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_18.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_18.gridx = 11;
		gbc_rdbtnNewRadioButton_18.gridy = 10;
		AppUI.personalitytest.add(rdbtnNewRadioButton_18, gbc_rdbtnNewRadioButton_18);

		rdbtnNewRadioButton_22 = new JRadioButton("comfortable using imagination and following hunches");
		GridBagConstraints gbc_rdbtnNewRadioButton_22 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_22.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_22.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_22.gridx = 11;
		gbc_rdbtnNewRadioButton_22.gridy = 11;
		AppUI.personalitytest.add(rdbtnNewRadioButton_22, gbc_rdbtnNewRadioButton_22);

		group7.add(rdbtnNewRadioButton_18);
		group7.add(rdbtnNewRadioButton_22);

		rdbtnNewRadioButton_19 = new JRadioButton("sincere need to evaluate and improve");
		GridBagConstraints gbc_rdbtnNewRadioButton_19 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_19.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_19.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_19.gridx = 12;
		gbc_rdbtnNewRadioButton_19.gridy = 10;
		AppUI.personalitytest.add(rdbtnNewRadioButton_19, gbc_rdbtnNewRadioButton_19);

		rdbtnNewRadioButton_39 = new JRadioButton("sincere need to know that others care how you feel");
		GridBagConstraints gbc_rdbtnSincereNeedTo = new GridBagConstraints();
		gbc_rdbtnSincereNeedTo.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSincereNeedTo.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnSincereNeedTo.gridx = 12;
		gbc_rdbtnSincereNeedTo.gridy = 11;
		AppUI.personalitytest.add(rdbtnNewRadioButton_39, gbc_rdbtnSincereNeedTo);

		group8.add(rdbtnNewRadioButton_19);
		group8.add(rdbtnNewRadioButton_39);

		lblNewLabel_13 = new JLabel("3. Speaking Style");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 8;
		gbc_lblNewLabel_13.gridy = 13;
		AppUI.personalitytest.add(lblNewLabel_13, gbc_lblNewLabel_13);

		lblNewLabel_14 = new JLabel("3. Relationship with Schedules");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 9;
		gbc_lblNewLabel_14.gridy = 13;
		AppUI.personalitytest.add(lblNewLabel_14, gbc_lblNewLabel_14);

		lblNewLabel_15 = new JLabel("3. Integration");
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 11;
		gbc_lblNewLabel_15.gridy = 13;
		AppUI.personalitytest.add(lblNewLabel_15, gbc_lblNewLabel_15);

		lblNewLabel_16 = new JLabel("3. Perspective");
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_16.gridx = 12;
		gbc_lblNewLabel_16.gridy = 13;
		AppUI.personalitytest.add(lblNewLabel_16, gbc_lblNewLabel_16);

		rdbtnNewRadioButton_23 = new JRadioButton("fast pace, expressive tones, and large gestures");
		GridBagConstraints gbc_rdbtnNewRadioButton_23 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_23.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_23.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_23.gridx = 8;
		gbc_rdbtnNewRadioButton_23.gridy = 14;
		AppUI.personalitytest.add(rdbtnNewRadioButton_23, gbc_rdbtnNewRadioButton_23);

		rdbtnNewRadioButton_28 = new JRadioButton("moderate pace, quiet voice, minimal gesturing");
		GridBagConstraints gbc_rdbtnNewRadioButton_28 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_28.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_28.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_28.gridx = 8;
		gbc_rdbtnNewRadioButton_28.gridy = 15;
		AppUI.personalitytest.add(rdbtnNewRadioButton_28, gbc_rdbtnNewRadioButton_28);

		group9.add(rdbtnNewRadioButton_23);
		group9.add(rdbtnNewRadioButton_28);

		rdbtnNewRadioButton_24 = new JRadioButton("find schedules and routines comforting");
		GridBagConstraints gbc_rdbtnNewRadioButton_24 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_24.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_24.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_24.gridx = 9;
		gbc_rdbtnNewRadioButton_24.gridy = 14;
		AppUI.personalitytest.add(rdbtnNewRadioButton_24, gbc_rdbtnNewRadioButton_24);

		rdbtnNewRadioButton_27 = new JRadioButton("find schedules and routines restricting");
		GridBagConstraints gbc_rdbtnNewRadioButton_27 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_27.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_27.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_27.gridx = 9;
		gbc_rdbtnNewRadioButton_27.gridy = 15;
		AppUI.personalitytest.add(rdbtnNewRadioButton_27, gbc_rdbtnNewRadioButton_27);

		group10.add(rdbtnNewRadioButton_24);
		group10.add(rdbtnNewRadioButton_27);

		rdbtnNewRadioButton_25 = new JRadioButton("put pieces together one step at a time");
		GridBagConstraints gbc_rdbtnNewRadioButton_25 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_25.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_25.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_25.gridx = 11;
		gbc_rdbtnNewRadioButton_25.gridy = 14;
		AppUI.personalitytest.add(rdbtnNewRadioButton_25, gbc_rdbtnNewRadioButton_25);

		rdbtnNewRadioButton_29 = new JRadioButton("put pieces together from all directions at once");
		GridBagConstraints gbc_rdbtnNewRadioButton_29 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_29.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_29.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_29.gridx = 11;
		gbc_rdbtnNewRadioButton_29.gridy = 15;
		AppUI.personalitytest.add(rdbtnNewRadioButton_29, gbc_rdbtnNewRadioButton_29);

		group11.add(rdbtnNewRadioButton_25);
		group11.add(rdbtnNewRadioButton_29);

		rdbtnNewRadioButton_26 = new JRadioButton("tend to debate and defend point of view");
		GridBagConstraints gbc_rdbtnNewRadioButton_26 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_26.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_26.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_26.gridx = 12;
		gbc_rdbtnNewRadioButton_26.gridy = 14;
		AppUI.personalitytest.add(rdbtnNewRadioButton_26, gbc_rdbtnNewRadioButton_26);

		rdbtnNewRadioButton_30 = new JRadioButton("tend to sympathize and accept other people's opinions");
		GridBagConstraints gbc_rdbtnNewRadioButton_30 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_30.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_30.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_30.gridx = 12;
		gbc_rdbtnNewRadioButton_30.gridy = 15;
		AppUI.personalitytest.add(rdbtnNewRadioButton_30, gbc_rdbtnNewRadioButton_30);

		group12.add(rdbtnNewRadioButton_26);
		group12.add(rdbtnNewRadioButton_30);

		lblNewLabel_17 = new JLabel("4. Relationship with Silence");
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 8;
		gbc_lblNewLabel_17.gridy = 16;
		AppUI.personalitytest.add(lblNewLabel_17, gbc_lblNewLabel_17);

		lblNewLabel_19 = new JLabel("4. Natural Tendency");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 9;
		gbc_lblNewLabel_19.gridy = 16;
		AppUI.personalitytest.add(lblNewLabel_19, gbc_lblNewLabel_19);

		lblNewLabel_21 = new JLabel("4. Interpretation");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 11;
		gbc_lblNewLabel_21.gridy = 16;
		AppUI.personalitytest.add(lblNewLabel_21, gbc_lblNewLabel_21);

		lblNewLabel_22 = new JLabel("Decision-Making");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_22.gridx = 12;
		gbc_lblNewLabel_22.gridy = 16;
		AppUI.personalitytest.add(lblNewLabel_22, gbc_lblNewLabel_22);

		rdbtnNewRadioButton_31 = new JRadioButton("tend to be uncomfortable with long silences around others");
		GridBagConstraints gbc_rdbtnNewRadioButton_31 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_31.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_31.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_31.gridx = 8;
		gbc_rdbtnNewRadioButton_31.gridy = 17;
		AppUI.personalitytest.add(rdbtnNewRadioButton_31, gbc_rdbtnNewRadioButton_31);

		rdbtnNewRadioButton_33 = new JRadioButton("appreciate silence (even around others)");
		GridBagConstraints gbc_rdbtnNewRadioButton_33 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_33.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_33.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_33.gridx = 8;
		gbc_rdbtnNewRadioButton_33.gridy = 18;
		AppUI.personalitytest.add(rdbtnNewRadioButton_33, gbc_rdbtnNewRadioButton_33);

		group13.add(rdbtnNewRadioButton_31);
		group13.add(rdbtnNewRadioButton_33);

		rdbtnNewRadioButton_32 = new JRadioButton("crave consistency and enjoy being prepared");
		GridBagConstraints gbc_rdbtnNewRadioButton_32 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_32.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_32.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_32.gridx = 9;
		gbc_rdbtnNewRadioButton_32.gridy = 17;
		AppUI.personalitytest.add(rdbtnNewRadioButton_32, gbc_rdbtnNewRadioButton_32);

		rdbtnNewRadioButton_34 = new JRadioButton("crave variety and enjoy improvising");
		GridBagConstraints gbc_rdbtnNewRadioButton_34 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_34.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_34.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_34.gridx = 9;
		gbc_rdbtnNewRadioButton_34.gridy = 18;
		AppUI.personalitytest.add(rdbtnNewRadioButton_34, gbc_rdbtnNewRadioButton_34);

		group14.add(rdbtnNewRadioButton_32);
		group14.add(rdbtnNewRadioButton_34);

		rdbtnNewRadioButton_35 = new JRadioButton("the way things appear is the way they really are");
		GridBagConstraints gbc_rdbtnNewRadioButton_35 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_35.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_35.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_35.gridx = 11;
		gbc_rdbtnNewRadioButton_35.gridy = 17;
		AppUI.personalitytest.add(rdbtnNewRadioButton_35, gbc_rdbtnNewRadioButton_35);

		rdbtnNewRadioButton_37 = new JRadioButton("read between the lines to discover hidden meaning");
		GridBagConstraints gbc_rdbtnNewRadioButton_37 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_37.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_37.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_37.gridx = 11;
		gbc_rdbtnNewRadioButton_37.gridy = 18;
		AppUI.personalitytest.add(rdbtnNewRadioButton_37, gbc_rdbtnNewRadioButton_37);

		group15.add(rdbtnNewRadioButton_35);
		group15.add(rdbtnNewRadioButton_37);

		rdbtnNewRadioButton_36 = new JRadioButton("use logic to make decisions and seek clarity");
		GridBagConstraints gbc_rdbtnNewRadioButton_36 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_36.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_36.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_36.gridx = 12;
		gbc_rdbtnNewRadioButton_36.gridy = 17;
		AppUI.personalitytest.add(rdbtnNewRadioButton_36, gbc_rdbtnNewRadioButton_36);

		rdbtnNewRadioButton_38 = new JRadioButton("use feelings to make decisions and seek harmony");
		GridBagConstraints gbc_rdbtnNewRadioButton_38 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_38.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_38.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_38.gridx = 12;
		gbc_rdbtnNewRadioButton_38.gridy = 18;
		AppUI.personalitytest.add(rdbtnNewRadioButton_38, gbc_rdbtnNewRadioButton_38);

		group16.add(rdbtnNewRadioButton_36);
		group16.add(rdbtnNewRadioButton_38);

		lblNewLabel_18 = new JLabel("Energy Drainers and Gainers");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 8;
		gbc_lblNewLabel_18.gridy = 19;
		AppUI.personalitytest.add(lblNewLabel_18, gbc_lblNewLabel_18);

		lblNewLabel_20 = new JLabel("5. Work Style");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 9;
		gbc_lblNewLabel_20.gridy = 19;
		AppUI.personalitytest.add(lblNewLabel_20, gbc_lblNewLabel_20);

		lblNewLabel_23 = new JLabel("5. Outlook");
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 11;
		gbc_lblNewLabel_23.gridy = 19;
		AppUI.personalitytest.add(lblNewLabel_23, gbc_lblNewLabel_23);

		lblNewLabel_24 = new JLabel("5. Preferred Approach");
		GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
		gbc_lblNewLabel_24.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_24.gridx = 12;
		gbc_lblNewLabel_24.gridy = 19;
		AppUI.personalitytest.add(lblNewLabel_24, gbc_lblNewLabel_24);

		rdbtnNewRadioButton_4 = new JRadioButton("I most often find interacting with others to be energizing");
		GridBagConstraints gbc_rdbtnNewRadioButton_4 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_4.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_4.gridx = 8;
		gbc_rdbtnNewRadioButton_4.gridy = 20;
		AppUI.personalitytest.add(rdbtnNewRadioButton_4, gbc_rdbtnNewRadioButton_4);

		rdbtnNewRadioButton_8 = new JRadioButton("I most often find interacting with others to be draining");
		GridBagConstraints gbc_rdbtnNewRadioButton_8 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_8.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_8.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_8.gridx = 8;
		gbc_rdbtnNewRadioButton_8.gridy = 21;
		AppUI.personalitytest.add(rdbtnNewRadioButton_8, gbc_rdbtnNewRadioButton_8);

		group17.add(rdbtnNewRadioButton_4);
		group17.add(rdbtnNewRadioButton_8);

		rdbtnNewRadioButton_5 = new JRadioButton("\"work before play\"");
		GridBagConstraints gbc_rdbtnNewRadioButton_5 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_5.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_5.gridx = 9;
		gbc_rdbtnNewRadioButton_5.gridy = 20;
		AppUI.personalitytest.add(rdbtnNewRadioButton_5, gbc_rdbtnNewRadioButton_5);

		rdbtnNewRadioButton_9 = new JRadioButton("\"play along the way\"");
		GridBagConstraints gbc_rdbtnNewRadioButton_9 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_9.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_9.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_9.gridx = 9;
		gbc_rdbtnNewRadioButton_9.gridy = 21;
		AppUI.personalitytest.add(rdbtnNewRadioButton_9, gbc_rdbtnNewRadioButton_9);

		group18.add(rdbtnNewRadioButton_5);
		group18.add(rdbtnNewRadioButton_9);

		rdbtnNewRadioButton_6 = new JRadioButton("prefer to experience life here and now");
		GridBagConstraints gbc_rdbtnNewRadioButton_6 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_6.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_6.gridx = 11;
		gbc_rdbtnNewRadioButton_6.gridy = 20;
		AppUI.personalitytest.add(rdbtnNewRadioButton_6, gbc_rdbtnNewRadioButton_6);

		rdbtnNewRadioButton_10 = new JRadioButton("enjoy contemplating patterns and future possibilities");
		GridBagConstraints gbc_rdbtnNewRadioButton_10 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_10.gridx = 11;
		gbc_rdbtnNewRadioButton_10.gridy = 21;
		AppUI.personalitytest.add(rdbtnNewRadioButton_10, gbc_rdbtnNewRadioButton_10);

		group19.add(rdbtnNewRadioButton_6);
		group19.add(rdbtnNewRadioButton_10);

		rdbtnNewRadioButton_7 = new JRadioButton("objective, direct, and investigative");
		GridBagConstraints gbc_rdbtnNewRadioButton_7 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_7.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_7.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_7.gridx = 12;
		gbc_rdbtnNewRadioButton_7.gridy = 20;
		AppUI.personalitytest.add(rdbtnNewRadioButton_7, gbc_rdbtnNewRadioButton_7);

		rdbtnNewRadioButton_11 = new JRadioButton("subjective, tactful, and appreciative");
		GridBagConstraints gbc_rdbtnNewRadioButton_11 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_11.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_11.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_11.gridx = 12;
		gbc_rdbtnNewRadioButton_11.gridy = 21;
		AppUI.personalitytest.add(rdbtnNewRadioButton_11, gbc_rdbtnNewRadioButton_11);

		group20.add(rdbtnNewRadioButton_7);
		group20.add(rdbtnNewRadioButton_11);

		btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 0);
		gbc_btnSubmit.gridwidth = 5;
		gbc_btnSubmit.gridx = 8;
		gbc_btnSubmit.gridy = 28;
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AppOptionInput.fourth_button();
			}
		});
		AppUI.personalitytest.add(btnSubmit, gbc_btnSubmit);

		textfield = new JTextField(" ");
		textfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textfield.setColumns(40);
		GridBagConstraints gbc_textfield = new GridBagConstraints();
		gbc_textfield.insets = new Insets(0, 0, 5, 0);
		gbc_textfield.gridwidth = 5;
		gbc_textfield.gridx = 8;
		gbc_textfield.gridy = 29;
		textfield.setEditable(false);
		textfield.setHorizontalAlignment(JTextField.CENTER);
		AppUI.personalitytest.add(textfield, gbc_textfield);

		btnInfo = new JButton("Test Information (Browser)");

		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fileString = "<p>Personality Test Methodology</p>";
				try {
					fileString = new String(Files.readAllBytes(Paths.get("resources/personality_test.html")));
				} catch (IOException e) {
					StringWriter sw = new StringWriter();
					e.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					AppUI.feedbacktextarea.setText(exceptionAsString);
				}
				AppUI.generalbrowser.loadHTML(fileString);
			}
		});
		btnInfo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnInfo = new GridBagConstraints();
		gbc_btnInfo.insets = new Insets(0, 0, 5, 0);
		gbc_btnInfo.gridwidth = 5;
		gbc_btnInfo.gridx = 8;
		gbc_btnInfo.gridy = 30;
		AppUI.personalitytest.add(btnInfo, gbc_btnInfo);

		lblNewLabel_25 = new JLabel(
				"Retrieved from: https://personalityacademy.com/wp-content/uploads/2017/07/Printable-Personality-Quiz.pdf");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
		gbc_lblNewLabel_25.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_25.gridwidth = 5;
		gbc_lblNewLabel_25.gridx = 8;
		gbc_lblNewLabel_25.gridy = 34;
		AppUI.personalitytest.add(lblNewLabel_25, gbc_lblNewLabel_25);

		lblNewLabel_26 = new JLabel(
				"Fair Use Notice: this Personality Test part of the application contains copyrighted material the use of which has not always been specifically authorized by the copyright owner.");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
		gbc_lblNewLabel_26.gridwidth = 5;
		gbc_lblNewLabel_26.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_26.gridx = 8;
		gbc_lblNewLabel_26.gridy = 35;
		AppUI.personalitytest.add(lblNewLabel_26, gbc_lblNewLabel_26);

		ColorDesign.setTestDesign();
		
	}

}

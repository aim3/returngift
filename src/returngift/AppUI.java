package returngift;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserContext;
import com.teamdev.jxbrowser.chromium.BrowserContextParams;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;


public class AppUI implements ActionListener, ChangeListener  {

	static JDBCMySQLDemo demo = new JDBCMySQLDemo();
	
	BrowserContext context1 = new BrowserContext(
		    new BrowserContextParams("resources/data1/"));
	
	BrowserContext context2 = new BrowserContext(
		    new BrowserContextParams("resources/data2/"));
	
	Browser generalbrowser = new Browser(context1);
	Browser forumbrowser = new Browser(context2);
	
    BrowserView view1 = new BrowserView(generalbrowser);
    BrowserView view2 = new BrowserView(forumbrowser);
    
	ImageIcon logo = new ImageIcon("resources/Logomakr_0yrkeW.png"); // load the image to a imageIcon
	
	JFrame frame;
	
	JTabbedPane tabbedPane;
	
	JPanel account, search, browser, personalitytest, forum, feedback;
	
	static JComboBox<String> gendercombo, agecombo, personalitycombo, occasioncombo, colorcombo, ratingcombo;
	
	static JCheckBox chckbxInterest, chckbxInterest_1, chckbxInterest_2, chckbxInterest_3, chckbxInterest_4, chckbxInterest_5, chckbxInterest_6,
	chckbxInterest_7, chckbxInterest_8, chckbxInterest_9, chckbxInterest_10, chckbxInterest_11;
	
	static JButton btnSearch, btnSendFeedback;
	
	static JSlider rlevelslider, clevelslider, pricerangeslider;
	
	static JEditorPane editorpane;
	
	static JTextArea feedbacktextarea;
    
    
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
		generalbrowser.getCacheStorage().clearCache();
		forumbrowser.getCacheStorage().clearCache();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1400, 900);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		account = new JPanel();
		tabbedPane.addTab("Account", null, account, null);
		
		Image image = logo.getImage(); // transform it 
		Image newimg = image.getScaledInstance(600, 490, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		logo = new ImageIcon(newimg);
		account.setLayout(new BorderLayout(0, 0));
		
		JLabel lblIcon = new JLabel(logo);
		account.add(lblIcon, BorderLayout.CENTER);
		
		search = new JPanel();
		tabbedPane.addTab("Search", null, search, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{200, 87, 110, 87, 250, 525, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{31, 22, 16, 22, 16, 22, 16, 25, 25, 25, 25, 25, 25, 16, 22, 16, 26, 16, 26, 16, 22, 16, 26, 53, 41, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		search.setLayout(gbl_panel_1);
		
		JLabel lblGender = new JLabel("Gender");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.SOUTH;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 2;
		gbc_lblGender.gridy = 0;
		search.add(lblGender, gbc_lblGender);
		
		gendercombo = new JComboBox<>();
		GridBagConstraints gbc_gendercombo = new GridBagConstraints();
		gbc_gendercombo.anchor = GridBagConstraints.NORTH;
		gbc_gendercombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_gendercombo.insets = new Insets(0, 0, 5, 5);
		gbc_gendercombo.gridwidth = 3;
		gbc_gendercombo.gridx = 1;
		gbc_gendercombo.gridy = 1;
		gendercombo.addActionListener(this);
		search.add(gendercombo, gbc_gendercombo);
		
		JLabel lblAge = new JLabel("Age");
		GridBagConstraints gbc_lblAge = new GridBagConstraints();
		gbc_lblAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge.gridx = 2;
		gbc_lblAge.gridy = 2;
		search.add(lblAge, gbc_lblAge);
		
		agecombo = new JComboBox<>(new String[] {"Select an age group", "Infant", "Toddler", "Child", "Preteen", "Teen", "Young Adult", "Adult", "Middle-Aged Adult", "Senior"});
		
		GridBagConstraints gbc_agecombo = new GridBagConstraints();
		gbc_agecombo.anchor = GridBagConstraints.NORTH;
		gbc_agecombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_agecombo.insets = new Insets(0, 0, 5, 5);
		gbc_agecombo.gridwidth = 3;
		gbc_agecombo.gridx = 1;
		gbc_agecombo.gridy = 3;
		agecombo.addActionListener(this);
		search.add(agecombo, gbc_agecombo);
		
		JLabel lblPersonality = new JLabel("Personality");
		GridBagConstraints gbc_lblPersonality = new GridBagConstraints();
		gbc_lblPersonality.anchor = GridBagConstraints.NORTH;
		gbc_lblPersonality.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonality.gridx = 2;
		gbc_lblPersonality.gridy = 4;
		search.add(lblPersonality, gbc_lblPersonality);
		
		personalitycombo = new JComboBox<>(new String[] {"Select a personality type", "Mover", "Connector", "Thinker", "Planner"});
		GridBagConstraints gbc_personalitycombo = new GridBagConstraints();
		gbc_personalitycombo.anchor = GridBagConstraints.NORTH;
		gbc_personalitycombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_personalitycombo.insets = new Insets(0, 0, 5, 5);
		gbc_personalitycombo.gridwidth = 3;
		gbc_personalitycombo.gridx = 1;
		gbc_personalitycombo.gridy = 5;
		personalitycombo.addActionListener(this);
		search.add(personalitycombo, gbc_personalitycombo);
		
		JLabel lblInterests = new JLabel("Interests");
		GridBagConstraints gbc_lblInterests = new GridBagConstraints();
		gbc_lblInterests.anchor = GridBagConstraints.NORTH;
		gbc_lblInterests.insets = new Insets(0, 0, 5, 5);
		gbc_lblInterests.gridx = 2;
		gbc_lblInterests.gridy = 6;
		search.add(lblInterests, gbc_lblInterests);
		
		chckbxInterest = new JCheckBox("Animals and Pets");
		GridBagConstraints gbc_chckbxInterest = new GridBagConstraints();
		gbc_chckbxInterest.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest.gridx = 1;
		gbc_chckbxInterest.gridy = 7;
		chckbxInterest.addActionListener(this);
		search.add(chckbxInterest, gbc_chckbxInterest);
		
		chckbxInterest_1 = new JCheckBox("Art");
		GridBagConstraints gbc_chckbxInterest_1 = new GridBagConstraints();
		gbc_chckbxInterest_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_1.gridx = 1;
		gbc_chckbxInterest_1.gridy = 8;
		chckbxInterest_1.addActionListener(this);
		search.add(chckbxInterest_1, gbc_chckbxInterest_1);	
		
		chckbxInterest_2 = new JCheckBox("Cooking");
		GridBagConstraints gbc_chckbxInterest_2 = new GridBagConstraints();
		gbc_chckbxInterest_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_2.gridx = 1;
		gbc_chckbxInterest_2.gridy = 9;
		chckbxInterest_2.addActionListener(this);
		search.add(chckbxInterest_2, gbc_chckbxInterest_2);		
		
		chckbxInterest_3 = new JCheckBox("Fashion and Beauty");
		GridBagConstraints gbc_chckbxInterest_3 = new GridBagConstraints();
		gbc_chckbxInterest_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_3.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_3.gridx = 1;
		gbc_chckbxInterest_3.gridy = 10;
		chckbxInterest_3.addActionListener(this);
		search.add(chckbxInterest_3, gbc_chckbxInterest_3);
		
		chckbxInterest_4 = new JCheckBox("Gadgets");
		GridBagConstraints gbc_chckbxInterest_4 = new GridBagConstraints();
		gbc_chckbxInterest_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_4.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_4.gridx = 1;
		gbc_chckbxInterest_4.gridy = 11;
		chckbxInterest_4.addActionListener(this);
		search.add(chckbxInterest_4, gbc_chckbxInterest_4);		
		
		chckbxInterest_6 = new JCheckBox("Gaming");
		GridBagConstraints gbc_chckbxInterest_6 = new GridBagConstraints();
		gbc_chckbxInterest_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_6.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_6.gridx = 1;
		gbc_chckbxInterest_6.gridy = 12;
		chckbxInterest_6.addActionListener(this);
		search.add(chckbxInterest_6, gbc_chckbxInterest_6);	
		
		chckbxInterest_5 = new JCheckBox("Gardening");
		GridBagConstraints gbc_chckbxInterest_5 = new GridBagConstraints();
		gbc_chckbxInterest_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_5.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_5.gridx = 3;
		gbc_chckbxInterest_5.gridy = 7;
		chckbxInterest_5.addActionListener(this);
		search.add(chckbxInterest_5, gbc_chckbxInterest_5);
		
		chckbxInterest_7 = new JCheckBox("Home Decor");
		GridBagConstraints gbc_chckbxInterest_7 = new GridBagConstraints();
		gbc_chckbxInterest_7.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_7.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_7.gridx = 3;
		gbc_chckbxInterest_7.gridy = 8;
		chckbxInterest_7.addActionListener(this);
		search.add(chckbxInterest_7, gbc_chckbxInterest_7);
		
		chckbxInterest_8 = new JCheckBox("Music");
		GridBagConstraints gbc_chckbxInterest_8 = new GridBagConstraints();
		gbc_chckbxInterest_8.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_8.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_8.gridx = 3;
		gbc_chckbxInterest_8.gridy = 9;
		chckbxInterest_8.addActionListener(this);
		search.add(chckbxInterest_8, gbc_chckbxInterest_8);
		
		chckbxInterest_9 = new JCheckBox("Reading");
		GridBagConstraints gbc_chckbxInterest_9 = new GridBagConstraints();
		gbc_chckbxInterest_9.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_9.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_9.gridx = 3;
		gbc_chckbxInterest_9.gridy = 10;
		chckbxInterest_9.addActionListener(this);
		search.add(chckbxInterest_9, gbc_chckbxInterest_9);
		
		chckbxInterest_10 = new JCheckBox("Sport");
		GridBagConstraints gbc_chckbxInterest_10 = new GridBagConstraints();
		gbc_chckbxInterest_10.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_10.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_10.gridx = 3;
		gbc_chckbxInterest_10.gridy = 11;
		chckbxInterest_10.addActionListener(this);
		search.add(chckbxInterest_10, gbc_chckbxInterest_10);

		chckbxInterest_11 = new JCheckBox("Toys");
		GridBagConstraints gbc_chckbxInterest_11 = new GridBagConstraints();
		gbc_chckbxInterest_11.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxInterest_11.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInterest_11.gridx = 3;
		gbc_chckbxInterest_11.gridy = 12;
		chckbxInterest_11.addActionListener(this);
		search.add(chckbxInterest_11, gbc_chckbxInterest_11);
		
		JLabel lblOccasion = new JLabel("Occasion");
		GridBagConstraints gbc_lblOccasion = new GridBagConstraints();
		gbc_lblOccasion.anchor = GridBagConstraints.NORTH;
		gbc_lblOccasion.insets = new Insets(0, 0, 5, 5);
		gbc_lblOccasion.gridx = 2;
		gbc_lblOccasion.gridy = 13;
		search.add(lblOccasion, gbc_lblOccasion);
		
		occasioncombo = new JComboBox<>(new String[] {"Select an occasion", "Christmas", "New Year's Day", "Valentine's Day", "International Women's Day", "Novruz", "House-Warming Party", "Back-to-School", "Baby Shower"});
		GridBagConstraints gbc_occasioncombo = new GridBagConstraints();
		gbc_occasioncombo.anchor = GridBagConstraints.NORTH;
		gbc_occasioncombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_occasioncombo.insets = new Insets(0, 0, 5, 5);
		gbc_occasioncombo.gridwidth = 3;
		gbc_occasioncombo.gridx = 1;
		gbc_occasioncombo.gridy = 14;
		occasioncombo.addActionListener(this);
		search.add(occasioncombo, gbc_occasioncombo);
		
		JLabel lblRelationshipLevel = new JLabel("Relationship Level");
		GridBagConstraints gbc_lblRelationshipLevel = new GridBagConstraints();
		gbc_lblRelationshipLevel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblRelationshipLevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblRelationshipLevel.gridwidth = 2;
		gbc_lblRelationshipLevel.gridx = 2;
		gbc_lblRelationshipLevel.gridy = 15;
		search.add(lblRelationshipLevel, gbc_lblRelationshipLevel);
		
		rlevelslider = new JSlider();
		rlevelslider.setMinimum(0);
		rlevelslider.setMaximum(10);
		//Turn on labels at major tick marks.
		rlevelslider.setMajorTickSpacing(1);
		rlevelslider.setMinorTickSpacing(1);
		rlevelslider.setPaintTicks(true);
		rlevelslider.setPaintLabels(true);
		
		GridBagConstraints gbc_rlevelslider = new GridBagConstraints();
		gbc_rlevelslider.anchor = GridBagConstraints.NORTH;
		gbc_rlevelslider.fill = GridBagConstraints.HORIZONTAL;
		gbc_rlevelslider.insets = new Insets(0, 0, 5, 5);
		gbc_rlevelslider.gridwidth = 3;
		gbc_rlevelslider.gridx = 1;
		gbc_rlevelslider.gridy = 16;
		rlevelslider.addChangeListener(this);
		search.add(rlevelslider, gbc_rlevelslider);
		
		JLabel lblCreativityLevel = new JLabel("Creativity Level");
		GridBagConstraints gbc_lblCreativityLevel = new GridBagConstraints();
		gbc_lblCreativityLevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreativityLevel.gridx = 2;
		gbc_lblCreativityLevel.gridy = 17;
		search.add(lblCreativityLevel, gbc_lblCreativityLevel);
		
		clevelslider = new JSlider();
		clevelslider.setMinimum(0);
		clevelslider.setMaximum(10);
		//Turn on labels at major tick marks.
		clevelslider.setMajorTickSpacing(1);
		clevelslider.setMinorTickSpacing(1);
		clevelslider.setPaintTicks(true);
		clevelslider.setPaintLabels(true);
		
		GridBagConstraints gbc_clevelslider = new GridBagConstraints();
		gbc_clevelslider.anchor = GridBagConstraints.NORTH;
		gbc_clevelslider.fill = GridBagConstraints.HORIZONTAL;
		gbc_clevelslider.insets = new Insets(0, 0, 5, 5);
		gbc_clevelslider.gridwidth = 3;
		gbc_clevelslider.gridx = 1;
		gbc_clevelslider.gridy = 18;
		clevelslider.addChangeListener(this);
		search.add(clevelslider, gbc_clevelslider);
		
		JLabel lblColor = new JLabel("Color");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.anchor = GridBagConstraints.NORTH;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 2;
		gbc_lblColor.gridy = 19;
		search.add(lblColor, gbc_lblColor);
		
		colorcombo = new JComboBox<>(new String[] {"Select a color", "Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Indigo", "Violet", "Purple", "Magenta", "Pink", "Brown", "White", "Gray", "Black", "Silver", "Gold"});
		GridBagConstraints gbc_colorcombo = new GridBagConstraints();
		gbc_colorcombo.anchor = GridBagConstraints.NORTH;
		gbc_colorcombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_colorcombo.insets = new Insets(0, 0, 5, 5);
		gbc_colorcombo.gridwidth = 3;
		gbc_colorcombo.gridx = 1;
		gbc_colorcombo.gridy = 20;
		colorcombo.addActionListener(this);
		search.add(colorcombo, gbc_colorcombo);
		
		JLabel lblPriceRange = new JLabel("Price Range");
		GridBagConstraints gbc_lblPriceRange = new GridBagConstraints();
		gbc_lblPriceRange.anchor = GridBagConstraints.NORTH;
		gbc_lblPriceRange.insets = new Insets(0, 0, 5, 5);
		gbc_lblPriceRange.gridx = 2;
		gbc_lblPriceRange.gridy = 21;
		search.add(lblPriceRange, gbc_lblPriceRange);
		
		pricerangeslider = new JSlider();
		pricerangeslider.setMinimum(0);
		pricerangeslider.setMaximum(500);
		//Turn on labels at major tick marks.
		pricerangeslider.setMajorTickSpacing(100);
		pricerangeslider.setMinorTickSpacing(10);
		pricerangeslider.setPaintTicks(true);
		pricerangeslider.setPaintLabels(true);
		GridBagConstraints gbc_pricerangeslider = new GridBagConstraints();
		gbc_pricerangeslider.anchor = GridBagConstraints.NORTH;
		gbc_pricerangeslider.fill = GridBagConstraints.HORIZONTAL;
		gbc_pricerangeslider.insets = new Insets(0, 0, 5, 5);
		gbc_pricerangeslider.gridwidth = 3;
		gbc_pricerangeslider.gridx = 1;
		gbc_pricerangeslider.gridy = 22;
		pricerangeslider.addChangeListener(this);
		search.add(pricerangeslider, gbc_pricerangeslider);
		
		btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.anchor = GridBagConstraints.NORTH;
		gbc_btnSearch.insets = new Insets(0, 0, 0, 5);
		gbc_btnSearch.gridwidth = 3;
		gbc_btnSearch.gridx = 1;
		gbc_btnSearch.gridy = 24;
		btnSearch.addActionListener(this);
		search.add(btnSearch, gbc_btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridheight = 25;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 5;
		gbc_scrollPane.gridy = 0;
		search.add(scrollPane, gbc_scrollPane);
		
		editorpane = new JEditorPane();
		
		editorpane.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));
		editorpane.setEditable(false);

		editorpane.addHyperlinkListener(new HyperlinkListener() {
		    public void hyperlinkUpdate(HyperlinkEvent e) {
		        if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
		           // Do something with e.getURL() here
		        }
		    }
		});
	      
		scrollPane.setViewportView(editorpane);
		
		
		browser = new JPanel();
		tabbedPane.addTab("Browser", null, browser, null);
		browser.setLayout(new BorderLayout(0, 0));
		
		browser.add(view1, BorderLayout.CENTER);
		
        generalbrowser.loadURL("https://www.google.com/ncr");
		
		personalitytest = new JPanel();
		tabbedPane.addTab("Personality Test", null, personalitytest, null);
		personalitytest.setLayout(new BorderLayout(0, 0));
		
		forum = new JPanel();
		tabbedPane.addTab("Forum", null, forum, null);
		forum.setLayout(new BorderLayout(0, 0));
		
		forum.add(view2, BorderLayout.CENTER);
		
		forumbrowser.loadURL("http://return-gift-forum.freeforums.net/");
		
		feedback = new JPanel();
		tabbedPane.addTab("Feedback", null, feedback, null);
		GridBagLayout gbl_feedback = new GridBagLayout();
		gbl_feedback.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_feedback.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_feedback.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_feedback.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		feedback.setLayout(gbl_feedback);
		
		JLabel lblFeedback = new JLabel("Feedback");
		GridBagConstraints gbc_lblFeedback = new GridBagConstraints();
		gbc_lblFeedback.insets = new Insets(0, 0, 5, 5);
		gbc_lblFeedback.gridx = 2;
		gbc_lblFeedback.gridy = 0;
		feedback.add(lblFeedback, gbc_lblFeedback);
		
		JLabel lblRating = new JLabel("Rating");
		GridBagConstraints gbc_lblRating = new GridBagConstraints();
		gbc_lblRating.insets = new Insets(0, 0, 5, 5);
		gbc_lblRating.gridx = 2;
		gbc_lblRating.gridy = 3;
		feedback.add(lblRating, gbc_lblRating);
		
		ratingcombo = new JComboBox<>(new String[] {"Select a rating", "0", "1", "2", "3", "4", "5"});
		GridBagConstraints gbc_ratingcombo = new GridBagConstraints();
		gbc_ratingcombo.insets = new Insets(0, 0, 5, 5);
		gbc_ratingcombo.fill = GridBagConstraints.HORIZONTAL;
		gbc_ratingcombo.gridx = 2;
		gbc_ratingcombo.gridy = 4;
		ratingcombo.addActionListener(this);
		feedback.add(ratingcombo, gbc_ratingcombo);
		
		feedbacktextarea = new JTextArea();
		feedbacktextarea.setWrapStyleWord(true);
		GridBagConstraints gbc_feedbacktextarea = new GridBagConstraints();
		gbc_feedbacktextarea.gridwidth = 3;
		gbc_feedbacktextarea.gridheight = 19;
		gbc_feedbacktextarea.insets = new Insets(0, 0, 5, 0);
		gbc_feedbacktextarea.fill = GridBagConstraints.BOTH;
		gbc_feedbacktextarea.gridx = 1;
		gbc_feedbacktextarea.gridy = 5;
		feedback.add(feedbacktextarea, gbc_feedbacktextarea);
		
		btnSendFeedback = new JButton("Send Feedback");
		GridBagConstraints gbc_btnSendFeedback = new GridBagConstraints();
		gbc_btnSendFeedback.insets = new Insets(0, 0, 0, 5);
		gbc_btnSendFeedback.gridx = 2;
		gbc_btnSendFeedback.gridy = 24;
		btnSendFeedback.addActionListener(this);
		feedback.add(btnSendFeedback, gbc_btnSendFeedback);
		
		}

	public void actionPerformed(ActionEvent e) {
		
		generalbrowser.getCacheStorage().clearCache();
		forumbrowser.getCacheStorage().clearCache();

		if (e.getSource() == btnSearch) {

			Button_Events.first_button();

			}
			
		else if(e.getSource() == btnSendFeedback) {
				
			Button_Events.second_button();
				
			}
		else if(e.getSource() == gendercombo) {
			AppUI.demo.gender = "= " + AppUI.gendercombo.getSelectedItem().toString();
		}
		else if(e.getSource() == agecombo) {
			AppUI.demo.age = "= " + AppUI.agecombo.getSelectedItem().toString();
		}
		else if(e.getSource() == colorcombo) {
			AppUI.demo.color = "= " + AppUI.colorcombo.getSelectedItem().toString();
		}
		else if(e.getSource() == rlevelslider) {
			AppUI.demo.rlevel = "= " + AppUI.rlevelslider.getValue();
		}
		else if(e.getSource() == clevelslider) {
			AppUI.demo.clevel = "= " + AppUI.clevelslider.getValue();
		}
		else if(e.getSource() == pricerangeslider) {
			AppUI.demo.pricerange = "= " + AppUI.pricerangeslider.getValue();
		}
		else if(e.getSource() == occasioncombo) {
			Table_Selection.getTable(occasioncombo.getSelectedItem().toString());
		}
		else if(e.getSource() == personalitycombo) {
			Table_Selection.getTable(personalitycombo.getSelectedItem().toString());
		}
		else if(e.getSource() == chckbxInterest) {
			demo.table.add("INTEREST_animals_and_pets");
		}
		else if(e.getSource() == chckbxInterest_1) {
			demo.table.add("INTEREST_art");
		}
		else if(e.getSource() == chckbxInterest_2) {
			demo.table.add("INTEREST_cooking");
		}
		else if(e.getSource() == chckbxInterest_3) {
			demo.table.add("INTEREST_fashion_and_beauty");
		}
		else if(e.getSource() == chckbxInterest_4) {
			demo.table.add("INTEREST_gadgets");
		}
		else if(e.getSource() == chckbxInterest_5) {
			demo.table.add("INTEREST_gaming");
		}
		else if(e.getSource() == chckbxInterest_6) {
			demo.table.add("INTEREST_gardening");
		}
		else if(e.getSource() == chckbxInterest_7) {
			demo.table.add("INTEREST_home_decor");
		}
		else if(e.getSource() == chckbxInterest_8) {
			demo.table.add("INTEREST_music");
		}
		else if(e.getSource() == chckbxInterest_9) {
			demo.table.add("INTEREST_reading");
		}	
		else if(e.getSource() == chckbxInterest_10) {
			demo.table.add("INTEREST_sport");
		}
		else if(e.getSource() == chckbxInterest_11) {
			demo.table.add("INTEREST_toys");
		}
		}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

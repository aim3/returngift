package returngift;

public class TypeResult {
	
	public static void generateResult() { 
		String result = "";

		int extraversion = 0, introversion = 0, planned = 0, spontaneous = 0, handson = 0, theoretical = 0,
				objective = 0, subjective = 0;

		if (PersonalityTest.rdbtnNewRadioButton.isSelected())
			extraversion++;
		if (PersonalityTest.rdbtnNewRadioButton_1.isSelected())
			objective++;
		if (PersonalityTest.rdbtnNewRadioButton_2.isSelected())
			planned++;
		if (PersonalityTest.rdbtnNewRadioButton_3.isSelected())
			handson++;
		if (PersonalityTest.rdbtnNewRadioButton_4.isSelected())
			extraversion++;
		if (PersonalityTest.rdbtnNewRadioButton_5.isSelected())
			planned++;
		if (PersonalityTest.rdbtnNewRadioButton_6.isSelected())
			handson++;
		if (PersonalityTest.rdbtnNewRadioButton_7.isSelected())
			objective++;
		if (PersonalityTest.rdbtnNewRadioButton_8.isSelected())
			introversion++;
		if (PersonalityTest.rdbtnNewRadioButton_9.isSelected())
			spontaneous++;
		if (PersonalityTest.rdbtnNewRadioButton_10.isSelected())
			theoretical++;
		if (PersonalityTest.rdbtnNewRadioButton_11.isSelected())
			subjective++;
		if (PersonalityTest.rdbtnNewRadioButton_12.isSelected())
			introversion++;
		if (PersonalityTest.rdbtnNewRadioButton_13.isSelected())
			spontaneous++;
		if (PersonalityTest.rdbtnNewRadioButton_14.isSelected())
			theoretical++;
		if (PersonalityTest.rdbtnNewRadioButton_15.isSelected())
			subjective++;
		if (PersonalityTest.rdbtnNewRadioButton_16.isSelected())
			extraversion++;
		if (PersonalityTest.rdbtnNewRadioButton_17.isSelected())
			planned++;
		if (PersonalityTest.rdbtnNewRadioButton_18.isSelected())
			handson++;
		if (PersonalityTest.rdbtnNewRadioButton_19.isSelected())
			objective++;
		if (PersonalityTest.rdbtnNewRadioButton_20.isSelected())
			introversion++;
		if (PersonalityTest.rdbtnNewRadioButton_21.isSelected())
			spontaneous++;
		if (PersonalityTest.rdbtnNewRadioButton_22.isSelected())
			theoretical++;
		if (PersonalityTest.rdbtnNewRadioButton_23.isSelected())
			extraversion++;
		if (PersonalityTest.rdbtnNewRadioButton_24.isSelected())
			planned++;
		if (PersonalityTest.rdbtnNewRadioButton_25.isSelected())
			handson++;
		if (PersonalityTest.rdbtnNewRadioButton_26.isSelected())
			objective++;
		if (PersonalityTest.rdbtnNewRadioButton_27.isSelected())
			spontaneous++;
		if (PersonalityTest.rdbtnNewRadioButton_28.isSelected())
			introversion++;
		if (PersonalityTest.rdbtnNewRadioButton_29.isSelected())
			theoretical++;
		if (PersonalityTest.rdbtnNewRadioButton_30.isSelected())
			subjective++;
		if (PersonalityTest.rdbtnNewRadioButton_31.isSelected())
			extraversion++;
		if (PersonalityTest.rdbtnNewRadioButton_32.isSelected())
			planned++;
		if (PersonalityTest.rdbtnNewRadioButton_33.isSelected())
			introversion++;
		if (PersonalityTest.rdbtnNewRadioButton_34.isSelected())
			spontaneous++;
		if (PersonalityTest.rdbtnNewRadioButton_35.isSelected())
			handson++;
		if (PersonalityTest.rdbtnNewRadioButton_36.isSelected())
			objective++;
		if (PersonalityTest.rdbtnNewRadioButton_37.isSelected())
			theoretical++;
		if (PersonalityTest.rdbtnNewRadioButton_38.isSelected())
			subjective++;
		if (PersonalityTest.rdbtnNewRadioButton_39.isSelected())
			subjective++;
		
		int mover = handson + spontaneous, connector = theoretical + subjective, thinker = theoretical + objective,
				planner = handson + planned;

		int max = Math.max(Math.max(mover, connector), Math.max(thinker, planner));
		
		int index = introversion + extraversion;
		index = 0;

		if (mover == max) {
			result += "Mover ";
			index = 1;
		}
		if (connector == max) {
			result += "Connector ";
			index = 2;
		}
		if (thinker == max) {
			result += "Thinker ";
			index = 3;
		}
		if (planner == max) {
			result += "Planner ";
			index = 4;
		}
		AppUI.personalitycombo.setSelectedIndex(index);
		PersonalityTest.textfield.setText(result);

	}

}

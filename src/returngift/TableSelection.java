package returngift;

public class TableSelection {

	public static void getOccasion() {

		String item = AppUI.occasioncombo.getSelectedItem().toString();

		if (item.equals("Select an occasion")) {
			AppUI.mysql_query.table_o.clear();
		} else if (item.equals("Christmas"))
			AppUI.mysql_query.table_o.add("OCCASION_christmas");
		else if (item.equals("New Year's Day"))
			AppUI.mysql_query.table_o.add("OCCASION_new_year");
		else if (item.equals("Valentine's Day"))
			AppUI.mysql_query.table_o.add("OCCASION_valentine_day");
		else if (item.equals("International Women's Day"))
			AppUI.mysql_query.table_o.add("OCCASION_international_women_day");
		else if (item.equals("House-Warming Party"))
			AppUI.mysql_query.table_o.add("OCCASION_house_warming_party");
		else if (item.equals("Back-to-School"))
			AppUI.mysql_query.table_o.add("OCCASION_back_to_school");
		else if (item.equals("Baby Shower"))
			AppUI.mysql_query.table_o.add("OCCASION_baby_shower");

	}

	public static void getPersonalityType() {

		String item = AppUI.personalitycombo.getSelectedItem().toString();

		if (item.equals("Select a personality type")) {
			AppUI.mysql_query.table_p.clear();
		} else if (item.equals("Mover"))
			AppUI.mysql_query.table_p.add("PERSONALITY_TYPE_mover");
		else if (item.equals("Thinker"))
			AppUI.mysql_query.table_p.add("PERSONALITY_TYPE_thinker");
		else if (item.equals("Connector"))
			AppUI.mysql_query.table_p.add("PERSONALITY_TYPE_connector");
		else if (item.equals("Planner"))
			AppUI.mysql_query.table_p.add("PERSONALITY_TYPE_planner");
	}

	public static void getInterest() {
		if (AppUI.chckbxInterest.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_animals_and_pets");
		} 
	
		if (AppUI.chckbxInterest_1.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_art");
		} 
		if (AppUI.chckbxInterest_2.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_cooking");
		}
		if (AppUI.chckbxInterest_3.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_fashion_and_beauty");
		}
		if (AppUI.chckbxInterest_4.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_gadgets");
		} 
		if (AppUI.chckbxInterest_5.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_gardening");
		}
		if (AppUI.chckbxInterest_6.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_gaming");
		} 
		if (AppUI.chckbxInterest_7.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_home_decor");
		} 
		if (AppUI.chckbxInterest_8.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_music");
		} 
		if (AppUI.chckbxInterest_9.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_reading");
		}
		if (AppUI.chckbxInterest_10.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_sport");
		}
		if (AppUI.chckbxInterest_11.isSelected()) {
			AppUI.mysql_query.table.add("INTEREST_toys");
		}
	}

}

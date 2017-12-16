package returngift;

public class Table_Selection {
	
	public static void getTable(String item) {
		if(item.equals("Christmas"))
			AppUI.demo.table.add("OCCASION_christmas");
		else if(item.equals("New Year's Day"))
			AppUI.demo.table.add("OCCASION_new_year");
		else if(item.equals("Valentine's Day"))
			AppUI.demo.table.add("OCCASION_valentine_day");
		else if(item.equals("International Women's Day"))
			AppUI.demo.table.add("OCCASION_international_women_day");
		else if(item.equals("Novruz"))
			AppUI.demo.table.add("OCCASION_novruz");
		else if(item.equals("House-Warming Party"))
			AppUI.demo.table.add("OCCASION_house_warming_party");
		else if(item.equals("Back-to-School"))
			AppUI.demo.table.add("OCCASION_back_to_school");
		else if(item.equals("Baby Shower"))
			AppUI.demo.table.add("OCCASION_baby_shower");
		else if(item.equals("Mover"))
			AppUI.demo.table.add("PERSONALITY_TYPE_mover");
		else if(item.equals("Thinker"))
			AppUI.demo.table.add("PERSONALITY_TYPE_thinker");
		else if(item.equals("Connector"))
			AppUI.demo.table.add("PERSONALITY_TYPE_connector");
		else if(item.equals("Planner"))
			AppUI.demo.table.add("PERSONALITY_TYPE_planner");
		
		
	}

}

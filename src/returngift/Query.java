package returngift;

import java.util.ArrayList;

public class Query {
	
	String gender, age, color, rlevel, clevel, pricerange;
	ArrayList<String> table, table_p, table_o;
	
	String[] tablelist = new String[] { "INTEREST_animals_and_pets", "INTEREST_art", "INTEREST_cooking",
		"INTEREST_fashion_and_beauty", "INTEREST_gadgets", "INTEREST_gaming", "INTEREST_gardening",
		"INTEREST_home_decor", "INTEREST_music", "INTEREST_reading", "INTEREST_sport", "INTEREST_toys",
		"OCCASION_christmas", "OCCASION_new_year", "OCCASION_valentine_day", "OCCASION_international_women_day",
		"OCCASION_house_warming_party", "OCCASION_back_to_school", "OCCASION_baby_shower", "PERSONALITY_TYPE_mover",
		"PERSONALITY_TYPE_connector", "PERSONALITY_TYPE_thinker", "PERSONALITY_TYPE_planner" };
	
	public Query(String gender, String age, String color, String rlevel, String clevel, String pricerange, ArrayList<String> table, ArrayList<String> table_p,
			ArrayList<String> table_o) {
		
		this.gender = gender;
		this.age = age;
		this.color = color;
		this.rlevel = rlevel;
		this.clevel = clevel;
		this.pricerange = pricerange;
		this.table = table;
		this.table_p = table_p;
		this.table_o = table_o;
		
	}
	
	public String generateQuery(boolean random) {
		
		String query = "";

		if (gender.equals("= \"Select a gender\""))
			gender = "IS NOT NULL";
		if (age.equals("= \"Select an age group\""))
			age = "IS NOT NULL";
		if (color.equals("= \"Select a color\""))
			color = "IS NOT NULL";

		for (String s : table_p)
			table.add(s);
		for (String s : table_o)
			table.add(s);

		if (random == false) {
			if (table.size() == 0) {
				for (int i = 0; i < tablelist.length - 1; i++) {
					query = query + "SELECT  DISTINCT item_name, item_link, price FROM " + tablelist[i] + " WHERE (gender = \"u\" OR gender "
							+ gender.toLowerCase() + ") AND age " + age.toLowerCase() + " AND color "
							+ color.toLowerCase() + " AND r_level " + rlevel.toLowerCase() + " AND c_level "
							+ clevel.toLowerCase() + " AND price " + pricerange.toLowerCase() + " UNION ";
				}
				query = query + "SELECT  DISTINCT item_name, item_link, price FROM " + tablelist[tablelist.length - 1]
						+ " WHERE (gender = \"u\" OR gender " + gender.toLowerCase() + ") AND age " + age.toLowerCase() + " AND color "
						+ color.toLowerCase() + " AND r_level " + rlevel.toLowerCase() + " AND c_level "
						+ clevel.toLowerCase() + " AND price " + pricerange.toLowerCase() + ";";
			} else {
				for (int i = 0; i < table.size() - 1; i++) {
					query = query + "SELECT  DISTINCT item_name, item_link, price FROM " + table.get(i) + " WHERE (gender = \"u\" OR gender "
							+ gender.toLowerCase() + ") AND age " + age.toLowerCase() + " AND color "
							+ color.toLowerCase() + " AND r_level " + rlevel.toLowerCase() + " AND c_level "
							+ clevel.toLowerCase() + " AND price " + pricerange.toLowerCase() + " UNION ";
				}
				query = query + "SELECT  DISTINCT item_name, item_link, price FROM " + table.get(table.size() - 1)
						+ " WHERE (gender = \"u\" OR gender " + gender.toLowerCase() + ") AND age " + age.toLowerCase() + " AND color "
						+ color.toLowerCase() + " AND r_level " + rlevel.toLowerCase() + " AND c_level "
						+ clevel.toLowerCase() + " AND price " + pricerange.toLowerCase() + ";";
			}
		} else if (random == true) {
			int rand = (int) (Math.abs(Math.random()) * (tablelist.length - 1));
			query = "SELECT DISTINCT item_name, item_link, price FROM " + tablelist[rand]
					+ " WHERE gender is not null AND age is not null AND color is not null AND r_level is not null"
					+ " AND c_level is not null AND price is not null  ORDER BY RAND() LIMIT 1;";

		}
		
		return query;
		
	}
	

}

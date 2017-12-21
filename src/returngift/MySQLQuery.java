package returngift;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import returngift.JDBCMySQLConnection;

public class MySQLQuery {

	String gender = "IS NOT NULL", age = "IS NOT NULL", color = "IS NOT NULL", rlevel = "IS NOT NULL",
			clevel = "IS NOT NULL", pricerange = "IS NOT NULL";
	ArrayList<String> table = new ArrayList<>();
	ArrayList<String> table_p = new ArrayList<>();
	ArrayList<String> table_o = new ArrayList<>();
	String[] tablelist = new String[] { "INTEREST_animals_and_pets", "INTEREST_art", "INTEREST_cooking",
			"INTEREST_fashion_and_beauty", "INTEREST_gadgets", "INTEREST_gaming", "INTEREST_gardening",
			"INTEREST_home_decor", "INTEREST_music", "INTEREST_reading", "INTEREST_sport", "INTEREST_toys",
			"OCCASION_christmas", "OCCASION_new_year", "OCCASION_valentine_day", "OCCASION_international_women_day",
			"OCCASION_house_warming_party", "OCCASION_back_to_school", "OCCASION_baby_shower", "PERSONALITY_TYPE_mover",
			"PERSONALITY_TYPE_connector", "PERSONALITY_TYPE_thinker", "PERSONALITY_TYPE_planner" };

	public void getCategoryList(boolean random) {
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null;

		CategoryList categorylist = null;

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

		try {
			connection = JDBCMySQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			categorylist = new CategoryList();
			String url = "";
			String append = "\n<p>Results:</p>\n";

			while (rs.next()) {

				url = rs.getString("item_link");
				categorylist.setItem(rs.getString("item_name"));
				categorylist.setItemLink(rs.getString("item_link"));
				categorylist.setPrice((rs.getDouble("price")));

				append = append + "\n<p>" + categorylist.getItem() + " ~> Price = " + categorylist.getPrice() + " AZN"
						+ "</p>\n" + "\n<a href=\"" + url + "\">" + url + "</a>\n";

			}

			AppUI.editorpane.setText(append);

		} catch (SQLException e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			AppUI.feedbacktextarea.setText(exceptionAsString);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
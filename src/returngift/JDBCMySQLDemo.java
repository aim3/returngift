package returngift;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.text.BadLocationException;

import returngift.JDBCMySQLConnection;

public class JDBCMySQLDemo {

	String gender = "IS NOT NULL", age = "IS NOT NULL", color = "IS NOT NULL", occasion = "IS NOT NULL",
			rlevel = "IS NOT NULL", clevel = "IS NOT NULL", pricerange = "IS NOT NULL";
	ArrayList<String> table = new ArrayList<>();
	String[] tablelist = new String[] { "INTEREST_animals_and_pets", "INTEREST_art", "INTEREST_cooking",
			"INTEREST_fashion_and_beauty", "INTEREST_gadgets", "INTEREST_gaming", "INTEREST_gardening",
			"INTEREST_home_decor", "INTEREST_music", "INTEREST_reading", "INTEREST_sport", "INTEREST_toys",
			"OCCASION_christmas", "OCCASION_new_year", "OCCASION_valentine_day", "OCCASION_international_women_day",
			"OCCASION_novruz", "OCCASION_house_warming_party", "OCCASION_back_to_school", "OCCASION_baby_shower",
			"PERSONALITY_TYPE_mover", "PERSONALITY_TYPE_connector", "PERSONALITY_TYPE_thinker",
			"PERSONALITY_TYPE_planner" };

	public void getCategoryList() {
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null;

		CategoryList categorylist = null;
		// String query = "SELECT * FROM " + tables[1] + "WHERE gender=" + gender;

		// String query = "SELECT * FROM INTEREST_fashion_and_beauty WHERE gender = '" +
		// gender.toLowerCase() + "' AND age = '" + age.toLowerCase() +
		// "' AND color = '" + color.toLowerCase() + "';";

		String append = null;

		// String query = "SELECT * FROM INTEREST_fashion_and_beauty UNION SELECT * FROM
		// INTEREST_gardening;";

		String query = "";

		if (tablelist.length == 0) {
			for (int i = 0; i < tablelist.length - 1; i++) {
				query = query + "SELECT * FROM " + tablelist[i] + "WHERE gender " + gender.toLowerCase() + " AND age "
						+ age.toLowerCase() + " AND color " + color.toLowerCase() + " AND r_level "
						+ rlevel.toLowerCase() + " AND c_level " + clevel.toLowerCase() + " AND price "
						+ pricerange.toLowerCase() + " UNION ";
			}
			query = query + "SELECT * FROM " + tablelist[tablelist.length - 1] + "WHERE gender " + gender.toLowerCase()
					+ " AND age " + age.toLowerCase() + " AND color " + color.toLowerCase() + " AND r_level "
					+ rlevel.toLowerCase() + " AND c_level " + clevel.toLowerCase() + " AND price "
					+ pricerange.toLowerCase() + ";";
		} else {
			for (int i = 0; i < table.size() - 1; i++) {
				query = query + "SELECT * FROM " + table.get(i) + "WHERE gender " + gender.toLowerCase() + " AND age "
						+ age.toLowerCase() + " AND color " + color.toLowerCase() + " AND r_level "
						+ rlevel.toLowerCase() + " AND c_level " + clevel.toLowerCase() + " AND price "
						+ pricerange.toLowerCase() + " UNION ";
			}
			query = query + "SELECT * FROM " + table.get(table.size() - 1) + "WHERE gender " + gender.toLowerCase()
					+ " AND age " + age.toLowerCase() + " AND color " + color.toLowerCase() + " AND r_level "
					+ rlevel.toLowerCase() + " AND c_level " + clevel.toLowerCase() + " AND price "
					+ pricerange.toLowerCase() + ";";
		}

		try {
			connection = JDBCMySQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			categorylist = new CategoryList();
			String url = "";
			String hyperlink = "";

			while (rs.next()) {

				url = rs.getString("item_link");
				hyperlink = "\n<a href=\"" + url + "\">" + url + "</a>\n";
				categorylist.setItem(rs.getString("item_name"));
				categorylist.setItemLink(rs.getString("item_link"));
				/*
				categorylist.setGender(rs.getString("gender"));
				categorylist.setAge(rs.getString("age"));
				categorylist.setColor(rs.getString("color"));
				categorylist.setOccasion(rs.getString("item_id"));
				categorylist.setRLevel(rs.getInt("c_level"));
				categorylist.setCLevel((rs.getInt("r_level")));
				categorylist.setPriceRange((rs.getDouble("price")));
				*/
				// System.out.println(categorylist.toString());

				append = "\n" + categorylist.getItem() + " -> ";

				AppUI.editorpane.setText(append + hyperlink);

				// AppUI.editorpane.getDocument().insertString(0, append, null);
				// AppUI.editorpane.getDocument().insertString(0, hyperlink, null);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} // catch (BadLocationException e) {
			// e.printStackTrace();
			// }
		finally {
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
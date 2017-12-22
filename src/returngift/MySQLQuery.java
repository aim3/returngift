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

	public void sendQuery(boolean random) {
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null;

		CategoryList categorylist = null;

		Query sql_query = new Query(gender, age, color, rlevel, clevel, pricerange, table, table_p, table_o);
		
		String query = sql_query.generateQuery(random);
		

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
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class QueryTest {

	@Test
	void searchWithoutSelectedTablesShouldQueryAllTables() {

		ArrayList<String> table1 = new ArrayList<>(); //interest, personality test, occasion tables - all tables
		ArrayList<String> table_p1 = new ArrayList<>(); //personality test tables
		ArrayList<String> table_o1 = new ArrayList<>(); //occasion tables

		Query query = new Query("is not null", "is not null", "is not null", "<= 10", ">= 0", "<= 1000", table1, table_p1, table_o1);

		String select = "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_animals_and_pets WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_art WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_cooking WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_fashion_and_beauty WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_gadgets WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_gaming WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_gardening WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_home_decor WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_music WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_reading WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_sport WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM INTEREST_toys WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM OCCASION_christmas WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM OCCASION_new_year WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM OCCASION_valentine_day WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM OCCASION_international_women_day WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM OCCASION_house_warming_party WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM OCCASION_back_to_school WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM OCCASION_baby_shower WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM PERSONALITY_TYPE_mover WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM PERSONALITY_TYPE_connector WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM PERSONALITY_TYPE_thinker WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM PERSONALITY_TYPE_planner WHERE (gender = \"u\" OR gender is not null) "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000;";

		assertNotNull(query.generateQuery(false), "The non-random search option should return a query");
		assertEquals(select, query.generateQuery(false),
				"A non-random search without tables specificed should query all tables in the database");

	}
	
	@Test
	void queryShouldTakeAllSpecifiedArguments() {
		
		ArrayList<String> table2 = new ArrayList<>();
		ArrayList<String> table_p2 = new ArrayList<>();
		ArrayList<String> table_o2 = new ArrayList<>();
		
		table_p2.add("PERSONALITY_TYPE_mover");
		table_o2.add("OCCASION_christmas");
		
		String select = "SELECT  DISTINCT item_name, item_link, price FROM PERSONALITY_TYPE_mover WHERE (gender = \"u\" OR gender = \"u\") "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000 "
				+ "UNION "
				+ "SELECT  DISTINCT item_name, item_link, price FROM OCCASION_christmas WHERE (gender = \"u\" OR gender = \"u\") "
				+ "AND age is not null AND color is not null AND r_level <= 10 AND c_level >= 0 AND price <= 1000;";

		Query query = new Query("= \"U\"", "= \"Select an age group\"", "= \"Select a color\"", "<= 10", ">= 0", "<= 1000", table2, table_p2, table_o2);
		
		String generation = query.generateQuery(false);
		
		assertNotNull(generation, "A non-random query with arguments should return a query");
		assertEquals(select, generation, "A non-random query should take all specified arguments and use defaults for non-specified arguments");
		
	}
	
	@Test
	void randomOptionShouldReturnRandomQuery() {

		ArrayList<String> table3 = new ArrayList<>();
		ArrayList<String> table_p3 = new ArrayList<>();
		ArrayList<String> table_o3 = new ArrayList<>();
		
		table_p3.add("PERSONALITY_TYPE_connector");
		table_o3.add("OCCASION_house_warming_party");
		
		Query query = new Query("= \"F\"", "= \"Select an age group\"", "= \"Select a color\"", "<= 10", ">= 0", "<= 1000", table3, table_p3, table_o3);
		
		String generation = query.generateQuery(true);
		
		assertNotNull(generation, "The randomize option should return a query");
		
		//a random query ends with 1;, which is why it is tested below
		assertEquals('1', generation.charAt(generation.length() - 2), 
				"The randomize option should return a random query regardless of the specified filters");
		
	}
	
	

}

package returngift;

public class AppOptionInput {

	public static void first_button() {

		AppUI.mysql_query.gender = "= \"" + AppUI.gendercombo.getSelectedItem().toString() + "\"";
		AppUI.mysql_query.age = "= \"" + AppUI.agecombo.getSelectedItem().toString() + "\"";
		AppUI.mysql_query.color = "= \"" + AppUI.colorcombo.getSelectedItem().toString() + "\"";
		AppUI.mysql_query.rlevel = "<= " + AppUI.rlevelslider.getValue();
		AppUI.mysql_query.clevel = ">= " + AppUI.clevelslider.getValue();
		AppUI.mysql_query.pricerange = "<= " + AppUI.pricerangeslider.getValue();

		TableSelection.getInterest();
		TableSelection.getOccasion();
		TableSelection.getPersonalityType();
		
		AppUI.mysql_query.sendQuery(false);

	}

	public static void second_button() {

		if (AppUI.ratingcombo.getSelectedItem() != null && AppUI.feedbacktextarea.getText() != null) {
			Feedback fb = new Feedback(AppUI.feedbacktextarea.getText(),
					AppUI.ratingcombo.getSelectedItem().toString());
			fb.sendMail();
		} else
			AppUI.feedbacktextarea.setText("Please choose a rating and enter feedback here.");

	}

	public static void third_button() {

		AppUI.mysql_query.sendQuery(true);

	}

	public static void fourth_button() {

		TypeResult.generateResult();
		
	}

}

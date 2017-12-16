package returngift;

public class Button_Events {
	
	public static void first_button() {
		
		//AppUI.textPane.setText(null);

		//String s = AppUI.textPane.getText();
		
		AppUI.demo.getCategoryList();

		
}
	
	public static void second_button() {
		
		if(AppUI.ratingcombo.getSelectedItem() != null && AppUI.feedbacktextarea.getText() != null) {
		Feedback fb = new Feedback(AppUI.feedbacktextarea.getText(), AppUI.ratingcombo.getSelectedItem().toString());
		fb.sendMail();
		}
		else
			//prompt to enter something
			;
		
	}
	
	
	
}


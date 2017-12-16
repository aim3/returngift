package returngift;

public class CategoryList {
    
	private String item = "", itemlink = "";
    private String gender = "", age = "", color = "", occasion = "";
    private int rlevel = 0, clevel = 0;
    private double pricerange = 0;
    private String[] tables = new String[] { 
    		"INTEREST_animals_and_pets", 
    		"INTEREST_art", 
    		"INTEREST_cooking", 
    		"INTEREST_fashion_and_beauty", 
    		"INTEREST_gadgets", 
    		"INTEREST_gaming", 
    		"INTEREST_gardening", 
    		"INTEREST_home_decor", 
    		"INTEREST_music", 
    		"INTEREST_reading",
    		"INTEREST_sport",  
    		"INTEREST_toys",
    		"OCCASION_christmas", 
    		"OCCASION_new_year", 
    		"OCCASION_valentine_day", 
    		"OCCASION_international_women_day", 
    		"OCCASION_novruz", 
    		"OCCASION_house_warming_party", 
    		"OCCASION_back_to_school", 
    		"OCCASION_baby_shower",
    		"PERSONALITY_TYPE_mover", 
    		"PERSONALITY_TYPE_connector", 
    		"PERSONALITY_TYPE_thinker", 
    		"PERSONALITY_TYPE_planner"
    		  };
    
    public String getItem() {
    	return item;
    }
    public void setItem(String item) {
    	this.item = item;
    }
    public String getItemLink() {
    	return itemlink;
    }
    public void setItemLink(String itemlink) {
    	this.itemlink = itemlink;
    }
    
     
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getOccasion() {
        return occasion;
    }
    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }
    public int getRLevel() {
        return rlevel;
    }
    public void setRLevel(int rlevel) {
        this.rlevel = rlevel;
    }
    public int getCLevel() {
        return clevel;
    }
    public void setCLevel(int clevel) {
        this.clevel = clevel;
    }
    public double getPriceRange() {
        return pricerange;
    }
    public void setPriceRange(double pricerange) {
        this.pricerange = pricerange;
    }
   
    //toString()
    @Override
    public String toString() {
        return "CategoryList [ITEM = " + item + ", LINK = " + itemlink + ", gender = " + gender + ", age = " + age + ", color = "
                + color + ", occasion = " + occasion + ", relationship level = " + rlevel + ", creativity level = " + clevel + ", price range = " + pricerange + "]";
    } 
    
   
}

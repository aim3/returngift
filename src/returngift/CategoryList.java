package returngift;

public class CategoryList {

	private String item = "", itemlink = "";
	private String gender = "", age = "", color = "";
	private int rlevel = 0, clevel = 0;
	private double pricerange = 0;

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

	public double getPrice() {
		return pricerange;
	}

	public void setPrice(double pricerange) {
		this.pricerange = pricerange;
	}

	@Override
	public String toString() {
		return "CategoryList [ITEM = " + item + ", LINK = " + itemlink + ", gender = " + gender + ", age = " + age
				+ ", color = " + color + ", relationship level = " + rlevel + ", creativity level = " + clevel
				+ ", price range = " + pricerange + "]";
	}

}

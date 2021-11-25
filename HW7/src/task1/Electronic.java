package task1;

public class Electronic implements HouseholdItem{
	
	private String name;
	
	private int height;
	private int width;
	private int length;
	
	private int weight;
	private boolean fragility;
	
	
	public Electronic(String name, int height, int width, int length, int weight, boolean fragility) {
		super();
		this.name = name;
		this.height = height;
		this.width = width;
		this.length = length;
		this.weight = weight;
		this.fragility = fragility;
	}
	
	@Override
	public double getPrice() {
		return (fragility) ? (double) weight/10 * 5: (double) weight/15 * 5;
	}

	@Override
	public String getPackaging() {
		return "covered with Polyethylene foam film and packed in a box with dimension: " + (height+1) + "x" + (width+1) + "x" + (length+1);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isFragility() {
		return fragility;
	}
	public void setFragility(boolean fragility) {
		this.fragility = fragility;
	}
	
	
	

}

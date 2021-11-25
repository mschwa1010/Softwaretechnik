package task1;

public class Furniture implements HouseholdItem{
	
	private String name;
	private String type;
	
	private int height;
	private int width;
	private int length;
	
	private int weight;

	public Furniture(String name, String type, int height, int width, int length, int weight) {
		super();
		this.name = name;
		this.type = type;
		this.height = height;
		this.width = width;
		this.length = length;
		this.weight = weight;
	}

	@Override
	public double getPrice() {
		return (double) weight/20 *5;
	}

	@Override
	public String getPackaging() {
		return "covered with waterproof covers with area of: " + height + "x" + width + "x" + length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	
	
	
	

}

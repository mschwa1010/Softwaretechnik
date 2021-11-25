package task1;

public class Glass implements HouseholdItem{
	
	private String name;
	
	private int height;
	private int width;
	private int length;
	
	private int thickness;

	public Glass(String name, int height, int width, int length, int thickness) {
		super();
		this.name = name;
		this.height = height;
		this.width = width;
		this.length = length;
		this.thickness = thickness;
	}

	@Override
	public double getPrice() {
		
		return (thickness==1) ? (double) length/100 * 2 : (thickness==2) ? (double) length/100 * 1.2 : (double) length/100 * 0.7;
	}

	@Override
	public String getPackaging() {
		
		return "wrapped in Bubble wraps and packed in a box with dimension:" + (height+1) + "x" + (width+1) + "x" + (length+1);
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

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	
	

}

package task1;

public class HouseholdAdapterImpl implements HouseholdAdapter {
	
	private HouseholdItem householdItem;
	
	
	public HouseholdAdapterImpl(HouseholdItem householdItem) {
		super();
		this.householdItem = householdItem;
	}

	@Override
	public void printPrice() {
		System.out.println("Total cost for " + householdItem.getName() + " is: "+ householdItem.getPrice() +" Euros");
	}

	@Override
	public void printPackaging() {
		
		System.out.println(householdItem.getName()+":");
		System.out.println(" >Should be " + householdItem.getPackaging());
		
	}

}

package ineuron;

public class Ram {

	private String specs;
	private int size;
	private int cost;
	
	public Ram(String specs , int size ,int cost)
	{
		super();
		this.cost=cost;
		this.size=size;
		this.specs=specs;
	}
    
	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Ram [specs=" + specs + ", size=" + size + ", cost=" + cost + "]";
	}

}

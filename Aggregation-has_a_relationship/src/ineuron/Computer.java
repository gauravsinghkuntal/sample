package ineuron;

import java.util.Arrays;

public class Computer {

	private String compName;
	private int cost;
	private String hardDiskSize;
	private Ram[] ram;
	
	public Computer(String compName, int cost, String hardDiskSize, Ram[] ram) {
		super();
		this.compName = compName;
		this.cost = cost;
		this.hardDiskSize = hardDiskSize;
		this.ram = ram;
	}
	
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getHardDiskSize() {
		return hardDiskSize;
	}
	public void setHardDiskSize(String hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}
	public Ram[] getRam() {
		return ram;
	}
	public void setRam(Ram[] ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Computer [compName=" + compName + ", cost=" + cost + ", hardDiskSize=" + hardDiskSize + ", ram="
				+ Arrays.toString(ram) + "]";
	}
	
    public void displayDetails() {
    	System.out.println("Computer name is:- " + getCompName());
    	System.out.println("Computer cost is:- " + getCost());
    	System.out.println("Computer hardDiskSize is :-" + getHardDiskSize());
    	System.out.println();
    	System.out.println("=================================================");
    	System.out.println("Computer RAM's are:- ");
    	for(int i=0;i<ram.length;i++) 
    	{
    		System.out.println(" RAM COST IS :-"  +ram[i].getCost());
    		System.out.println("RAM SIZE IS :-"+ ram[i].getSize());
    		System.out.println("RAM SPECS IS :- "+ram[i].getSpecs());
    	}
    }
	
	}
	
	


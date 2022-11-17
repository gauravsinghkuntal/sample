package Test;

import ineuron.Computer;
import ineuron.Ram;

public class Tester {

	public static void main(String[] args) {
		
		Ram ram= new Ram("HiGH SPEED", 1, 10000);
		Ram ram1=new Ram("low size", 2, 20000);
		Ram ram2=new Ram("Medium size",4,6000);
	    Ram[] ram5= {ram,ram1,ram2};
	     Computer comp= new Computer("macbook",100000,"256gb",ram5);
	     comp.displayDetails();
		
	}
}

public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("The machine is empty");
	}

	public void ejectQuarter() {
		System.out.println("No quarter is in machine");
	}

	public void turnCrank(){
		System.out.println("The machine is empty, this operation is useless");
	}

	public void dispense() {
		System.out.println("Nothing can be released");
	}
}

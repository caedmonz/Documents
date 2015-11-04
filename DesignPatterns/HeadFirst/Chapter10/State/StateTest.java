public class StateTest{
	public static void main(String[] args){
		GumballMachine machine = new GumballMachine(4);
		machine.ejectQuarter();
		machine.turnCrank();
		machine.dispense();

		machine.insertQuarter();
		machine.dispense();
		machine.turnCrank();
		machine.ejectQuarter();

		machine.dispense();
	}
}

public class RemoteLoader{
	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Light wcLight = new Light("WC");

		LightOnCommand livingRoomOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomOffCommand = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenOffCommand = new LightOffCommand(kitchenLight);

		LightOnCommand WcOnCommand = new LightOnCommand(wcLight);
		LightOffCommand WcOffCommand = new LightOffCommand(wcLight);

		remoteControl.setCommand(0, livingRoomOnCommand, livingRoomOffCommand);
		remoteControl.setCommand(1, kitchenOnCommand, kitchenOffCommand);
		remoteControl.setCommand(2, WcOnCommand, WcOffCommand);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);

	}
}


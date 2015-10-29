public class Amplifier {
	DvdPlayer dvd;
	int volume;

	public void on(){
		System.out.println("Amplifier on");
	}

	public void off(){
		System.out.println("Amplifier off");
	}

	public void setDvd(DvdPlayer dvd){
		this.dvd = dvd;
		System.out.println("Set Dvd to Amplifier");
	}

	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("Set volume to " + volume);
	}

	public void setSurrondSound() {
		System.out.println("Open SurrondSound");
	}
}

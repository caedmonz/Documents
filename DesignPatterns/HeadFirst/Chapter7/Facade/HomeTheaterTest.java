public class HomeTheaterTest{
	public static void main(String[] args){
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(),
					new Tuner(),
					new DvdPlayer(),
					new CdPlayer(),
					new Projector(),
					new Screen(),
					new TheaterLights(),
					new PopcornPopper());
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}

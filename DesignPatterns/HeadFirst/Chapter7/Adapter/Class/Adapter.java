public class Adapter extends Adaptee implements Target {
	public void request(){
		this.specificRequest();
	}
}

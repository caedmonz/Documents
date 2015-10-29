public class Adapter implements Target {
	Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void request(){
		adaptee.specificRequest();
	}
}

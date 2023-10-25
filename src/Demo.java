
public class Demo {
 int i;
 
	public Demo(int i) {
		this.i = i;
	}
	
	public void display() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo(3);
		d.display();
	}

}

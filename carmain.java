package car;

public class carmain{
	static void display(int x,int y){
		System.out.println("Speed = "+x+" km/h"+"\nGear= "+ y+"nd gear");
	}
	public static void main(String args[]) {
		speedinc si=new speedinc(50,2);
	    speedinc spitem;
	    spitem =si;
	     display(spitem.speedup(50),spitem.changegear(2));
}
}


package interfaces;

public class interf{
	static void display(float x,float y){
		System.out.println("Area="+x+"perimeter = "+ y);
	}
	public static void main(String args[]) {
		Circle c =new Circle(5.2f);
		Ellipse e =new Ellipse(4.5f,3.6f);
		Rectangle r=new Rectangle(6.5f,4.3f);
	    GeoAnalyzer geoItem;
	     geoItem =c;
	     display(geoItem.area(),geoItem.perimeter());
	     geoItem=e;
	     display(geoItem.area(),geoItem.perimeter());
	     geoItem=r;
	     display(geoItem.area(),geoItem.perimeter());
}
}



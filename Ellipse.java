package interfaces;

public class Ellipse implements GeoAnalyzer {
	float major;
	float minor;
	
	Ellipse(float m,float n){
		major=m;
		minor=n;
	}
	public float area()
	{
		return (pi* major * major);
	}
	public float perimeter() {
		return(2 * (major+minor));
	}

}

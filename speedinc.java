package car;

public class speedinc implements vehicle {
	int svalue,gvalue,speed=0,gear;
	speedinc(int sp,int gv)
	{
		svalue=sp;
		gvalue=gv;
	}
	public int speedup(int value) {
		speed+=value;
		return speed;
	}
	@Override
	public int changegear(int value) {
		gear=value;
		return value;
	}
	

}

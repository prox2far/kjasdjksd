import java.util.ArrayList;

public class MyMath {

	public MyMath() {
	}
	
	 public double sum(ArrayList<Double> xs) {
		 double x = 0.0;
	     for(double tal : xs) {
	    	 x += tal;
	    }
	    return x;
	}
}

package spider.cat.nova.util.test;

import spider.cat.nova.util.DoubleToInt;

public class TestForDoubleToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( DoubleToInt.cast( 100.01 ) == 100 );
		System.out.println( DoubleToInt.cast( 101 ) == 101 );
		
	}

}

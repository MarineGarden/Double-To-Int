package spider.cat.nova.util;

public class DoubleToInt {
	
	public static int cast( double number ) {
		
		String withDecimalPoint = Double.toString( number );
		String shouldBeInt = withDecimalPoint.split( "\\." )[ 0 ];
		return Integer.valueOf( shouldBeInt );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( DoubleToInt.cast( 101 ) );
		
	}

}

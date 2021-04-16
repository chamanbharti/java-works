package mathematics.roundoff_after_decimal;

import java.math.RoundingMode;
import java.text.DecimalFormat;

// reference:
//https://www.programiz.com/java-programming/examples/round-number-decimal
public class RoundOffAfterDecimal {
	
	public static void main(String[] args) {
		double num = 1.34567;
        System.out.format("%.4f", num);//1.3457
        System.out.println();
        
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(num));
        
        //3.860500 but i want 3.8600
        
        double num2 = 3.860500;
        //double roundOff = Math.round(num2*100)/100;//3.0
        double roundOff = Math.round(num2*100)/100D;//3.86
        String.format("%.4f", roundOff);
        System.out.println(roundOff);
        
	}
}

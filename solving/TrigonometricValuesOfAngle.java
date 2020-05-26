package solving;

// Find Trigonometric Values Of An Angle.
public class TrigonometricValuesOfAngle {

	public static void main(String[] args) {
		double angle = 90;
		
		double angleInRadians = Math.toRadians(angle);
		
		double sineOfNum = Math.sin(angleInRadians);
		double cosineOfNum = Math.cos(angleInRadians);
		double tangentOfNum = Math.tan(angleInRadians);
		
		double secOfNum = (1 / sineOfNum);
		double cosecOfNum = (1 / cosineOfNum);
		double cotOfNum = (1 / tangentOfNum);
		
		System.out.println("sin("+angle+") = "+sineOfNum);
		System.out.println("cos("+angle+") = "+cosineOfNum);
		System.out.println("tan("+angle+") = "+tangentOfNum);
		
		System.out.println("----------------------------------");
		
		System.out.println("sec("+angle+") = "+secOfNum);
		System.out.println("cosec("+angle+") = "+cosecOfNum);
		System.out.println("cot("+angle+") = "+cotOfNum);
	}
	
}
// 출처 : https://javaconceptoftheday.com/trigonometric-values-math-class/
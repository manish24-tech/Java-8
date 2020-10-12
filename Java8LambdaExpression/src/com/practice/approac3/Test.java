package com.practice.approac3;

public class Test {


	public static void main(String[] args) {

		int radious = 2;
		
		// Access via Anonymous interface reference
		Double showResult = Compute.showResult(radious, new CustomListener() {
			
			@Override
			public Double areaOfCircle(int r) {
				if(radious != 0 ) {
					r = radious;
					return Math.PI * r * r;
				} 
				return 0.0;
			}
		});
		System.out.println("Test.main() => "+showResult);
	
		
		// Access via lambda expression
		Double showResult2 = Compute.showResult(radious, (val) -> Math.PI * val * val);
		System.out.println("Test.main() => "+showResult2);
		
		// Standard Approach 
		CustomListener obj = (val) -> Math.PI * val * val;
		System.out.println("Test.main() => "+obj.areaOfCircle(radious));
		
		
	}

}

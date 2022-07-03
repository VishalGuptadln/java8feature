package com.np.feature;

interface Calculator {

	//void switchOn();
	//void sum(int input);
	int substract(int i,int j);
}

public class CalculatorImpl {

	public static void main(String[] args) {

//		Calculator cal = () -> System.out.println("Swi");
//		cal.switchOn();
		
//		Calculator cal=(input) -> System.out.println("sum : "+input);
//		cal.sum(2000);
		
		Calculator cal=(i,j) ->{
			if(j<i)
				throw new RuntimeException("message");
			return j-i;
		};
		System.out.println(cal.substract(2, 34));
	}

	// () -> {body};

}

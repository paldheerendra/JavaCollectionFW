package java8.features.lambdaConcept;

public class LambdaExpressionAdd {

	public static void main(String[] args) {

		//Lambda exp without return
		Add a1 =(a,b)->(a+b);
		
		//with return
		Add a2 =(a,b)->{return (a+b);};
		
		System.out.println(a1.add(10,20));
		System.out.println(a2.add(100,200));

		
	}

}

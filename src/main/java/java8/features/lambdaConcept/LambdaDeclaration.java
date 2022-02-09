package java8.features.lambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {
		
		WebPage w1 = (value) -> { System.out.println("Hii " + value);
		};
		
		WebPage w2 = (value) -> System.out.println(value.toUpperCase());
		
		w1.header("Google");
		w2.header("Faebook");
	}

}
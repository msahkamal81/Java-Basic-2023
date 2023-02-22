package javasession;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a>b);
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		if(false) {
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		boolean flag = true;
		if(flag) {
			System.out.println("java");
		}
		else {
			System.out.println("python");
		}
		
		//nested if
		
	    int marks = 101;
		if(marks <= 100) {
			System.out.println("A Grade");
	    if(marks >= 95) {
				System.out.println("A++ grade");
			}
			else {
				System.out.println("B grade");
			}
		}
		
		
		else {
			System.out.println("Wrong Marks");
		}
		
		int p = 10;
		int q = 10;
		if(p==q) {
			System.out.println("hello");
		}
		
//		String name = "tom";
//		if(name.equals("harsh")) {
//			System.out.println("100 marks");
//			
//		}
//		if(name.equals("vikay")) {
//			System.out.println("90 marks");
//			
//		}
//		
//		if(name.equals("Ravi")) {
//			System.out.println("80 marks");
//		} 
//		if(name.equals("naveen")) {
//			
//			System.out.println("70 marks");
//		}
//		else {
//			System.out.println("student not found");
//		}
//		if else if
		
		String name = "Tom";
		if(name.equals("harsh")) {
			System.out.println("100 marks");
			
		}
		else if(name.equals("vikay")) {
			System.out.println("90 marks");
			
		} 
		
		else if(name.equals("Ravi")) {
			System.out.println("80 marks");
		} 
		else if(name.equals("naveen")) {
			
			System.out.println("70 marks");
		}
		else {
			System.out.println("student not found");
		}
		 

		

	}

} 

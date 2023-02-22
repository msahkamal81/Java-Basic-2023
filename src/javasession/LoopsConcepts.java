package javasession;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		
		//1.while loop:
		//1 to 10
		int i = 0;
		while(i<=10) {
			System.out.println(i);
			 i++;
			//++i;
			//i=i+1;
		}
		System.out.println("      ");
		//
		
		int p = 1;
		while(p <=100) {
			System.out.println(p);
			if(p % 5 == 0) {
				System.out.println("Hi.....");
				break;
			}
			p++;
		}
		System.out.println("........");
		
//		while(true) {
//			System.out.println("Welcome to Taj Hotel");
//		}
		
//		boolean flag = false;
//		while(!false) {
//			System.out.println("Welcome to taj Hotel");
//		}
//		
		
		
		//use cases of while:whenever we are not sure about number of iterations 
		//1. lazy loading :LinkedIn, Swiggy, FB.
		//2. Pagination:12345..20..80..100
		//3.page loading:10,20,30,40,100.
		//4.element is getting displayed on the page : 10,20,30
		//5.carousel:
		//6.calendar:
		System.out.println("..........");
		
		
		
		//2. For loop:if we are sure about number iterations
		//1 to 10:
//		for(int a=1; a<=10; ++a) {
//			System.out.println(a);//12345678910
//		}
		
		int a = 1;
		for(; a<=10;) {
			System.out.println(a);//123456910
			//a++;
			a=a+1;
			
		}
		System.out.println("---------");
		
		
		//0,2,4,6,8,10 even numbers ---->% operator(even % 2 ==0)
		for(int even=0; even<=10; even=even+2) {
			System.out.println(even);
			//even++;
		}
		
		System.out.println("-------");
		
		
		//1 3 5 7 9  odd numbers
//		for(; ;) {
//			System.out.println("bye;;");
//		}
		
		for(;true;) {
			System.out.println("bye;;");
			break;
		}
		
		for(; ;) {
			System.out.println("bye ");
			break;
		}
		
		System.out.println("//////////////");
		
		
		//
		
		for(int odd = 1; odd<=10;odd++) {
			System.out.println(odd);
			odd++;
			
		
	}
		//
		for(;true ;){
			System.out.println("bye");
			break;
			
		}
		
		
		//
		
		
		for(byte odd = 1; odd<=10;odd++) {
			System.out.println(odd);
			odd++;
			
		}
		
		//
		for(char c = 'a'; c<='z';c++) {
			System.out.println(c + ":" +(int)c);
		}
		
		
		System.out.println("---------a t0 z ------");
		
		for(char c = 'a'; c<='z';c++) {
			//System.out.println(c+"");
			System.out.println(c+0);
		}
		
		 
		
		
		
		
	}	
		

}

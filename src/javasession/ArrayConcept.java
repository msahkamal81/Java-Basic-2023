package javasession;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1.int Array
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println("li = "+ 0);
		int len = i.length;
		System.out.println("length = " + len);
		System.out.println("hi = " + (len-1));
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//Aiob
		
		System.out.println(i[0]+i[1]);
		
		
		//to the print all the value; iterate the array: use for loop
		
	   for(int k=0;k<i.length;k++) {
		   System.out.println(k+":"+i[k]);
	   }
	   
	   System.out.println("..........");
	   
	   //for each loop
	   int counter = 0;
	   for(int e : i) {
		   System.out.println(counter +":"+ e);
		   counter++;
	   }
	   
	   //double array:
	   double d[] = new double[2];
	   d[0] = 12.33;
	   d[1] =  23.33;
	   for(double e : d) {
		   System.out.println(e);
	   }
	   
	   //Char array
	   char c[] = new char[3];
	   c[0] = 'a';
	   c[1] = '3';
	   c[2] = '$';
	   System.out.println(c);
	   
	   
	   
	   
	   

	}
	public static void doSearch() {
		System.out.println();
	}

}

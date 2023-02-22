package javasession;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		//1. post increments:
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int c = -98;
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		int p = 101;
		int q = p++;
		System.out.println(p);
		System.out.println(q);
		
		//2. pre  increment.
		
		int h = 1;
		int g = ++h;
		System.out.println(h);
		System.out.println(g);
		
		int f = -1099;
		int s = ++f;
		System.out.println(f);
		System.out.println(s);
		
		
		//3. post Decrements.
		int t = 2;
		int r = t--;
		System.out.println(t);
		System.out.println(r);
		
		int x = -99;
		int y = x--;
		System.out.println(x);
		System.out.println(y);
		
		//4. pre decrements.
		
		int v = 2;
		int n = v--;
		System.out.println(v);
		System.out.println(n);
		
		
		int m = 2;
		System.out.println(m++);
		System.out.println(m);
		
		int mn = -99;
		System.out.println(--mn);
		System.out.println(mn);
		
		
		int sum = 1;
		System.out.println(sum+++10);
		System.out.println(sum+10);
		
		
		int total = 1;
		//System.out.println(++total+10);
		System.out.println(++total+10+total++);
		System.out.println(total);
		System.out.println(10+20);
		System.out.println(20/10);
		System.out.println(10*20);
		System.out.println(40-20);
		
		
		System.out.println(10>5);
		System.out.println(20<4);
		
		
		
		
		
		
		
		
		
		
				

	}

}

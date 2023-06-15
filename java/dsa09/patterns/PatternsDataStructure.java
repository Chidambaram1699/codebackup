package dsa09.patterns;

public class PatternsDataStructure {
	public static void main(String[] args) {
		pattern17(4);
//		System.out.println();
//		pattern2(4);
//		System.out.println();
//		pattern3(4);
//		System.out.println();
//		pattern4(4);
//		System.out.println();
//		pattern5(4);
//		System.out.println();
//		pattern6(4);System.out.println();
//		
//		pattern7(4);
//		System.out.println();
//		
//		pattern8(4);
//		System.out.println();
//		pattern9(4);
//		System.out.println();
//		pattern10(4);
//		System.out.println();
//		pattern11(4);
//		System.out.println();
//		pattern12(4);
//		System.out.println();
//		pattern13(4);
//		System.out.println();
//		pattern14(4);
//		System.out.println();
//		pattern15(4);
//		System.out.println();
//		pattern16(4);
//		System.out.println();
//		pattern17(4);
//		System.out.println();
//		pattern31(4);
//		
	}

	public static void pattern1(int n) {
		for(int r=0;r<n;r++) {
			for(int c=0;c<(n);c++) {
				System.out.print("* ");
			}System.out.println();}}

	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print("* ");
		}
		System.out.println();}}
	
	public static void pattern3(int n) {
		for(int i=0;i<n;i++) {
		for(int j=0;j<n-i;j++) {
		System.out.print("* ");
		}
		System.out.println();}}
	
	public static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
			System.out.println();}}
	
	public static void pattern5(int n) {
		for(int i=1;i<=(2*n);i++) {
		int c=n>i ? i : (2*n-i);
		for(int j=1;j<=c;j++) {
		System.out.print("* ");
		}
		System.out.println();}}
	
	public static void pattern6(int n) {
		for(int i=1;i<=n;i++) {
			int S=n-i;
		for(int s=0;s<S;s++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print("*");
		}
		System.out.println();}}

	public static void pattern7(int n) {
		for(int i=0;i<=n;i++) {
		for(int s=0;s<i;s++) {
			System.out.print(" ");
		}
		for(int j=1;j<=n-i;j++) {
		System.out.print("*");
		}
		System.out.println();}}
	
	public static void pattern8(int n) {
		for(int i=0;i<n;i++) {
			int S=n-i;
		for(int s=0;s<S;s++) {
			System.out.print(" ");
		}
		for(int j=0;j<=(2*i);j++) {
		System.out.print("*");
		}
		System.out.println();}}
	
	public static void pattern9(int n) {
		for(int i=1;i<=n;i++) {
		for(int s=1;s<i;s++) {
			System.out.print(" ");
		}
		for(int j=0;j<=(n*2-(i*2));j++) {
		System.out.print("*");
		}
		System.out.println();}}
	
	public static void pattern10(int n) {
		for(int i=1;i<=n;i++) {
			int S=n-i;
		for(int s=0;s<S;s++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print("* ");
		}
		System.out.println();}}
	
	public static void pattern11(int n) {
		for(int i=0;i<=n;i++) {
		for(int s=0;s<i;s++) {
			System.out.print(" ");
		}
		for(int j=1;j<=n-i;j++) {
		System.out.print("* ");
		}
		System.out.println();}}
	
	public static void pattern12(int n) {
		for(int i=0;i<=(2*n);i++) {
		int S = i<n ? i :(2 * n-i);
		int C = i<n ? (n-i) : (i-n);
		for(int s=0;s<S;s++) {
			System.out.print(" ");
		}
		for(int j=0;j<C;j++) {
		System.out.print("* ");
		}
		System.out.println();}}
	
	public static void pattern13(int n) {
		for(int i=0;i<n;i++) {
			int S=n-i;
		for(int s=0;s<S;s++) {
			System.out.print(" ");
		}
		for(int j=0;j<=(2*i);j++) {
		String p=((j==0)||(j==(2*i))||(i==(n-1))) ? "*" : " " ;
		System.out.print(p);
		}
		System.out.println();}}
	
	public static void pattern14(int n) {
		for(int i=1;i<=n;i++) {
			int S=i;
		for(int s=1;s<S;s++) {
			System.out.print(" ");
		}
		for(int j=0;j<=(2*(n-i));j++) {
		String p=((j==0)||(j==(2*(n-i)))||(i==1)) ? "*" : " " ;
		System.out.print(p);
		}
		System.out.println();}}
	
	public static void pattern15(int n) {
		for(int i=1;i<(2*n);i++) {
			int S=i<n ? n-i : i-n;
			for(int s=0;s<S;s++) {
				System.out.print(" ");}
			int C= n>=i ? (2*i):2*(2*n-i);
			for(int j=1;j<C;j++) {
			String p=((j==1)||(j==(C-1))) ? "*" : " ";
				System.out.print(p);
			}System.out.println();}}
	
	public static void pattern16(int n) {
	for(int i=1;i<=n;i++) {
		int S=n-i;
		int c= 1;
		for(int s=0;s<S;s++) {System.out.print(" ");}
		for(int j=1;j<=i;j++) {
			int p=j<i ? Math.max(c,j) : Math.min(c, j);
			System.out.print(p+" ");
		}System.out.println();}}
	
	public static void pattern17(int n) {
		for(int r=1;r<n*2;r++) {
			int S=r<n ? n-r:r-n;
			for(int s=0;s<S;s++) {
				System.out.print(" ");}
			int z=r<=n?r+1:r+1-2*S;
			int C=r<5 ? r*2 : 2*(n*2-r); 
			for(int c=1;c<C;c++){
				z=c<=C/2? --z: ++z;
				System.out.print(z);
			}
			System.out.println();}
		}

	public static void pattern18(int n) {
	
		}
	
	
	public static void pattern31(int n) {
		for(int i=1;i<=(2*n-1);i++) {
		for(int j=1;j<=(2*n-1);j++) {
		int p=n+1-Math.min(Math.min(i, j),Math.min(2*n-i,2*n-j));
		System.out.print(p+" ");
		}
		System.out.println();}}
}
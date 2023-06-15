package dsa04.arrays;

public class Pangram {

	public static void main(String[] args) {
		String pan="the quick brown fox jumps over the lazy dog ";
		System.out.println(pangram(pan));
	}
	public static boolean pangram(String pan) {
		char[] check = pan.toLowerCase().toCharArray();
		char c=97;int count;
		while(c<123) {
			count=0;
			for(int i=0;i<check.length;i++) {
				if(c==check[i]) {
					count++;
					break;}
			}if(count!=0) {
				c++;
			}else {break;}
		}
		if(c==123) {
			return true;
		}else {
			return false;}
	}

}

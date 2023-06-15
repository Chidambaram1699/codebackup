package dsa08.Strings;

public class ExlNumToNam {
	public static void main(String[] args) {
	int colno=1378;
//	while(colno<18279) {
		System.out.println(excelColName(colno)+" "+colno);	
	//	colno+=25;
		//System.out.println(excelColName(colno)+" "+colno);
	//	colno++; 
	//}
}
public static String excelColName(int n){
	char a; 
	if(n<27) {
		a=(char) (n-1+'A');
		return CtoS(a);
	}else if(n>26&&n<703) {
		int b=n%26;
		if(b==0) {b=26;n-=1;}
		n/=26;if(n>26)n=26;
		return CtoS((char)((n+'A'-1)))+CtoS((char)((b-1+'A')));			
	}else if(n>702&&n<18279){
		int c=n%26;
		if(c==0) {c=26;n-=1;}
		n/=26;
		int d=n%26;
		if(d==0) {d=26;n-=1;}
		n/=26;
		return CtoS((char)((n+'A'-1)))+CtoS((char)((d+'A'-1)))+CtoS((char)((c-1+'A')));			
	}else {
		return "Enter a valid column number below 18279";
	}
}
public static String CtoS(char ou) {
	return Character.toString(ou);
}
}

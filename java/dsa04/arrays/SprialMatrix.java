package dsa04.arrays;
import java.util.ArrayList;
import java.util.List;
public class SprialMatrix {
	public static void main(String[] args) {
		int[][] a1= {{1,2,3}
					,{4,5,6}
					,{7,8,9}};
		System.out.println(spiral(a1));
}
	public static List<Integer> spiral(int[][] arr){
		List<Integer> li=new ArrayList<Integer>();
		if(arr.length==0 ||arr[0].length==0) {return li;}
		int rmin=0,rmax=arr.length-1,cmin=0,cmax=arr[1].length-1;
		while(!((cmin>=cmax)&&((rmin>=rmax)))) {
			for(int i=cmin;i<=cmax;i++) {
				li.add(arr[rmin][i]);}
			rmin++;
			for(int i=rmin;i<=rmax;i++) {
				li.add(arr[i][cmax]);}
			cmax--;
			for(int i=cmax;i>=cmin;i--) {
				li.add(arr[rmax][i]);}
	//		if(rmin==rmax) {break;}
			rmax--;
			for(int i=rmax;i>=rmin;i--) {
				li.add(arr[i][cmin]);}
//			if(cmin==cmax) {break;}
			cmin++;
			for(int i=cmin;i<=cmax;i++) {
				li.add(arr[rmin][i]);
			}
		}
		return li;
}}
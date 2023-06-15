package dsa04.arrays;

public class ItemMatching {

	public static void main(String[] args) {
//		String[][] arr= {{"phone","blue","pixel"},{"computer","silver","lenovo"}
//		,{"phone","gold","iphone"}};
//		String ruleKey="color";
//		String ruleValue="silver";
		String[][] arr= {{"phone","blue","pixel"},{"computer","silver","phone"}
		,{"phone","gold","iphone"}};
		String ruleKey="type";
		String ruleValue="phone";
		System.out.println(itemcount(arr,ruleKey,ruleValue));
		
	}public static int itemcount(String[][] arr,String ruleKey,String ruleValue) {
		int count=0,col = 0;
		switch(ruleKey) {
		case "type":col=0;break;
		case "color":col=1;break;
		case "name":col=2;break;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i][col].equals(ruleValue)) {count++;}
		}
		
		
		return count;
	}

}

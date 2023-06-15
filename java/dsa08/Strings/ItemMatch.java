package dsa08.Strings;

public class ItemMatch {

	public static void main(String[] args) {
		String[][] items= {{"phone","blue","pixel"},
				{"computer","silver","lenovo"},
				{"phone","gold","iphone"}};
		String rulekey="color",rulevalue="silver";
		System.out.println(count(items,rulekey,rulevalue));
	}
	public static int count(String[][] arr,String key,String value) {
	int count=0,col = 0;
	switch(key) {
	case "type":col=0;break;
	case "color":col=1;break;
	case "name":col=2;break;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i][col].equals(value)) {
			count++;
		}
	}
	return count;
	}
}
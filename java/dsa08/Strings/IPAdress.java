package dsa08.Strings;

public class IPAdress {

	public static void main(String[] args) {
		String IP="1.1.1.1";
		System.out.println(ip(IP));
	}
	public static StringBuilder ip(String IP) {
		StringBuilder ip=new StringBuilder();
		int i=0;
		while(i<IP.length()) {
			char at = IP.charAt(i);
			if(at=='.') {
				ip.append("[.]");
			}else {ip.append(at);}
			i++;
		}
		return ip;
	}
}
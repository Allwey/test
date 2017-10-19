package Iphone;

public class IphoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone ip1 = new Iphone(10, 10, 10);
		Iphone ip2 = new Iphone(20, 10, 10);
		
		if(ip1.equals(ip2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}

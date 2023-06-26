package week1.day1;

public class Mobile {
	int a=10;
   public void makeCall() {
	   String mobileModel="samsung";
	 float mobileWeight=25.3f;  
	System.out.println("kindly call me");
	System.out.println(mobileModel);

}
  
   public void sendMsg() {
	   boolean isFullcharged=true;
	   int mobileCost=25000;
	System.out.println("kindly respond for our messages");

}

	public static void main(String[] args) {
		Mobile oneplus = new Mobile();
		oneplus.makeCall();
		oneplus.sendMsg();


	}

}

package org.mob;

public class Phone {
public void phoDet() {
	System.out.println("phone details are:");
	

}
  public void phoDet(int id) {
	System.out.println("phone id is:"+id);
	

}

  public void phoDet(String name) {
  System.out.println("phone name is :"+name);
  

}
  public void phoDet(String email,long number) {
	  System.out.println("string email id is :"+email);
	  System.out.println("string number is :"+number);
	  
	

}
   public void phoDet(long acc,String city) {
     System.out.println("string account no is: "+acc);
     System.out.println("string city is : "+city);

     
}
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoDet("OPPO");
	p.phoDet(27);
	p.phoDet("sanjay");
	p.phoDet(20088311754L, "chennai");
	p.phoDet("sanjay.gudapati27@gmail.com", 9494758827L);

}

}

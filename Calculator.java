package week1.day2.Assignments1;

public class Calculator {

 public void add(int num1,int num2,int num3)
	
	{
	
		int addition=num1+num2+num3;
		
		System.out.println(addition);
		
	}
 
 public void sub(int num1,int num2)
 
 {
	 
	 int sub= num1-num2;
	 System.out.println(sub);
	 
 }
 
 public void mul(double num1,double num2)
 
 {
	 
	 double mul= num1*num2;
	 System.out.println(mul);
	 
 }
 
 public void div(float num1,float num2)
 
 {
	 
	 float div= num1/num2;
	 System.out.println(div);
	 
 }
 
 

	
	

 public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		
						
		obj.add(44,5,6);
		obj.sub(66, 50);
		obj.mul(20, 30);
		obj.div(350, 70);
		
	
					

	}

	

}

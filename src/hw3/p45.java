package hw3;

public class p45 {

	public static void main(String[] args) 
	{
		System.out.println("�ŧiCar1");
		Car20 car1;
		car1 = new Car20();
		car1.setCar20(1234,20.5);
		
		System.out.println("�ŧiCar2");
		Car20 car2;
		
		System.out.println("�NCar1���w��Car2");
		car2 = car1 ;
		
		System.out.println("Car1��");
		car1.show();
		
		System.out.println("Car2��");
		car2.show();
		
		System.out.println("����Car1���������");
		car1.setCar20(2345,30.5);
		
		System.out.println("Car1��");
		car1.show();
		
		System.out.println("Car2��");
		car2.show();
	}
}
class Car20
{
	private int num;
	private double gas;
	
	public Car20()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar20(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q��" + gas);
	}
	
	public void show()
	{
		System.out.println("�����O " + this.num);
		System.out.println("�T�o�q�O " + this.gas);
	}
}
package hw3;

public class p45 {

	public static void main(String[] args) 
	{
		System.out.println("宣告Car1");
		Car20 car1;
		car1 = new Car20();
		car1.setCar20(1234,20.5);
		
		System.out.println("宣告Car2");
		Car20 car2;
		
		System.out.println("將Car1指定給Car2");
		car2 = car1 ;
		
		System.out.println("Car1的");
		car1.show();
		
		System.out.println("Car2的");
		car2.show();
		
		System.out.println("改變Car1的相關資料");
		car1.setCar20(2345,30.5);
		
		System.out.println("Car1的");
		car1.show();
		
		System.out.println("Car2的");
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
		System.out.println("生產了車子");
	}
	
	public void setCar20(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量為" + gas);
	}
	
	public void show()
	{
		System.out.println("車號是 " + this.num);
		System.out.println("汽油量是 " + this.gas);
	}
}
package hw3;

public class p47 {

	public static void main(String[] args) 
	{	
		Car21 car1;
		car1 = new Car21();
		car1.show();
		
		int num = 1234;
		double gas = 20.5;
		String str = "1號車";
		car1.setCar21(num,gas);
		car1.setName(str);
		
		car1.show();
	}
}
class Car21
{
	private int num;
	private double gas;
	private String name;
	public Car21()
	{
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}
	public void setCar21(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量為" + gas);
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名設為" + name);
	}
	public void show()
	{
		System.out.println("車號是 " + this.num);
		System.out.println("汽油量是 " + this.gas);
		System.out.println("車名是 " + this.name);
	}
}
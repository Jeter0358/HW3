package hw3;

public class p47 {

	public static void main(String[] args) 
	{	
		Car21 car1;
		car1 = new Car21();
		car1.show();
		
		int num = 1234;
		double gas = 20.5;
		String str = "1����";
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
		name = "�S���W��";
		System.out.println("�Ͳ��F���l");
	}
	public void setCar21(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q��" + gas);
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("�N���W�]��" + name);
	}
	public void show()
	{
		System.out.println("�����O " + this.num);
		System.out.println("�T�o�q�O " + this.gas);
		System.out.println("���W�O " + this.name);
	}
}
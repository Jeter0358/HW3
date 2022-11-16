package hw3;

public class p15 {

	public static void main(String[] args) 
	{
		Car7 car1;
		car1 = new Car7();
		
		int num = 1234;
		double gas = 20.5;
		
		car1.setNumGas(num,gas);
	}
}
class Car7
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設定為" + num + "汽油量設定為" + gas);
	}
	
	void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}


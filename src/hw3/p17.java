package hw3;

public class p17 {

	public static void main(String[] args) 
	{
		Car8 car1;
		car1 = new Car8();
		car1.setNumGas(1234,20.5);
		int num = car1.getNum();
		double gas = car1.getGas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O" + num + "�A�T�o�q�O" + gas);
	}
}
class Car8
{
	int num;
	double gas;
	int getNum()
	{
		System.out.println("�լd����");
		return num;
	}
	double getGas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]�w��" + num + "�A�T�o�q�]�w��" + gas);
	}
}

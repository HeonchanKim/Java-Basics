package day20;

public class Exam31 {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("�õ� ó�� �ʱ�ȭ:"+myCar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ:"+myCar.color);
		System.out.println("�����Ǽ� �ʱ�ȭ:"+myCar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ:"+myCar.speed);
		System.out.println("������ �۵� �ʱ�ȭ:"+myCar.wiperOn);
		
		myCar.power();
		System.out.println("�õ� �޼��� ����:"+myCar.powerOn);
		
		myCar.power();
		System.out.println("�õ� �޼��� �ٽ� ����:"+myCar.powerOn);
		
		myCar.color = "black";
		System.out.println("���� ���� ����:"+myCar.color);
	}
}

class Car{
	boolean powerOn; // �õ�
	String color; // ����
	int wheel; // ������
	int speed; // �ӷ�
	boolean wiperOn; // ��ġ��
	
	void power() {powerOn=!powerOn;} // true-> false, false -> true
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn=!wiperOn;} // true-> false, false -> true
	
	
}

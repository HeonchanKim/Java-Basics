package day04;

public class Equality_sign_operator {
	public static void main(String[] args) {
		double a = 3.14; //�Ǽ��� ������ a�� 3.14����
		double b = 5.15; //�Ǽ��� ����b�� 5.15 ����
		System.out.println(a==b); // a�� b�� ������?
		System.out.println(a!=b); // a�� b�� �ٸ���?
		
		String c1 = "Hello JAVA!"; //c1 ���ڿ� ������ "Hello JAVA!" �� ����
		System.out.println(c1 == "Hello JAVA!"); //true
		System.out.println(c1.equals("Hello JAVA!")); //true
		System.out.println(c1.equals("hello java!")); //false
	}
}
package day08;

public class SwitchEx {
	public static void main(String[] args) {
		// �ϳ� ���� ���� å ���� ���� ��Ʈ�� ���
		int book = 300;

		switch(book/10) {
			case 0: // 10�ǹ̸�
				System.out.println("���� �� ����ϼ���");
				break;
			case 1: // 10<=book<20
				System.out.println("å �д� ���� ���ô� ���̽ó׿�");
				break;
			case 2: // 20<=book<30
				System.out.println("å�� ����ϴ� ���̽ó׿�!");
				break;
			default: // 30<=book
				System.out.println("����� �ٵ��� �Դϴ�.");
		}
	}
}

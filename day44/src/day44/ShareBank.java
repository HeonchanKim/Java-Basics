package day44;

public class ShareBank {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Thread mom = new Thread(atm,"����");
		Thread son = new Thread(atm,"�Ƶ�");
		
		mom.start();
		son.start();
	}
}
class Atm implements Runnable {
	int money = 100000;
	@Override
	public void run() {
		for(int i = 0; i < 50;i++) {
			withdraw(1000);
			printinfo();
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {}
		}
	}
	synchronized void withdraw(int money) {
		Thread.yield();
		this.money-=money;
		System.out.println(Thread.currentThread().getName()+"��(��)"+money+"�� ���!");
	}
	void printinfo() {
		System.out.println("���� �ݾ�: "+this.money+"��");
	}
}
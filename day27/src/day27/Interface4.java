package day27;

public class Interface4 {
	public static void main(String[] args) {
		MyCellphone phone1 = new MyCellphone();
		Camera phone2 = new MyCellphone();
		Call phone3 = new MyCellphone();
		Memo phone4 = new MyCellphone();
		Clock phone5 = new MyCellphone();
		PhoneUser user1 = new PhoneUser();
		
		user1.call(phone1);
//		user1.call(phone2);
		user1.call(phone3);
//		user1.call(phone4);
		
	}
}
interface Camera{
	void photo();
}
interface Call{
	void calling();
}
interface Memo{
	void write();
}
interface Clock{
	void clock();
}
class MyCellphone implements Camera,Call,Memo,Clock{
	@Override
	public void clock() {
		System.out.println("clock()");
	}

	@Override
	public void write() {
		System.out.println("write()");		
	}

	@Override
	public void calling() {
		System.out.println("calling()");				
	}

	@Override
	public void photo() {
		System.out.println("photo()");						
	}
}

class PhoneUser{
	void call(Call c) {
		System.out.println("전화를 걸었습니다!");
	}
}



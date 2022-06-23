package chapter06.confirm;

import org.omg.CORBA.StructMember;

public class MeberExample {
	public static void main(String[] args) {
//		Member member = new Member();
//		member.name = "최하얀";
//		member.age = 23;

		
		Member member = new Member("최하얀", 23);
		Member member3 = new Member("abcd", "1234");
		
		Member member1 = new Member();
		member1.name = "홍길동";
		member1.age = 20;
		Member member2 = new Member();
		member2.name = "신용권";
		member2.age = 30;
	}
}

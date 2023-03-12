package constructor;

public class Person {
	String orderNumber;
	String id;
	String date;
	String name;
	String orderProductNumber;
	String address;

	public static void main(String[] args) {
		Person order1 = new Person();
		order1.orderNumber = "201803120001";
		order1.id = "abc123";
		order1.date = "2018년 3월 12일";
		order1.name = "홍길순";
		order1.orderProductNumber = "PD0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호:" + order1.orderNumber);
		System.out.println("주문자 아이디:" + order1.id);
		System.out.println("주문 날짜:" + order1.date);
		System.out.println("주문자 이름:" + order1.name);
		System.out.println("주문 상품 번호:" + order1.orderProductNumber);
		System.out.println("배송 주소:" + order1.address);
	}

}

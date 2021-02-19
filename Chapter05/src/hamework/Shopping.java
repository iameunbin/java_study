package hamework;

public class Shopping {
	long order_number;
	String order_id;
	String order_date;
	String order_name;
	String product_number;
	String address;
	
	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		
		shopping.order_number = 201803120001L;
		shopping.order_id = "abc123";
		shopping.order_date = "2018년 3월 12일";
		shopping.order_name = "홍길순";
		shopping.product_number = "PD0345-12";
		shopping.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + shopping.order_number);
		System.out.println("주문자 아이디 : " + shopping.order_id);
		System.out.println("주문 날짜 : " + shopping.order_date);
		System.out.println("주문자 이름 : " + shopping.order_name);
		System.out.println("주문 상품 번호 : " + shopping.product_number);
		System.out.println("배송 주소 : " + shopping.address);
	}
}

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
		shopping.order_date = "2018�� 3�� 12��";
		shopping.order_name = "ȫ���";
		shopping.product_number = "PD0345-12";
		shopping.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + shopping.order_number);
		System.out.println("�ֹ��� ���̵� : " + shopping.order_id);
		System.out.println("�ֹ� ��¥ : " + shopping.order_date);
		System.out.println("�ֹ��� �̸� : " + shopping.order_name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + shopping.product_number);
		System.out.println("��� �ּ� : " + shopping.address);
	}
}

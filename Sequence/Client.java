package Sequence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joseph js=new Joseph(99);
		js.enQueue(1);
		js.enQueue(2);
		js.enQueue(3);
		js.enQueue(4);
		js.enQueue(5);
		js.enQueue(6);
		js.enQueue(7);
		js.enQueue(8);
		
//		js.delete(0);
//		js.enQueue(3);
//		System.out.print(js.realLength());
//		System.out.print(js.peak());
		js.joseph(4);
		
	}

}

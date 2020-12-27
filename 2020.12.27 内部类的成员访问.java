package test;

public class Test {
	
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
	
}

class Outer {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);			//30
			System.out.println(this.num);		//20
			System.out.println(Outer.this.num);	//10
		}
	}
}

package test;

/*
静态代码块在加载时调用，父类先于子类加载
构造代码块先于构造方法
父类先于子类初始化
构造代码块给所有的对象初始化
构造方法给对应的对象初始化
*/

public class Test {
	
	public static void main(String[] args) {
		Zi z = new Zi();
	}
	
}

class Fu {
	public Fu() {
		System.out.println("Fu的构造方法");
	}
	
	{
		System.out.println("Fu的构造代码块");
	}
	
	static {
		System.out.println("Fu的静态代码块");
	}
}

class Zi extends Fu {
	public Zi() {
		System.out.println("Zi的构造方法");
	}
	
	{
		System.out.println("Zi的构造代码块");
	}
	
	static {
		System.out.println("Zi的静态代码块");
	}
}

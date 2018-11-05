package com.my.test;


class Animal {
	private String name;

	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Cat extends Animal {
	private String eyesColor;

	Cat(String n, String c) {
		super(n);
		eyesColor = c;
	}

	public String getEyesColor() {
		return eyesColor;
	}
}

class Gou extends Animal {
	private String furColor;

	Gou(String n, String c) {
		super(n);
		furColor = c;
	}

	public String getFurColor() {
		return furColor;
	}
}

public class CastingTest {
	public static void main(String args[]) {
		Animal a = new Animal("动物");

		Cat c = new Cat("猫", "black");
		
		Gou d = new Gou("狗", "yellow");
		
		System.out.println(a instanceof Animal);
		
		System.out.println(c instanceof Animal);
		
		System.out.println(d instanceof Animal);
		
		System.out.println(a instanceof Cat);
		
		// 向上转型
		Animal an = new Gou("旺财", "yellow");
		
		System.out.println(an.getName());

		System.out.println(((Gou) an).getFurColor());// error!狗自己的属性不能传给父类属性，所以需要向下转型
		
		System.out.println(an instanceof Animal); // true
		
		System.out.println(an instanceof Gou); // true
		
		// 向下转型,要加强制转换符
		// -- 为了安全起见，要加 instanceof 判断
		Gou d2 = (Gou) an;
		// Cat c2 = (Cat) an;
		System.out.println(d2.getFurColor());
	}
}
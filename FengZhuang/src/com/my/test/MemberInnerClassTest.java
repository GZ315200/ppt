package com.my.test;

class Outer {
	private int outer_i = 100;
	private int j = 123;

	public void test() {
		System.out.println("Outer:test()");
	}

	public void accessInner() {
		Inner inner = new Inner();// 外部类中使用内部类也需要创建出它的对象
		inner.display();
	}

	public class Inner {
		private int inner_i = 100;
		private int j = 789; // 与外部类某个属性同名

		public void display() { // 内部类中可直接访问外部类的属性
			System.out.println("Inner:outer_i=" + outer_i);
			test(); // 内部类中可直接访问外部类的方法
			// 内部类可以用this来访问自己的成员
			System.out.println("Inner:inner_i=" + this.inner_i);
			System.out.println(j); // 访问的是内部类的同名成员 //通过“外部类.this.成员名”来访问外部类的同名成员
			System.out.println(Outer.this.j);
		}
	}
}

public class MemberInnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
		outer.accessInner(); // 在外部类以外的地方创建内部类的对象
		
		Outer.Inner inner = outer.new Inner();
		
		inner.display();
	}
}
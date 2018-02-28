package com.yonyou.demo;

/**
 * @Description: TODO
 * @author liulei
 * @date 2018年2月25日 下午4:58:57
 */
public class FieldResolution {
	interface Interface0 {
		int A = 0;
	}

	interface Interface1 extends Interface0 {
		int A = 1;
	}

	interface Interface2 {
		int A = 2;
	}

	static class Parent implements Interface1 {
		public static int A = 3;

		Parent() {
			System.out.println("Parent");
		}
	}

	static class Sub extends Parent {

		static {
			A = 5;
		}
		public static int A = 4;

		Sub() {
			System.out.println(A);
		}
	}

	public static void main(String[] args) {
		Sub a = new Sub();
		System.out.println(a.A);
	}
}

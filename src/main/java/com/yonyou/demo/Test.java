package com.yonyou.demo;

import static java.lang.invoke.MethodHandles.lookup;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

/**
 * @Description: TODO
 * @author liulei
 * @date 2018年2月27日 下午3:52:21
 */
public class Test {

	class GrandFather {
		void thinking() {
			System.out.println("grandfather");
		}
	}

	class Father extends GrandFather {
		void thinking() {
			System.out.println("father");
		}
	}

	class Son extends Father {
		void thinking() {
			try {
				MethodType mt = MethodType.methodType(void.class);
				MethodHandle mh = lookup().findSpecial(GrandFather.class, "thinking", mt, getClass());
				mh.invoke(this);
			} catch (Throwable e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		(new Test().new Son()).thinking();
	}
}

package com.yonyou.demo;

/**
 * @Description: 内存溢出测试
 * @author liulei
 * @date 2018年2月24日 下午1:50:37
 */
public class MemoryTest {
	static class MemoryObject {
	}

	public static void main(String[] args) {
		{
			byte[] aa = new byte[64 * 1024 * 1024];
			aa = null;
		}

		System.gc();
	}
}

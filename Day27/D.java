package com.hybrid;

public class D implements B,C{

	@Override
	public void m1() {
		System.out.println("From M1");
	}

	@Override
	public void m2() {
		System.out.println("From M2");
	}

	@Override
	public void m3() {
		System.out.println("From M3");
	}

}

package com.practice.approac3;

public class Compute implements CustomListener {

	@Override
	public Double areaOfCircle(int r) {
		return Math.PI * r * r;
	}

	public static Double showResult(int r, CustomListener c) {
		return c.areaOfCircle(r);
	}
	

}

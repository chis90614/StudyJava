package com.java.main;
import com.java.time.Time;

public class TimeSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time(12,35,30);
		System.out.println(t);
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}
}

package com.balckdog;

public class EnumDriver {

	public static void main(String[] args) {
		TrafficSignal[] signals = TrafficSignal.values();
		
		for (TrafficSignal signal : signals) {
			System.out.println("name: " + signal.name() + " action: " + signal.getAction());
		}
	}

}

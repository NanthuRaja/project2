package org.water;

import org.air.Air;
import org.road.Road;
import org.transport.Transport;

public class Water {
	public void Ship() {
		System.out.println("Indian Navy");
	}
	public void Boat() {
		System.out.println("TamilNadu");

	}
	public static void main(String[] args) {
		Transport t=new Transport();
		t.TransportForm();
		Road r=new Road();
		r.Bike();
		r.Bus();
		Air a=new Air();
		a.Aeroplane();
		a.Helicopter();
		Water w=new Water();
		w.Boat();
		w.Ship();
	}

}

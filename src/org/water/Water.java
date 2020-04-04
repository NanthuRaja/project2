package org.water;

import org.air.Air;
import org.road.Road;
import org.transport.Transport;

public class Water {
	public void ship() {
		System.out.println("Indian Navy");
	}
	public void boat() {
		System.out.println("TamilNadu");

	}
	public static void main(String[] args) {
		Transport t=new Transport();
		t.transportForm();
		Road r=new Road();
		r.bike();
		r.car();
		Air a=new Air();
		a.aeroplane();
		a.helicopter();
		Water w=new Water();
		w.boat();
		w.ship();
	}

}

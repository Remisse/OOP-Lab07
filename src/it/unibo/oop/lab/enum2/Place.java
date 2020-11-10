package it.unibo.oop.lab.enum2;

public enum Place {
	INDOOR,
	OUTDOOR;
	
	public String toString() {
		return this == INDOOR ? "indoor" : "outdoor";
	}
}

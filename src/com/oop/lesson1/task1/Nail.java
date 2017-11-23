package lesson1.task1;
//
//  @ Project : Untitled
//  @ File Name : Nail.java
//  @ Date : 19.11.2017
//  @ Author : @Yanevskyy Igor
//
//


public abstract class Nail {
	private int length;

	public Nail(int length) {
		this.length = length;
	}

	public abstract void printHammer();

}

/**
 * This class describes how to work with brass nail.
 */
class BrassNail extends Nail implements Magnetable {
	public BrassNail(int length) {
		super(length);
	}

	@Override
	public void printHammer() {
		System.out.println(toString() + " был забит");
	}

	@Override
	public String toString() {
		return "Гвоздь медный";
	}
}

/**
 * This class describes how to work with plastic nail.
 */
class PlasticNail extends Nail {
	public PlasticNail(int length) {
		super(length);
	}

	@Override
	public void printHammer() {
		System.out.println(toString() + " не был забит");
	}

	@Override
	public String toString() {
		return "Гвоздь пластиковый";
	}
}

/**
 * This class describes how to work with steel nail.
 */
class StillNail extends Nail implements Magnetable {
	public StillNail(int length) {
		super(length);
	}

	@Override
	public void printHammer() {
		System.out.println(toString() + " был забит");
	}

	@Override
	public String toString() {
		return "Гвоздь стальной";
	}
}

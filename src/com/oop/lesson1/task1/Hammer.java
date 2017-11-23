package lesson1.task1;
//
//  @ Project : Untitled
//  @ File Name : Hammer.java
//  @ Date : 19.11.2017
//  @ Author : @Yanevskyy Igor
//
//


public class Hammer {
	private int weight;

	public Hammer(int weight) {
		this.weight = weight;
	}

	public void hammerNails(Nail nail){
		nail.printHammer();
	}
}

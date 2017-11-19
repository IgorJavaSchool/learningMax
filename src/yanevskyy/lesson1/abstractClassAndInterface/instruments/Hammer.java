package yanevskyy.lesson1.abstractClassAndInterface.instruments;
//
//  @ Project : Untitled
//  @ File Name : Hammer.java
//  @ Date : 19.11.2017
//  @ Author : @Yanevskyy Igor
//
//


import yanevskyy.lesson1.abstractClassAndInterface.nails.Nail;

public class Hammer extends Instrument implements Hammerable {
	public void hammerNails(Nail nail){
		int indexNail = nail.checkMaterial();
		nail.printHammer(indexNail);
	}
}

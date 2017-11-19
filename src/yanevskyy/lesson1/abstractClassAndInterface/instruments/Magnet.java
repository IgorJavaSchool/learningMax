package yanevskyy.lesson1.abstractClassAndInterface.instruments;
//
//  @ Project : Untitled
//  @ File Name : Magnet.java
//  @ Date : 19.11.2017
//  @ Author : @Yanevskyy Igor
//
//


import yanevskyy.lesson1.abstractClassAndInterface.nails.Nail;

public class Magnet extends Instrument implements Magnetable {
	public void magnetize(Nail[] nails){
		int indexNail;
		for (Nail nail: nails){
			indexNail = nail.checkMaterial();
			nail.printMagnet(indexNail);
		}
	}
}

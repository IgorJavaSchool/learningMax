package lesson1.task1;
//
//  @ Project : Untitled
//  @ File Name : Magnet.java
//  @ Date : 19.11.2017
//  @ Author : @Yanevskyy Igor
//
//


public class Magnet  {
	private int weight;

	public Magnet(int weight) {
		this.weight = weight;
	}

	public void magnetize(Nail[] nails){
		for (Nail nail: nails){
			if (nail instanceof Magnetable){
				System.out.println(nail.toString() + " притянулся к магниту");
			} else {
				System.out.println(nail.toString() + " не притянулся к магниту");
			}
		}
	}
}

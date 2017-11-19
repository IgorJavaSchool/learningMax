package yanevskyy.lesson1.abstractClassAndInterface.nails;
//
//  @ Project : Untitled
//  @ File Name : Nail.java
//  @ Date : 19.11.2017
//  @ Author : @Yanevskyy Igor
//
//


public abstract class Nail {
	public int lenght;


	public void printHammer(int indexNail) {
		switch (indexNail){
			case 1 : printConsole("Гвоздь стальной был забит");
				break;
			case 2 : printConsole("Гвоздь медный был забит");
				break;
			case 3 : printConsole("Гвоздь пластиковый не был забит");
				break;
			default: break;
		}
	}
	
	public void printMagnet(int indexNail) {
		switch (indexNail){
			case 1 : printConsole("Гвоздь стальной притянулся к магниту");
				break;
			case 2 : printConsole("Гвоздь медный не притянулся к магниту");
				break;
			case 3 : printConsole("Гвоздь пластиковый не притянулся к магниту");
				break;
			default: break;
		}
	}

	public int checkMaterial() {
		if (this instanceof StillNail){
			return 1;
		} else
		if (this instanceof BrassNail){
			return 2;
		}else
		if (this instanceof PlasticNail){
			return 3;
		} else return 0;
	}

	private void printConsole(String message){
		System.out.println(message);
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
}

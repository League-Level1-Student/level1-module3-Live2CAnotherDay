package _06_frogger;

import processing.core.PApplet;

public class Car extends PApplet{
	int carX = 400;
    int carY = 300;
    int size;
    int speed;
    
	public void display()
	{
		fill(0, 255, 0);
		rect(carX , carY,  size, 50);
	}

	public void goLeft() {
		// TODO Auto-generated method stub
		carX = carX - 100;
	}
}

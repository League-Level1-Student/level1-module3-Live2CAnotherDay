package _06_frogger;



public class Car {
	int x;
    int y;
    int size;
    int speed;
    
    Car (int x, int y, int size, int speed){
		this.size = size;
		this.x = x;
		this.speed = speed;
		this.y = y;
		
	}
	public void display()
	{
		Frogger.frog.fill(0, 0, 255);
		Frogger.frog.rect(x , y,  size, 50);
	}

	public void goLeft() {
		// TODO Auto-generated method stub
		x = x - speed;
		if (x < -10) {
			x = 810;
		
		}
		
	}
	public void goRight() {
		// TODO Auto-generated method stub
		x = x + speed;
		if (x < 810) {
			x = -10;
			
		}
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y; 
	}
	public int getSize() {
		return size;
	}
	
	
}

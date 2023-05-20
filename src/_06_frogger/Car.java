package _06_frogger;



public class Car {
	int x;
    int y;
    int size;
    int speed;
    
    Car (int size, int x, int y, int speed){
		this.size = size;
		this.x = x;
		
	}
	public void display()
	{
		Frogger.frog.fill(0, 0, 255);
		Frogger.frog.rect(x , y,  size, 50);
	}

	public void goLeft() {
		// TODO Auto-generated method stub
		if (x < -10) {
			x = x - 100;
		}
		
	}
	
	
}

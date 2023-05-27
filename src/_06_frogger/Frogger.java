package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    public static Frogger frog;
    int frogX = 400;
    int frogY = 600;
    int frogS = 25;
    Car car1 = new Car(790, 75, 10, 1);
	Car car2 = new Car(-50, 25, 25, 5);
	Car car3 = new Car(700, 125, 5, 7);
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	frog = this;
    	if (frog.intersects(car1)) {
    		
    	}
    
    }

    @Override
    public void draw() {
    	background(255,255,255);
    	fill(0, 255, 0);
    	ellipse(frogX, frogY, frogS, frogS);
    	
    	car1.goLeft();
    	car1.display();
    	
    	
    	car2.goRight();
    	car2.display();
    	
    	
    	car3.goLeft();
    	car3.display();
    	

    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    boolean intersects(Car car1) {
    	 if ((frogY > car1.getY()) && frogY < car1.getY() + 50 && frogX > car1.getX() && frogX < car1.getX()+car1.getSize()) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
    	 
   }
    public void keyPressed(){
        if(key == CODED){
            if(keyCode == UP && frogY >= 0)
            {
                frogY = frogY - 5;//Frog Y position goes up
            }
            else if(keyCode == DOWN && frogY <= 800)
            {
                frogY = frogY + 5;
            	//Frog Y position goes down 
            }
            else if(keyCode == RIGHT && frogX <=800 )
            {
            	frogX = frogX + 5;
                //Frog X position goes right
            }
            else if(keyCode == LEFT && frogX >=0)
            {
            	frogX = frogX - 5;
                //Frog X position goes left
            }
        }
    }
}

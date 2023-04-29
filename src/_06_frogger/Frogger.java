package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 300;
     
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	Car carro = new Car();
    	carro.size = 10;
    	carro.speed = 100;
    	carro.goLeft();
    }

    @Override
    public void draw() {
    	background(0,0,0);
    	fill(0, 255, 0);
    	ellipse(x, y, 25, 25);

    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    public void keyPressed(){
        if(key == CODED){
            if(keyCode == UP && y >= 0)
            {
                y = y - 5;//Frog Y position goes up
            }
            else if(keyCode == DOWN && y <= 800)
            {
                y = y + 5;
            	//Frog Y position goes down 
            }
            else if(keyCode == RIGHT && x <=800 )
            {
            	x = x + 5;
                //Frog X position goes right
            }
            else if(keyCode == LEFT && x >=0)
            {
            	x = x - 5;
                //Frog X position goes left
            }
        }
    }
}

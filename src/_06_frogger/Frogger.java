package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0,0,0);
    	fill(255, 0, 0);
    	ellipse(x, y, width, height);

    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}

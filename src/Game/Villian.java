package Game;

public class Villian extends Sprite {
	private int movex = (int) Math.random()*100;
	private int movey = (int) Math.random()*100;

    private final int INITIAL_X = 400;

    public Villian(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("res/Villian.png");
        getImageDimensions();
    }

    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }
        else if( movex > 50)
        {
        	x = 5;
        }
        else{
        	
        x -= 1;
        }
        }
}
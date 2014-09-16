package totheskies;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class AsteroidLeft {
	static public final int WIDTH = 80; 
	static public final int HEIGHT = 75;
	static public final int ASTEROID_SPACE = 10;
	private Image AsteroidLeft;
	private float x;
	private float y;
	private float vx;
	
	 public AsteroidLeft(float x, float y, float vx) throws SlickException {
		 this.x = x;
		 this.y = y;
		 this.vx = vx;
		 AsteroidLeft = new Image("res/AsteroidLeft.png");		 
	 }
	 
	 public void render() {
		 AsteroidLeft.draw(x - WIDTH/2, ToTheSkies.GAME_HEIGHT - (y + HEIGHT + ASTEROID_SPACE));
	 }

	 public void update() {
		 x += vx;
		 if (x == -80) {
			 x = 800;
		 }
	 }

}

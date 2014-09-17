package totheskies;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class SpaceshipAI implements Entity {
	private Image image;
	private int x;
	private int y;
	
	public SpaceshipAI(int x,int y) throws SlickException {
		image = new Image("res/SpaceshipAI.png");
		this.x = x;
		this.y = y;
	}

	public void update() {
		if (x < 80) {
			x = 80;
		}
		if (x > 640) {
			x = 640;
		}
	}

	@Override
	public void render() {
		image.draw(x,y);
		
	}

	@Override
	public void update(GameContainer container, int delta) {
		// TODO Auto-generated method stub
		
	}
}
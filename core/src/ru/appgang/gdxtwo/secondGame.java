package ru.appgang.gdxtwo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import ru.appgang.gdxtwo.view.GameScreen;

public class secondGame extends Game {

	private Screen gameScreen;
	@Override
	public void create() {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}
}

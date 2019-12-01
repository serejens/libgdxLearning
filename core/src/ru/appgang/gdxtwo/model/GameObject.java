package ru.appgang.gdxtwo.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public abstract class GameObject {
    Rectangle bounds;
    Sprite object;

    public GameObject(Texture texture, int x, int y, int width, int height){
        bounds = new Rectangle(x, y, width, height);
        object = new Sprite(texture);
    }

    public void draw(SpriteBatch batch){
        object.setBounds((float)bounds.getX(), (float)bounds.getY(), (float)bounds.getWidth(), (float)bounds.getHeight());
        object.draw(batch);
    }
}

package com.supertortaespacial.uadeo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class SuperTortaEspacial extends ApplicationAdapter {
	
	public ShapeRenderer renderer;
	
	@Override
	public void create () {
		renderer = new ShapeRenderer();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		renderer.rect(0, 0, 100, 100);
		renderer.setColor(Color.RED);
	}
	
	@Override
	public void dispose () {
		
	}
}

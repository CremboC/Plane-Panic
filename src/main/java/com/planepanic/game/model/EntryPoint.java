package com.planepanic.game.model;

import java.util.Random;

import com.planepanic.game.gfx.screens.Game;

/**
 * A class to represent Entry points.
 * 
 * @author Mantas
 */
public final class EntryPoint extends SimplePointOfInterest {

	public EntryPoint(Vector2d position) {
		super(position);
	}

	public Plane addPlane(Game game) {
		return Plane.randomPlane(game, new Random(), this.getPosition().clone());
	}

	@Override
	public void draw3d() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean onClick() {
		return false;
	}

	@Override
	protected boolean keyPress(int key) {
		// TODO Auto-generated method stub
		return false;
	}
}

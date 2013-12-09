package com.planepanic.game.model;

/**
 * A class to represent Entry points.
 * 
 * @author Mantas
 */
public final class ExitPoint extends PointOfInterest {

	public ExitPoint(Vector2d position) {
		super(position);
	}

	public void removePlane() {
		// TODO make it do something
	}

	@Override
	public void draw3d() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onClick() {
		return false;
	}
}
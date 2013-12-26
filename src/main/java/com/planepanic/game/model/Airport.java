package com.planepanic.game.model;

import java.util.ArrayList;
import java.util.List;

import com.planepanic.game.gfx.Image;
import com.planepanic.game.gfx.Resources;

/**
 * A class to represent Airport Entry points.
 * 
 * @author Mantas, Jonathan
 */
public final class Airport extends Image implements PointOfInterest {
	private List<Plane> planeList = new ArrayList<>();

	public Airport(Vector2d position) {
		super(Resources.AIRPORT, position);
		this.setPriority(-0.8f);
	}

	public void addPlane(Plane plane) {
		this.planeList.add(plane);
	}

	@Override
	public void draw2d() {
		super.draw2d();
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

package com.planepanic.game.model;

import lombok.Getter;
import lombok.Setter;

import com.planepanic.game.gfx.DrawUtil;

/**
 * A class to represent waypoints.
 * 
 * @author Jonathan, Mantas, Thomas
 */
public class Waypoint extends SimplePointOfInterest {
	@Getter private final String name;
	@Getter @Setter private static Waypoint via = null, target = null;
	@Getter @Setter private static boolean flyBy;

	public Waypoint(Vector2d position, String name) {
		super(position);
		this.name = name;
	}

	@Override
	public void draw2d() {
		super.draw2d();
		Vector2d size = DrawUtil.getSize(this.name, 12);
		DrawUtil.drawString((float) (this.getPosition().getX() - size.getX() / 2), (float) (this.getPosition().getY() - size.getY() / 2), this.name, 0xFFFFFF, 12, this.getPriority());
	}

	@Override
	public void draw3d() {
		// Empty.
	}

	@Override
	public boolean onClick() {
		if (Waypoint.via == null && Plane.getSelected() != null) {
			Waypoint.via = this;
			Waypoint.flyBy = false;
		}
		else if (Waypoint.via != this) {
			Waypoint.target = this;
		}
		return true;
	}

	/*
	 * For right click handling
	 */
	@Override
	public boolean onClickRight() {
		if (Waypoint.via == null && Plane.getSelected() != null) {
			Waypoint.via = this;
			Waypoint.flyBy = true;
		}
		else if (Waypoint.via != this) {

			Waypoint.target = this;
		}
		return true;
	}

	@Override
	protected boolean keyPress(int key) {
		return false;
	}
}

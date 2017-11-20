package testBench;

import jViridis.ColorMap;
import processing.core.PApplet;

public class Test extends PApplet {

	public void settings() {
		size(400, 200);
	}

	public void draw() {
		
		background(100);
		
		// Plasma
		ColorMap.getInstance(ColorMap.PLASMA).show(this, 50, 30);

		// Inferno
		ColorMap.getInstance(ColorMap.INFERNO).show(this, 50, 60);

		// Viridis
		ColorMap.getInstance(ColorMap.VIRIDIS).show(this, 50, 90);

		// Magma
		// Another way to set the colorMap
		ColorMap.getInstance().setColorMap(ColorMap.MAGMA).show(this, 50, 120);
	}

	public static void main(String[] args) {
		PApplet.main("testBench.Test");

	}

}

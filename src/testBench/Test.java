package testBench;

import jViridis.ColorMap;
import processing.core.PApplet;

public class Test extends PApplet {

	String[] colorPalettes;

	public void settings() {
		colorPalettes = ColorMap.getInstance().getColorPaletteNames();
		size(400, 40 * colorPalettes.length);
	}

	public void draw() {
		background(100);
		
		for (int i = 0; i < colorPalettes.length; i++) {
			if (!colorPalettes[i].startsWith(".")) {
				ColorMap.getInstance(colorPalettes[i]).show(this, 50, 30 + 30 * i);
			}
		}
	}

	public static void main(String[] args) {
		PApplet.main("testBench.Test");

	}

}

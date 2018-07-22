package testBench;

import java.io.File;
import java.util.ArrayList;

import jViridis.ColorMap;
import processing.core.PApplet;

public class Test extends PApplet {

	String[] colorPalettes;

	public void settings() {
		colorPalettes = getFiles();
		size(400, 100*colorPalettes.length);

	}

	public void draw() {

		background(100);
		int i=4;
		for (String palette : colorPalettes) {
			switch (palette) {
			case "plasma.cmap":
				// Plasma
				ColorMap.getInstance(ColorMap.PLASMA).show(this, 50, 30);
				break;
			case "inferno.cmap":
				// Plasma
				ColorMap.getInstance(ColorMap.INFERNO).show(this, 50, 60);
				break;
			case "viridis.cmap":
				// Plasma
				ColorMap.getInstance(ColorMap.VIRIDIS).show(this, 50, 90);
				break;
			case "magma.cmap":
				// Plasma
				ColorMap.getInstance(ColorMap.MAGMA).show(this, 50, 120);
				break;
			default:
				// Custom palette
				ColorMap.getInstance(palette).show(this, 50, 30 + 30*i);
				i++;

			}
			
		}

	}

	public String[] getFiles() {
		File folder = new File(System.getProperty("user.dir") + "/colorPalettes/");
		File[] listOfFiles = folder.listFiles();
		String[] fileNames = new String[listOfFiles.length];

		int i = 0;
		for (File file : listOfFiles) {
			if (file.isFile()) {
				fileNames[i] = file.getName();
				System.out.println(file.getName());
				i++;
			}
		}

		return fileNames;
	}

	public static void main(String[] args) {
		PApplet.main("testBench.Test");

	}

}

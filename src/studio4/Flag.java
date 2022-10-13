package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		

		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0.5, 0.5, 1, 1);
		
		StdDraw.setPenColor(255,234,0);
		StdDraw.filledEllipse(0.4, 0.4, 0.1, 0.3);
		StdDraw.filledEllipse(0.57, 0.4, 0.1, 0.3);
		
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledEllipse(0.4, 0.4, 0.05, 0.22);
		StdDraw.filledEllipse(0.57, 0.4, 0.05, 0.22);
		
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0, 0, 1, 0.4);
		
		
	}
}
package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String name = in.next();
		int redcomp = in.nextInt();
		int greencomp = in.nextInt();
		int bluecomp = in.nextInt();
		boolean isfilled = in.nextBoolean();
		
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		StdDraw.setPenColor(redcomp,greencomp,bluecomp);
		
		
		if (name.equals("triangle")) {
		double p5 = in.nextDouble();
		double p6 = in.nextDouble();
		double[] x = {p1,p3,p5};
		double[] y = {p2,p4,p6};
		StdDraw.polygon(x,y);
			if (isfilled==true) {
				StdDraw.filledPolygon(x,y);
			}
		}
	
		if (name.equals("rectangle")) {
		StdDraw.rectangle(p1,p2,p3,p4);
			if (isfilled==true) {
				StdDraw.filledRectangle(p1,p2,p3,p4);
			}
		}
		
		if (name.equals("ellipse")) {
		StdDraw.ellipse(p1, p2, p3, p4);
			if (isfilled==true) {
				StdDraw.filledEllipse(p1, p2, p3, p4);
			}
		}
		
	}
}

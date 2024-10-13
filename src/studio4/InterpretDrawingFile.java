package studio4;

import java.awt.Color;
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
		String shapeType = in.next();
		System.out.println(shapeType);
		
		int redComponent = in.nextInt();
		System.out.println(redComponent);
		int greenComponent = in.nextInt();
		System.out.println(greenComponent);
		int blueComponent = in.nextInt();
		System.out.println(blueComponent);
		Color shapeColor = new Color(redComponent, greenComponent, blueComponent); 
		StdDraw.setPenColor(shapeColor);
		//StdDraw.circle(0.5, 0.5 , 0.25);
		boolean isFilled = in.nextBoolean();
		
		if(isFilled == true) {
			System.out.println(isFilled);
		} 
		else {
			System.out.println(isFilled);
		}
		
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		StdDraw.filledEllipse(p1, p2, p3, p4);
				
		
		double shape3 = in.nextDouble();
		System.out.println(shape3);
	
		
		
		
		
	}
}

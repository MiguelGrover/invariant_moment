package Executable;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import calc.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedImage bwimage1 = null;
		BufferedImage bwimage2 = null;
        BufferedImage blackWhite1;
        BufferedImage blackWhite2;
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File image1 = chooser.getSelectedFile();
		chooser.showOpenDialog(null);
		File image2 = chooser.getSelectedFile();
		try {
			bwimage1 = ImageIO.read(image1);
			bwimage2 = ImageIO.read(image2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		blackWhite1 = new BufferedImage(bwimage1.getWidth(), bwimage1.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
		blackWhite2 = new BufferedImage(bwimage2.getWidth(), bwimage2.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
		Graphics2D g2d = blackWhite1.createGraphics();
        g2d.drawImage(bwimage1, 0, 0, null);
        g2d.dispose();
        Graphics2D g2d2 = blackWhite2.createGraphics();
        g2d2.drawImage(bwimage2, 0, 0, null);
        g2d2.dispose();
        int[][] x = convertTo2DUsingGetRGB(blackWhite1);
        int[][] y = convertTo2DUsingGetRGB(blackWhite2);
        Calcs c = new Calcs();
        double val1 = c.quintomomento(x, x);
        double val2 = c.quintomomento(x, y);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(Math.abs((val1-val2)/val1)*100+"%");
        
        
        
        
	}
	
	private static int[][] convertTo2DUsingGetRGB(BufferedImage image) {
	      int width = image.getWidth();
	      int height = image.getHeight();
	      int[][] result = new int[height][width];

	      for (int row = 0; row < height; row++) {
	         for (int col = 0; col < width; col++) {
	            result[row][col] = image.getRGB(col, row);
	         }
	      }

	      return result;
	   }
}

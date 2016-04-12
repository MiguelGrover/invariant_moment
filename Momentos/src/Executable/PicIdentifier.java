package Executable;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import Bean.Position;
import calc.Calcs;

public class PicIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedImage bwimage1 = null;
		
        BufferedImage blackWhite1;
        
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File image1 = chooser.getSelectedFile();
		
		try {
			bwimage1 = ImageIO.read(image1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		blackWhite1 = new BufferedImage(bwimage1.getWidth(), bwimage1.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
		
		Graphics2D g2d = blackWhite1.createGraphics();
        g2d.drawImage(bwimage1, 0, 0, null);
        g2d.dispose();
        int[][] placa = convertTo2DUsingGetRGB(blackWhite1);
        ArrayList<Position> positions = new ArrayList<Position>();
        int encontre = 0;
        Position letter = null;
        boolean block = false;
        for(int j = 0; j < placa[0].length; j++){
        
        	block = false;
        	if(encontre==2){
        		encontre=0;
        	}
        	for(int i = 0; i < placa.length; i++){
        		
        		if(placa[i][j]==-16777216 && encontre==0){
        			if(letter==null){
	        			encontre = 1;
	        			letter = new Position();
	        			letter.setInit(j);
	        			block = true;
        			}
        		}
        		else if(placa[i][j]==-16777216){
        			block = true;
        		}
        	}
        	
        	if(encontre==1 && !block){
        		if(letter!=null){
        			letter.setEnd(j);
        			positions.add(letter);
        			letter = null;
        			encontre = 2;
        		}
        	}
        }
        for (Position position : positions) {
			System.out.println("Inicio:"+position.getInit()+" Final:"+position.getEnd());
		}
        
        Calcs c = new Calcs();
        double val1 = c.firstmoment( placa);
        
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

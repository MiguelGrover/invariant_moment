package Executable;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import Bean.Position;
import calc.ArrayToChar;
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
        //blackWhite1 = filtrarBN(blackWhite1);
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
        ArrayList<int[][]> letters = getMatrixFromMatrix(positions, placa);
        //Si el momento no queda proximo a alguno es un guion o basura.
        
        StringBuilder text = new StringBuilder();
        for(int x = 0; x < letters.size(); x++){
        	double val1 = c.firstmoment(letters.get(x));
        	double val2 = c.secondmoment(letters.get(x));
        	double val3 = c.thirdmoment(letters.get(x));
        	double val4 = c.fourthmoment(letters.get(x));
        	double val5 = c.fifthmoment(letters.get(x));
        	double[] arreglo = {val1,val2,val3,val4,val5};
        	char letra = ArrayToChar.converter(arreglo);
        	System.out.println("Letra "+letra+":");
        	System.out.println(val1);
        	System.out.println(val2);
        	System.out.println(val3);
        	System.out.println(val4);
        	System.out.println(val5);
        	text.append(letra);
        }
        System.out.println(text.toString());
        
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
	private static ArrayList<int[][]> getMatrixFromMatrix(ArrayList<Position> positions, int[][] matrix){
		ArrayList<int[][]> array = new ArrayList<int[][]>();
		for(int letters = 0; letters < positions.size(); letters++){
			int width = positions.get(letters).getEnd()-positions.get(letters).getInit();
			int[][] letterMatrix = new int[matrix.length][width];
			for(int i = 0; i < letterMatrix.length; i++){
				for(int j = 0; j < letterMatrix[0].length; j++){
					letterMatrix[i][j] = matrix[i][j+positions.get(letters).getInit()];
				}
			}
			array.add(letterMatrix);
		}
		return array;
	}
	
	public static BufferedImage filtrarBN(BufferedImage imagen){
		int alto=imagen.getHeight(),ancho=imagen.getWidth();
		int nuevoalto=(int)(alto-(alto*0.25+(alto-alto*0.69)));
		BufferedImage x=new BufferedImage(ancho, nuevoalto, BufferedImage.TYPE_INT_RGB);
		for(int i=0;i<ancho;i++){
			for(int j=0;j<nuevoalto;j++){
				int color=imagen.getRGB(i, j+(int)(alto*0.25));
				/*int R,G,B;
				B=color&255;
				G=(color>>8)&255;
				R=(color>>16)&255;
				double[] hsb=RGBaHSB((short)R, (short)G, (short)B);*/
				/*if(hsb[2]<0.4||(hsb[2]>0.2&&hsb[2]<0.6&&hsb[1]<0.1)){
					x.setRGB(i, j, 0);
				}else{
					x.setRGB(i, j, 0xffffffff);
				}*/
				x.setRGB(i, j, color);
			}
		}
		return x;
	}
	
	public double[] RGBaHSB(short R,short G, short B){
		double[] HSB=new double[3];
		short M=(short)Math.max(R, Math.max(G, B)),m=(short)Math.min(R, Math.min(G, B)),C;
		C=(short)(M-m);
		if(C==0){
			HSB[0]=0;
		}else if(M==R){
			HSB[0]=60*(((G-B)/(C*1.0))%6);
		}else if(M==G){
			HSB[0]=60*(((B-R)/(C*1.0))+2);
		}else{
			HSB[0]=60*(((R-G)/(C*1.0))+4);
		}
		HSB[1]=(C==0)?0:(C*1.0)/M;
		HSB[2]=M/255.0;
		
		if(HSB[0]<0){
			HSB[0]=360+HSB[0];
		}
		return HSB;
	}
}

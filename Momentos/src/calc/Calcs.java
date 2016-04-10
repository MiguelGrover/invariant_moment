package calc;

public class Calcs {
	static int black = -16777216;
	public static double[] xym(int[][] matrix){
		long counter=0,x=0,y=0;
		double[] center = new double[3];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j]==black){
					counter++;
					x+=i;
					y+=j;
				}
			}
		}
		center[0] = x*1.0d/counter;
		center[1] = y*1.0d/counter;
		center[2] = counter;	
		return center;
	}
	
	public static double miu(double u, double v, int[][] matrix) {
		double result=0;
		double[] xm = xym(matrix);
		if(u == 0 && v == 0){
			return xm[2];
		}else{
			for(int i = 0; i < matrix.length; i++){
				for(int j = 0; j < matrix[i].length; j++){
					if(matrix[i][j]==black){
						result+=(Math.pow(i-xm[0], u)*Math.pow(j-xm[1], v));
					}
				}
			}
		}
		return result;
	}
	
	public static double vij(double i, double j, int[][] matrix){
		double k = 0;
		if(i+j >=2){
		k = ((i + j)/2d)+1d;
		}
		double result = (miu(i,j,matrix)/Math.pow(miu(0d,0d,matrix),k));
		return result;
	}
	
	public static double firstmoment(int[][] matrix){
		return vij(2d,0d,matrix) + vij(0d,2d,matrix);
	}
	public static double secondmoment(int[][] matrix){
		return (Math.pow((vij(2d,0d,matrix) - vij(0d,2d,matrix)),2d) + (4d * Math.pow(vij(1d,1d,matrix),2d)));
	}
	public static double thirdmoment(int[][] matrix){
		return (Math.pow((vij(3d,0d,matrix)-(3d*vij(1d,2d,matrix))), 2d)) + (Math.pow((3d * vij(2d,1d,matrix)-(vij(0d,3d,matrix))), 2d));
	}
	public static double fourthmoment(int[][] matrix){
		return (Math.pow((vij(3d,0d,matrix)+(vij(1d,2d,matrix))), 2d)) + (Math.pow((vij(2d,1d,matrix)+(vij(0d,3d,matrix))), 2d));
	}
	public static double fifthmoment(int[][] matrix){
		return (vij(3d,0d,matrix)-(3d * vij(1d,2d,matrix)))*(vij(3d,0d,matrix)+(vij(1d,2d,matrix)))* (Math.pow((vij(3d,0d,matrix)+vij(1d,2d,matrix)), 2d)-(3d*Math.pow((vij(2d,1d,matrix)+vij(0d,3d,matrix)), 2d))) +
				((3d * vij(2d,1d,matrix))-vij(0d,3d,matrix))*(vij(2d,1d,matrix)+(vij(0d,3d,matrix)))* ((3d*Math.pow((vij(3d,0d,matrix)+vij(1d,2d,matrix)), 2d))-(Math.pow((vij(2d,1d,matrix)+vij(0d,3d,matrix)), 2d)));
	}
}

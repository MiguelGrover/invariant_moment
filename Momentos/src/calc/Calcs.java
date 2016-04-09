package calc;

public class Calcs {
	
	public static double xym(int[][] x){
		double result = 0;
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				result += (double)x[i][j];
			}
		}
		result = result / (double)(x.length*x[0].length);		
		return result;
	}
	
	public static double miu(double u, double v, int[][] x, int[][] y) {
		double result = 0;
		double xm = xym(x);
		double ym = xym(y);
		if(u == 0 && v == 0){
			result = (double)(x.length *  x[0].length);
		}else{
			for(int i = 0; i < x.length; i++){
				for(int j = 0; j < x[i].length; j++){
					result += Math.pow(((double)x[i][j]-xm),u)*Math.pow(((double)y[i][j]-ym),v);
				}
			}
		}
		return result;
	}
	
	public static double vij(double i, double j, int[][] x, int[][] y){
		double k = 0;
		if(i+j >=2){
		k = ((i + j)/2d)+1d;
		}
		double result = (miu(i,j,x,y)/Math.pow(miu(0f,0f,x,y),k));
		return result;
	}
	
	public static double primermomento(int[][] x, int[][] y){
		return vij(2d,0d,x,y) + vij(0d,2d,x,y);
	}
	public static double segundomomento(int[][] x, int[][] y){
		return (Math.pow((vij(2d,0d,x,y) - vij(0d,2d,x,y)),2d) + (4d * Math.pow(vij(1d,1d,x,y),2d)));
	}
	public static double tercermomento(int[][] x, int[][] y){
		return (Math.pow((vij(3d,0d,x,y)-(3d*vij(1d,2d,x,y))), 2d)) + (Math.pow((3d * vij(2d,1d,x,y)-(vij(0d,3d,x,y))), 2d));
	}
	public static double cuartomomento(int[][] x, int[][] y){
		return (Math.pow((vij(3d,0d,x,y)+(vij(1d,2d,x,y))), 2d)) + (Math.pow((vij(2d,1d,x,y)+(vij(0d,3d,x,y))), 2d));
	}
	public static double quintomomento(int[][] x, int[][] y){
		return (vij(3d,0d,x,y)-(3d * vij(1d,2d,x,y)))*(vij(3d,0d,x,y)+(vij(1d,2d,x,y)))* (Math.pow((vij(3d,0d,x,y)+vij(1d,2d,x,y)), 2d)-(3d*Math.pow((vij(2d,1d,x,y)+vij(0d,3d,x,y)), 2d))) +
				((3d * vij(2d,1d,x,y))-vij(0d,3d,x,y))*(vij(2d,1d,x,y)+(vij(0d,3d,x,y)))* ((3d*Math.pow((vij(3d,0d,x,y)+vij(1d,2d,x,y)), 2d))-(Math.pow((vij(2d,1d,x,y)+vij(0d,3d,x,y)), 2d)));
	}
}

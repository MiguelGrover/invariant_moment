package calc;

public class ArrayToChar {
	
	static double[] A = {
			0.41623546217429924,
			0.01851408252760446,
			0.04084257889816488,
			2.898169870217948E-4,
			-9.966536883243197E-7
		};
	static double[] B = {
			0.4065984611786944,
			0.031708129338524085,
			6.60047957189578E-4,
			7.689791620590643E-6,
			2.7885667319940367E-10,
	};
	static double[] C = {
			0.7240524979379109,
			0.08846718519228726,
			0.02253085991912407,
			0.006717305545704065,
			-7.46994435811796E-5,
	};
	static double[] D = {
			0.5440012166162524,
			0.03768206983794763,
			0.004827878477936598,
			7.221778011757861E-5,
			-4.211292259656597E-8
	};
	static double[] E = {
			0.5212993126972415,
			0.08260007234330381,
			0.004110661812089292,
			0.0018477835278282626,
			-4.408367594392824E-6
	};
	static double[] F = {
			0.5020507993481914,
			0.09778505179354507,
			0.024821844801634983,
			0.004059277549061507,
			2.2160825438634658E-5
	};
	static double[] G = {
			0.5632261671099019,
			0.025959900610991588,
			0.0042610462612410055,
			8.730808271364962E-4,
			1.6728207542532362E-6
	};
	static double[] H = {
			0.4903492464457647,
			2.20919525943604E-4,
			8.342483581760418E-6,
			1.6237155837143537E-4,
			5.976027930752903E-9
	};
	static double[] I = {
			0.7999512670565302,
			0.6129241689750692,
			0.0,
			0.0,
			0.0
	};
	static double[] J = {
			0.735270552586285,
			0.34990546889820157,
			0.1250394779328141,
			0.03952899574546769,
			0.0023313407330612
	};
	static double[] K = {
			0.4579108143065981,
			0.02360198318101909,
			0.008174832250187334,
			0.002385676684019355,
			-6.150579378373596E-6
	};
	static double[] L = {
			0.7617356542381586,
			0.3645666645972666,
			0.2073793340098365,
			0.05079969890856275,
			0.0036723484520624515
	};
	static double[] M = {
			0.41696863484482144,
			3.312782381763434E-4,
			0.0013856997098019483,
			1.3862231430637384E-4,
			-2.79301514591614E-8
	};
	static double[] N = {
			0.4609430065001175,
			0.012779074420907453,
			0.0,
			0.0,
			0.0
	};
	static double[]	P = {
			0.43463387505913087,
			0.02910686763048664,
			0.026137025397925517,
			0.0026864210118513676,
			2.1658835628370388E-5
	};
	static double[] R = {
			0.42527867674583913,
			0.013230702291597321,
			0.0014059637597569577,
			0.0013865740447056932,
			-4.782785539029671E-7
	};
	static double[] S = {
			0.5214233904471819,
			0.06796021500669495,
			0.001168593504645494,
			4.78551832690061E-5,
			-4.007577012443476E-9
	};
	static double[] T = {
			0.6583898524640444,
			0.2054207992056985,
			0.23320143724458792,
			0.05544534768099077,
			0.006304683333549332
	};
	static double[] U = {
			0.6418920387180931,
			0.018640978516968807,
			0.010495694730880845,
			0.007214144559424786,
			-6.272977034005448E-5
	};
	static double[] V = {
			0.5739233026381525,
			0.04096710295161613,
			0.08197774378986447,
			0.00498788389713607,
			-1.0060374000682275E-4
	};
	static double[] W = {
			0.448736123778418,
			6.032477188045065E-4,
			0.005661613667564522,
			2.4805227106985066E-4,
			-2.7630350273493635E-7
	};
	static double[] X = {
			0.5069278177013583,
			0.053263218634827296,
			0.0026861653081050774,
			1.5821546300786577E-5,
			-1.9354528005583718E-9
	};
	static double[] Y = {
			0.6583898524640444,
			0.2054207992056985,
			0.23320143724458792,
			0.05544534768099077,
			0.006304683333549332,
	};
	static double[] Z = {
			0.6606592148462009,
			0.20331455220439654,
			0.0019060541890652367,
			1.2261396492630857E-4,
			2.8531285994204744E-9
	};
	static double[] num0 = {
			0.5810408876132691,
			0.09450742746610716,
			2.0919492882116086E-5,
			5.755654392806929E-6,
			5.554602328953846E-11
	};
	static double[] num1 = {
			0.6430363792581993,
			0.33423969273898413,
			0.05203615437908272,
			0.0285150058426719,
			0.0010912868512432475,
	};
	static double[] num2 = {
			0.6819805703248842,
			0.2306329254406539,
			0.004127649438658043,
			0.001167024956761862,
			1.5755015497350133E-6
	};
	static double[] num3 = {
			0.6335319743356157,
			0.1823634642987331,
			0.015268175336071985,
			0.003438656249313199,
			-2.4726055359268375E-5
	};
	static double[] num4 = {
			0.3976481080274064,
			0.052482447253678004,
			0.02093912883030695,
			0.0011888673621335772,
			5.448305977714258E-6
	};
	static double[] num5 = {
			0.5587363174359993,
			0.12127488712982745,
			0.0014857324452421468,
			1.780609392308015E-5,
			-1.809315014135872E-9
	};
	static double[] num6 = {
			0.4695026332516783,
			0.06645739883524011,
			0.0022292197571638977,
			3.4877990212810867E-4,
			-3.0155953571195307E-7
	};
	static double[] num7 = {
			0.7096738565166426,
			0.3077959655193126,
			0.17231779312813156,
			0.04977448314021163,
			0.004236638029706657
	};
	static double[] num8 = {
			0.4463066329242611,
			0.06669713917839996,
			2.6854543838313445E-4,
			8.695634930134662E-5,
			-1.0949714717608558E-8
	};
	static double[] num9 = {
			0.4654939343155316,
			0.06305774034866157,
			0.0025143873183258725,
			3.4921127112174646E-4,
			-2.904077147820076E-7
	};
	static double[] guion = {
			0.24434140514616387,
			0.03245546419359032,
			2.2439750748213626E-5,
			2.007245255143777E-6,
			-1.2928605918296192E-11
	};
	
	
	public static char converter(double momento, int nivel){
		char selected = ' ';
		double record = 100;
		
		if(Math.abs((momento-A[nivel])/momento) < record){
			selected = 'A';
			record = Math.abs((momento-A[nivel])/momento);
		}
		if(Math.abs((momento-B[nivel])/momento) < record){
			selected = 'B';
			record = Math.abs((momento-B[nivel])/momento);
		}
		if(Math.abs((momento-C[nivel])/momento) < record){
			selected = 'C';
			record = Math.abs((momento-C[nivel])/momento);
		}
		if(Math.abs((momento-D[nivel])/momento) < record){
			selected = 'D';
			record = Math.abs((momento-D[nivel])/momento);
		}
		if(Math.abs((momento-E[nivel])/momento) < record){
			selected = 'E';
			record = Math.abs((momento-E[nivel])/momento);
		}
		if(Math.abs((momento-F[nivel])/momento) < record){
			selected = 'F';
			record = Math.abs((momento-F[nivel])/momento);
		}
		if(Math.abs((momento-G[nivel])/momento) < record){
			selected = 'G';
			record = Math.abs((momento-G[nivel])/momento);
		}
		if(Math.abs((momento-H[nivel])/momento) < record){
			selected = 'H';
			record = Math.abs((momento-H[nivel])/momento);
		}
		if(Math.abs((momento-I[nivel])/momento) < record){
			selected = 'I';
			record = Math.abs((momento-I[nivel])/momento);
		}
		if(Math.abs((momento-J[nivel])/momento) < record){
			selected = 'J';
			record = Math.abs((momento-J[nivel])/momento);
		}
		if(Math.abs((momento-K[nivel])/momento) < record){
			selected = 'K';
			record = Math.abs((momento-K[nivel])/momento);
		}
		if(Math.abs((momento-L[nivel])/momento) < record){
			selected = 'L';
			record = Math.abs((momento-L[nivel])/momento);
		}
		if(Math.abs((momento-M[nivel])/momento) < record){
			selected = 'M';
			record = Math.abs((momento-M[nivel])/momento);
		}
		if(Math.abs((momento-N[nivel])/momento) < record){
			selected = 'N';
			record = Math.abs((momento-N[nivel])/momento);
		}
		if(Math.abs((momento-P[nivel])/momento) < record){
			selected = 'P';
			record = Math.abs((momento-P[nivel])/momento);
		}
		if(Math.abs((momento-R[nivel])/momento) < record){
			selected = 'R';
			record = Math.abs((momento-R[nivel])/momento);
		}
		if(Math.abs((momento-S[nivel])/momento) < record){
			selected = 'S';
			record = Math.abs((momento-S[nivel])/momento);
		}
		if(Math.abs((momento-T[nivel])/momento) < record){
			selected = 'T';
			record = Math.abs((momento-T[nivel])/momento);
		}
		if(Math.abs((momento-U[nivel])/momento) < record){
			selected = 'U';
			record = Math.abs((momento-U[nivel])/momento);
		}
		if(Math.abs((momento-V[nivel])/momento) < record){
			selected = 'V';
			record = Math.abs((momento-V[nivel])/momento);
		}
		if(Math.abs((momento-W[nivel])/momento) < record){
			selected = 'W';
			record = Math.abs((momento-W[nivel])/momento);
		}
		if(Math.abs((momento-X[nivel])/momento) < record){
			selected = 'X';
			record = Math.abs((momento-X[nivel])/momento);
		}
		if(Math.abs((momento-Y[nivel])/momento) < record){
			selected = 'Y';
			record = Math.abs((momento-Y[nivel])/momento);
		}
		if(Math.abs((momento-Z[nivel])/momento) < record){
			selected = 'Z';
			record = Math.abs((momento-Z[nivel])/momento);
		}
		if(Math.abs((momento-num0[nivel])/momento) < record){
			selected = '0';
			record = Math.abs((momento-num0[nivel])/momento);
		}
		if(Math.abs((momento-num1[nivel])/momento) < record){
			selected = '1';
			record = Math.abs((momento-num1[nivel])/momento);
		}
		if(Math.abs((momento-num2[nivel])/momento) < record){
			selected = '2';
			record = Math.abs((momento-num2[nivel])/momento);
		}
		if(Math.abs((momento-num3[nivel])/momento) < record){
			selected = '3';
			record = Math.abs((momento-num3[nivel])/momento);
		}
		if(Math.abs((momento-num4[nivel])/momento) < record){
			selected = '4';
			record = Math.abs((momento-num4[nivel])/momento);
		}
		if(Math.abs((momento-num5[nivel])/momento) < record){
			selected = '5';
			record = Math.abs((momento-num5[nivel])/momento);
		}
		if(Math.abs((momento-num6[nivel])/momento) < record){
			selected = '6';
			record = Math.abs((momento-num6[nivel])/momento);
		}
		if(Math.abs((momento-num7[nivel])/momento) < record){
			selected = '7';
			record = Math.abs((momento-num7[nivel])/momento);
		}
		if(Math.abs((momento-num8[nivel])/momento) < record){
			selected = '8';
			record = Math.abs((momento-num8[nivel])/momento);
		}
		if(Math.abs((momento-num9[nivel])/momento) < record){
			selected = '9';
			record = Math.abs((momento-num9[nivel])/momento);
		}
		if(Math.abs((momento-guion[nivel])/momento) < record){
			selected = '-';
			record = Math.abs((momento-guion[nivel])/momento);
		}
		return selected;
	}
}

package calc;

public class ArrayToChar {
	
	static double[] A = {
			0.27906421452755753,
			0.00131560687974715,
			0.013586454999670415,
			2.4249449793358683E-4,
			-4.400506870043733E-7
		};
	static double[] B = {
			0.26899036370692053,
			0.002528425849536954,
			1.825682456941691E-4,
			1.8693959176631999E-6,
			-3.319288572278156E-11
	};
	static double[] C = {
			0.166666625017165,
			2.1043728685492688E-23,
			2.0764084213558375E-27,
			2.069613572866912E-16,
			-9.44111208402916E-38
	};
	static double[] D = {
			0.33240550220115894,
			0.002554433270116175,
			0.0012096014093712917,
			1.782936966682906E-6,
			-1.987159820496934E-11
	};
	static double[] E = {
			0.32515049746728236,
			0.014380062935096312,
			5.926156326415118E-4,
			5.95507658411902E-4,
			-2.9119389531447877E-7
	};
	static double[] F = {
			0.32404575928091717,
			0.02703050022239037,
			0.007420107140224074,
			5.650280380279587E-4,
			-6.882927474040468E-7
	};
	static double[] G = {
			0.33209954446733037,
			0.0017039172302721493,
			6.56866172391729E-4,
			6.495798532997165E-5,
			1.3390733936218072E-8
	};
	static double[] H = {
			0.3244075794939031,
			3.937311463321295E-4,
			5.831636697843687E-7,
			7.166682907626949E-6,
			-7.350665970857455E-12
	};
	static double[] J = {
			0.4126238801509112,
			0.07910687644041708,
			0.023808451282201416,
			0.004205407944110617,
			1.0944356631068119E-5
	};
	static double[] K = {
			0.29867366956667407,
			0.0014617491585829155,
			0.0014423722538101616,
			5.566622676099419E-4,
			-8.54915459013239E-8
	};
	static double[] L = {
			0.4501584365346704,
			0.08833231824429008,
			0.048974169652636845,
			0.005319833137627881,
			-5.6055259302439605E-5
	};
	static double[] M = {
			0.25370195836268383,
			5.90704328963823E-4,
			9.013144016172273E-5,
			4.446013934622748E-6,
			-8.856650527583014E-11
	};
	static double[] N = {
			0.2773403659591728,
			6.522738627125944E-4,
			1.8554268052734584E-7,
			2.7509436073837476E-7,
			8.621758422203693E-15
	};
	static double[]	P = {
			0.2871700566839791,
			0.009231094115072273,
			0.007604836142878338,
			4.738422712257912E-4,
			6.711507526250361E-7
	};
	static double[] R = {
			0.2847724480224423,
			0.0011387849198340582,
			3.733229893405861E-4,
			2.648002486760735E-4,
			-1.0646710024273125E-8
	};
	static double[] S = {
			0.2989400672845011,
			0.010625155275824414,
			1.623839755701666E-4,
			7.929237055559318E-6,
			5.944573916836533E-11
	};
	static double[] T = {
			0.3977033048158435,
			0.053523728227473845,
			0.04478523353492788,
			0.004316648461423862,
			6.001881889549574E-5
	};
	static double[] U = {
			0.367945539274243,
			8.980675219721147E-4,
			0.002248243016546326,
			9.567100659279222E-4,
			-1.402983225977862E-6
	};
	static double[] V = {
			0.32759150482833965,
			0.004298478125542061,
			0.017458765036298785,
			0.0011282169453019355,
			-4.995325127323909E-6
	};
	static double[] W = {
			0.28674819800618556,
			0.005028775161282107,
			0.0012645092252832344,
			7.416080340654003E-5,
			-2.2104774553286864E-8
	};
	static double[] X = {
			0.3118900696749455,
			0.011150518581806025,
			4.345201056399558E-4,
			9.082621290643177E-6,
			-5.703967088638289E-10
	};
	static double[] Y = {
			0.35065975075223593,
			0.014211035178821505,
			0.04046737755905955,
			8.337672377835865E-5,
			1.520005716048663E-7
	};
	static double[] Z = {
			0.37907414081748625,
			0.03733282113437612,
			9.274006057623709E-4,
			4.239396508927227E-5,
			-8.344038488969582E-9
	};
	static double[] num0 = {
			0.2567102314705994,
			0.023613175220307883,
			9.810478508390375E-7,
			2.7920521984741288E-6,
			1.5429897505066093E-12
	};
	static double[] num1 = {
			0.39485988174431846,
			0.09574062840098939,
			0.0024034775273842636,
			0.0010532955631529554,
			1.26369125975867E-6
	};
	static double[] num2 = {
			0.36259898505688776,
			0.06937634097064445,
			6.286953018222827E-4,
			2.786260676163739E-4,
			1.163405267714109E-7
	};
	static double[] num3 = {
			0.3125422568824062,
			0.04424474341287979,
			4.246829454758761E-4,
			9.01880107110918E-5,
			-3.059252359026871E-9
	};
	static double[] num4 = {
			0.2746757343851694,
			0.03761978354483843,
			0.0016940180150366243,
			1.3797335039699717E-4,
			3.4604065399615025E-8
	};
	static double[] num5 = {
			0.30575904685235844,
			0.04221976801378318,
			1.839338943032491E-4,
			3.182994815752803E-5,
			5.551215451596265E-10
	};
	static double[] num6 = {
			0.2689363935822813,
			0.029802899963774138,
			9.797017655652766E-5,
			4.105857431159251E-5,
			2.0208093523645735E-9
	};
	static double[] num7 = {
			0.38440412180206696,
			0.08315847985535398,
			0.006183172858560574,
			0.0015922446353707261,
			2.7858636224308097E-6
	};
	static double[] num8 = {
			0.258315414908075,
			0.02708066899699131,
			2.5606507532204366E-5,
			1.033756500515697E-5,
			5.950649714531009E-11
	};
	static double[] num9 = {
			0.26985723876554085,
			0.02998901891847666,
			1.0698459267049942E-4,
			4.5864848206854024E-5,
			2.521327980532943E-9
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

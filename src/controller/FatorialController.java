package controller;

public class FatorialController {
	public int Calculafatorial(int n) {
		//condiçao de parada
		if(n<=1) {
			return n;
		}
		else {
			return n*Calculafatorial(n-1);
		}

	}
}

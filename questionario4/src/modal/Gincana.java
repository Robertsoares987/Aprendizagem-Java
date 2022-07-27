package modal;

public class Gincana {
	public Float qtdeTotalPontos;
	
	public Equipe equipe1;
	public Equipe equipe2;
	public Equipe equipe3;
	public Equipe equipe;
	
	public Gincana() {
		
	}

	public void ranking(float equipe1, float equipe2, float equipe3,
						float qtdeTotalPontos) {
		this.equipe1.pontos= equipe1;
		this.equipe2.pontos= equipe2;
		this.equipe3.pontos= equipe3;
		this.qtdeTotalPontos= qtdeTotalPontos;
	
		if (equipe1 > equipe2||equipe1 > equipe3) {
			System.out.println("Equipe 1 é a primeira colocada no ranking.");
		} else if(equipe3 < equipe1||equipe3 > equipe2) {
			System.out.println("Equipe 3 é a segunda colocada no ranking.");
		}else {
			System.out.println("Equipe 2 é a terceira colocada no ranking.");
		}
	}
}
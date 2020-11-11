package app;

import dominio.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa donald = new Pessoa();
		donald.id = 0;
		donald.mensalidade = 1000;
		donald.bolsista = true;
		System.out.println(donald);
		

		Pessoa hugo = new Pessoa();
		hugo.id = 1;
		hugo.nome = "Huguinho";
		hugo.mensalidade = 100;
		hugo.bolsista = false;
		System.out.println(hugo);
		
		Pessoa jose = new Pessoa("Zezinho");
		jose.id = 2;
		jose.mensalidade = 200;
		jose.bolsista = true;
		System.out.println(jose);
		
		Pessoa luis = new Pessoa("Luizinho", 300);
		luis.id = 3;
		luis.bolsista = false;
		System.out.println(luis);
		
	}
}
package dominio;

public class Pessoa {

	public int id;
	public float mensalidade;
	public boolean bolsista;
	public String nome;
	
	public Pessoa() {
		this.nome = "Donald";
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}


	public Pessoa(String nome, float mensalidade) {
		this(nome);
		this.mensalidade = mensalidade; 
	}

	public Pessoa(int id, String nome, float mensalidade, boolean bolsista) {
		this(nome, mensalidade);
		this.id = id;		
		this.bolsista = bolsista;		
	}
	
	float descontoBolsa() {
		return this.bolsista ? this.mensalidade /2 : this.mensalidade;
	}
		
	@Override
	public String toString() {
		
		float valorPagar = descontoBolsa();
		
		return String.format("Nome: %-10s | Mensalidade: %8.2f | %10s | Valor final: %6.2f | id: %d ", 
				this.nome,
				this.mensalidade,
				this.bolsista ? "Bolsista" : "Pagante",
				valorPagar,
				this.id);
	}
}
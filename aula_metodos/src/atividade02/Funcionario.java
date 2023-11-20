package atividade02;

public class Funcionario {
	
	private String nome; 
	private String sexo; 
	private int idade; 
	private String cargo; 
	private double altura;
	
	
	// Método Construtor
	public Funcionario (String nome, String sexo, int idade, String cargo, double altura) {
			this.nome = nome; 
			this.sexo = sexo; 
			this.idade = idade; 
			this.cargo = cargo; 
			this.altura = altura;
		}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
public void visualizar() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("Cargo: " + cargo);
		System.out.println("Altura: " + altura);
	}
}

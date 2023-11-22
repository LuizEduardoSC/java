package atividade01;

public class PessoaFisica extends Cliente{
		
		private String cpf;
		private String rg;

		public PessoaFisica (int numero, int agencia, int tipo, String titular, float saldo, String cpf, String rg) {
			super(numero, agencia, tipo, titular, saldo);
			this.cpf = cpf;
			this.rg = rg;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}
		
		@Override
	    public void visualizar() {
			super.visualizar();
			System.out.println("CPF: " + this.cpf);
			System.out.println("RG: " + this.rg);
			}
}
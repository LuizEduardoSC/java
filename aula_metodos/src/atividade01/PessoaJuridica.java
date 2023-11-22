package atividade01;

public class PessoaJuridica extends Cliente{
		
		private String cnpj;
		private String nomeFantasia;

		public PessoaJuridica (int numero, int agencia, int tipo, String titular, float saldo, String cnpj, String nomeFantasia) {
			super(numero, agencia, tipo, titular, saldo);
			this.cnpj = cnpj;
			this.nomeFantasia = nomeFantasia;
		}

		public String getcnpj() {
			return cnpj;
		}

		public void setcnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getnomeFantasia() {
			return nomeFantasia;
		}

		public void setnomeFantasia(String nomeFantasia) {
			this.nomeFantasia = nomeFantasia;
		}
		
		@Override
	    public void visualizar() {
			super.visualizar();
			System.out.println("CNPJ: " + this.cnpj);
			System.out.println("Nome Fantasia: " + this.nomeFantasia);
			}
}

package Model.entity;

	public class Empresa {
		private String nomeEmpresa;
		private Integer cnpjEmpresa;

		public Empresa(String nome, Integer cnpj) {
			setNomeEmpresa(nome);
			setCnpjEmpresa(cnpj);
		}

		public String getNomeEmpresa() {
			return nomeEmpresa;
		}

		public void setNomeEmpresa(String nomeEmpresa) {
			this.nomeEmpresa = nomeEmpresa;
		}

		public Integer getCnpjEmpresa() {
			return cnpjEmpresa;
		}

		public void setCnpjEmpresa(Integer cnpjEmpresa) {
			this.cnpjEmpresa = cnpjEmpresa;
		}
   }
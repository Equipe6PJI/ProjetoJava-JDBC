package Controller;
import Model.DAO.EmpresaDAO;
import Model.entity.Empresa;
import Util.Conexao;
import View.TelasApp;

public class CompareAqui {
	public static void main(String[] args) {

//		TelasApp tela = new TelasApp();
//		tela.boasVindas();
//		
//		Empresa clicli = tela.entradaDadosTELA();
//		System.out.println(clicli.getnomeEmpresa());
//		System.out.println(clicli.getcnpjEmpresa());
		
		Conexao connection = new Conexao();
		connection.getConexao();
		
		EmpresaDAO empresa = new EmpresaDAO();
		empresa.lerEmpresaAll();
	}
}

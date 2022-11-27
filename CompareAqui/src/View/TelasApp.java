package View;

import javax.swing.JOptionPane;
import Model.entity.Empresa;

//import model.entity;

public class TelasApp {

		public void boasVindas() {
			JOptionPane.showMessageDialog(null, "Bem vindo");
		}
		
		public Empresa entradaDadosTELA() {
			String nomeEmpresa = (JOptionPane.showInputDialog(null, "Informe o nome da empresa"));
			Integer cnpjEmpresa = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe seu CNPJ")));
			Empresa cl = new Empresa(nomeEmpresa, cnpjEmpresa);
			return cl;
		}
	}


package Model.DAO;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;
	 
	import Util.Conexao;

	public class EmpresaDAO {
	public boolean lerEmpresaAll() {
	    Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    String query = null;
	    conn = Conexao.getConexao();
	    query = "SELECT * FROM Empresa";
	    try {
	        ps = conn.prepareStatement(query);
	        rs = ps.executeQuery();
	        while (rs.next()) {
	            System.out.println("\nEmpresa: "+rs.getString("nome"));
	            System.out.println("CNPJ: "+rs.getString("cnpj"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Conexao.fecharConexao(conn, ps, rs);
	    }
	    return true;

      }

	}
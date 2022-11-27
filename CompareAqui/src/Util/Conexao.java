package Util;

import java.sql.Connection;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 
public class Conexao {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String servidor = "localhost:3306";
    private static final String banco = "CompareAqui";
    private static final String timezone = "?useTimezone=true&serverTimezone=UTC";
    private static final String url = "jdbc:mysql://" + servidor + "/" + banco + timezone;
    private static final String usuario = "root";
    private static final String senha = "Julielaisbella.04";

    public static Connection getConexao() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = (Connection) DriverManager.getConnection(url, usuario, senha);
            System.out.println("OK conectou");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,  "Erro conexao", "Erro",
                    JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException("ATENÇÃO: Erro de Conexão: ", e);
        }
    }

    public static void fecharConexao(Connection c) {
        if (c != null) {
            try {
                c.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão.", "Erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void fecharConexao(Connection c, PreparedStatement ps) {
        fecharConexao(c);
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão.", "Erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void fecharConexao(Connection c, PreparedStatement ps, ResultSet rs) {
        fecharConexao(c, ps);
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão.", "Erro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}


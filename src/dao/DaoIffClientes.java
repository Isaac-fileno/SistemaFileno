/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_clientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffClientes {

    public void insert(Object object) {
       iff_clientes iff_clientes = (iff_clientes)object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_clientes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_clientes.getIff_idCliente());
            pst.setString(2, iff_clientes.getIff_nome());
            pst.setString(3, iff_clientes.getIff_apelido());
            pst.setString(4, iff_clientes.getIff_email());
            pst.setString(5, iff_clientes.getIff_senha());
            pst.setString(6, iff_clientes.getIff_cpf());
            pst.setString(7, iff_clientes.getIff_rg());
            pst.setDate(8, null); //iff_dataNascimento
            pst.setDate(9, null); //iff_dataCadastro
            pst.setString(10, iff_clientes.getIff_sexo());
            pst.setString(11, iff_clientes.getIff_cep());
            pst.setString(12, iff_clientes.getIff_endereco());
            pst.setString(13, iff_clientes.getIff_numero());
            pst.setString(14, iff_clientes.getIff_bairro());
            pst.setString(15, iff_clientes.getIff_cidade());
            pst.setString(16, iff_clientes.getIff_telefone());
            pst.setString(17, iff_clientes.getIff_celular());
            pst.setString(18, iff_clientes.getIff_ativo());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) throws ClassNotFoundException {
        iff_clientes iff_clientes = (iff_clientes) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_clientes where iff_idclientes=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_clientes.getIff_idCliente());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(DaoIffClientes.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
    
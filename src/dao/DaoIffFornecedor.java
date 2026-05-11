/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_fornecedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffFornecedor {

    public void insert(Object object) {
       iff_fornecedor iff_fornecedor = (iff_fornecedor)object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_clientes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_fornecedor.getIff_idfornecedor());
            pst.setString(2, iff_fornecedor.getIff_nomeEmpresa());
            pst.setString(3, iff_fornecedor.getIff_email());
            pst.setString(4, iff_fornecedor.getIff_telefone());
            pst.setString(5, iff_fornecedor.getIff_endereco());
            pst.setString(6, iff_fornecedor.getIff_cidade());
            pst.setString(7, iff_fornecedor.getIff_estado());
            pst.setString(8, iff_fornecedor.getIff_cep());
            pst.setString(9, iff_fornecedor.getIff_pais());
            pst.setString(10, iff_fornecedor.getIff_cnpj());
            pst.setString(11, iff_fornecedor.getIff_representante());
            pst.setString(12, iff_fornecedor.getIff_nomeFantasia());
            pst.setDate(13, null); //iff_dataCadastro
            pst.setString(14, iff_fornecedor.getIff_nivel());
            pst.setString(15, iff_fornecedor.getIff_icms());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) throws ClassNotFoundException {
        iff_fornecedor iff_fornecedor = (iff_fornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_fornecedor where iff_idfornecedor=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_fornecedor.getIff_idfornecedor());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(DaoIffFornecedor.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
    
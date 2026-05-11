/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_compras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffCompras{

    public void insert(Object object) {
       iff_compras iff_compras= (iff_compras)object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_compras values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_compras.getIff_idCompra());
            pst.setInt(2, iff_compras.getIff_idCliente());
            pst.setDate(3,null);//dataCompra
            pst.setDouble(4, iff_compras.getIff_valorTotal());
            pst.setString(5, iff_compras.getIff_confirmado());
            pst.setString(6, iff_compras.getIff_metodoPagamento());
            pst.setInt(7, iff_compras.getIff_idfornecedor());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) throws ClassNotFoundException {
        iff_compras iff_compras = (iff_compras) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_compras where iff_idCompra=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_compras.getIff_idCompra());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(DaoIffCompras.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_vendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffVendas{

    public void insert(Object object) {
       iff_vendas iff_vendas= (iff_vendas)object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_vendas values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_vendas.getIff_idVendas());
            pst.setDate(2,null);//dataVenda
            pst.setDouble(3, iff_vendas.getIff_valorVenda());
            pst.setString(4, iff_vendas.getIff_metodoPagamento());
            pst.setString(5, iff_vendas.getIff_conmfirmado());
            pst.setDouble(6, iff_vendas.getIff_idCliente());
            pst.setDouble(7, iff_vendas.getIff_idusuario());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) throws ClassNotFoundException {
        iff_vendas iff_vendas = (iff_vendas) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_vendas where iff_idVendas=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_vendas.getIff_idVendas());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(DaoIffVendas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
    
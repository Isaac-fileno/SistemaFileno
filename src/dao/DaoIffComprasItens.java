/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_compras_itens;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffComprasItens{

    public void insert(Object object) {
       iff_compras_itens iff_compras_itens = (iff_compras_itens)object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_compras values (?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_compras_itens.getIff_idCompraItem());
            pst.setInt(2, iff_compras_itens.getIff_idCompra());
            pst.setDouble(3, iff_compras_itens.getIff_valorUnitario());
            pst.setInt(4, iff_compras_itens.getIff_idJogo());
            pst.setInt(5, iff_compras_itens.getIff_quantidade());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) throws ClassNotFoundException {
        iff_compras_itens iff_compras_itens = (iff_compras_itens) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_compras_itens where iff_idCompraItem=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_compras_itens.getIff_idCompraItem());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(DaoIffCompras.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
    
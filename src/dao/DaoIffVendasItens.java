/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_vendas_itens;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffVendasItens{

    public void insert(Object object) {
       iff_vendas_itens iff_vendas_itens= (iff_vendas_itens)object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_vendas values (?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_vendas_itens.getIff_idVendasItens());
            pst.setInt(2, iff_vendas_itens.getIff_idVendas());
            pst.setDouble(3, iff_vendas_itens.getIff_valorUnitario());
            pst.setInt(4, iff_vendas_itens.getIff_idJogo());
            pst.setInt(5, iff_vendas_itens.getIff_quantidade());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) throws ClassNotFoundException {
        iff_vendas_itens iff_vendas_itens = (iff_vendas_itens) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_vendas_itens where iff_idVendasItens=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_vendas_itens.getIff_idVendasItens());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(DaoIffVendasItens.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
    
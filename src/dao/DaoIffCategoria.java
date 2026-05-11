/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffCategoria{

    public void insert(Object object) {
       iff_categoria iff_categoria= (iff_categoria)object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_categoria values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_categoria.getIff_idCategoria());
            pst.setString(2, iff_categoria.getIff_nome());
            pst.setString(3, iff_categoria.getIff_tipo());
            pst.setString(4, iff_categoria.getIff_status());
            pst.setString(5, iff_categoria.getIff_descricao());
            pst.setDate(6,null);//dataCadastro
            pst.setString(7, iff_categoria.getIff_criador());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) throws ClassNotFoundException {
        iff_categoria iff_categoria = (iff_categoria) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_categoria where iff_idCategoria=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_categoria.getIff_idCategoria());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(DaoIffVendas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
    
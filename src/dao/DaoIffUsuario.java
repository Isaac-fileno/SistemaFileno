/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffUsuario {

    public void insert(Object object) {
        iff_usuario iff_usuario = (iff_usuario) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_usuario values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_usuario.getIff_idusuarios());
            pst.setString(2, iff_usuario.getIff_nome());
            pst.setString(3, iff_usuario.getIff_apelido());
            pst.setString(4, iff_usuario.getIff_cpf());
            pst.setDate(5, null); //iff_dataNascimento
            pst.setString(7, iff_usuario.getIff_senha());
            pst.setString(8, iff_usuario.getIff_ativo());
            pst.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) {
        iff_usuario iff_usuario = (iff_usuario) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_usuario where iff_idusuario=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_usuario.getIff_idusuarios());
            pst.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            System.getLogger(DaoIffUsuario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }}
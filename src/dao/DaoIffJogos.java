/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.iff_jogos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author zfabi
 */
public class DaoIffJogos {

    public void insert(Object object) {
       iff_jogos iff_jogos = (iff_jogos)object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into iff_jogos values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_jogos.getIff_idJogo());
            pst.setString(2, iff_jogos.getIff_titulo());
            pst.setDouble(3, iff_jogos.getIff_preco());
            pst.setDate(4, null); //iff_dataLancamento
            pst.setString(5, iff_jogos.getIff_classificacaoIndicativa());
            pst.setString(6, iff_jogos.getIff_desenvolvedor());
            pst.setString(7, iff_jogos.getIff_editora());
            pst.setDouble(8, iff_jogos.getIff_tamanhoMB());
            pst.setString(9, iff_jogos.getIff_idiomas());
            pst.setString(10, iff_jogos.getIff_plataforma());
            pst.setString(11, iff_jogos.getIff_genero());
            pst.setString(12, iff_jogos.getIff_disponivel());
            pst.setString(13, iff_jogos.getIff_emailContato());
            pst.setString(14, iff_jogos.getIff_descricao());
            pst.setString(15, iff_jogos.getIff_avaliacao());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void update(Object object) throws ClassNotFoundException {
        iff_jogos iff_jogos = (iff_jogos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_isaac_fileno";
            user = "isaac_fileno";
            password = "isaac_fileno";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete fom iff_jogos where iff_idJogo=?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, iff_jogos.getIff_idJogo());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(DaoIffJogos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
    
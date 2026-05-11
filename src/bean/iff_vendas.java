/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;
/**
 *
 * @author zfabi
 */
public class iff_vendas {
    private int iff_idVendas;
    private Date iff_dataVenda;
    private double iff_valorVenda;
    private String iff_metodoPagamento;
    private String iff_conmfirmado;
    private int iff_idusuario;
    private int iff_idCliente;

    public int getIff_idVendas() {
        return iff_idVendas;
    }

    public void setIff_idVendas(int iff_idVendas) {
        this.iff_idVendas = iff_idVendas;
    }

    public Date getIff_dataVenda() {
        return iff_dataVenda;
    }

    public void setIff_dataVenda(Date iff_dataVenda) {
        this.iff_dataVenda = iff_dataVenda;
    }

    public double getIff_valorVenda() {
        return iff_valorVenda;
    }

    public void setIff_valorVenda(double iff_valorVenda) {
        this.iff_valorVenda = iff_valorVenda;
    }

    public String getIff_metodoPagamento() {
        return iff_metodoPagamento;
    }

    public void setIff_metodoPagamento(String iff_metodoPagamento) {
        this.iff_metodoPagamento = iff_metodoPagamento;
    }

    public String getIff_conmfirmado() {
        return iff_conmfirmado;
    }

    public void setIff_conmfirmado(String iff_conmfirmado) {
        this.iff_conmfirmado = iff_conmfirmado;
    }

    public int getIff_idusuario() {
        return iff_idusuario;
    }

    public void setIff_idusuario(int iff_idusuario) {
        this.iff_idusuario = iff_idusuario;
    }

    public int getIff_idCliente() {
        return iff_idCliente;
    }

    public void setIff_idCliente(int iff_idCliente) {
        this.iff_idCliente = iff_idCliente;
    }
}

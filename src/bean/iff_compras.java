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
public class iff_compras {
    private int iff_idCompra;
    private int iff_idCliente;
    private Date iff_dataCompra;
    private double iff_valorTotal;
    private String iff_confirmado;
    private String iff_metodoPagamento;
    private int iff_idfornecedor;

    public int getIff_idCompra() {
        return iff_idCompra;
    }

    public void setIff_idCompra(int iff_idCompra) {
        this.iff_idCompra = iff_idCompra;
    }

    public int getIff_idCliente() {
        return iff_idCliente;
    }

    public void setIff_idCliente(int iff_idCliente) {
        this.iff_idCliente = iff_idCliente;
    }

    public Date getIff_dataCompra() {
        return iff_dataCompra;
    }

    public void setIff_dataCompra(Date iff_dataCompra) {
        this.iff_dataCompra = iff_dataCompra;
    }

    public double getIff_valorTotal() {
        return iff_valorTotal;
    }

    public void setIff_valorTotal(double iff_valorTotal) {
        this.iff_valorTotal = iff_valorTotal;
    }

    public String getIff_confirmado() {
        return iff_confirmado;
    }

    public void setIff_confirmado(String iff_confirmado) {
        this.iff_confirmado = iff_confirmado;
    }

    public String getIff_metodoPagamento() {
        return iff_metodoPagamento;
    }

    public void setIff_metodoPagamento(String iff_metodoPagamento) {
        this.iff_metodoPagamento = iff_metodoPagamento;
    }

    public int getIff_idfornecedor() {
        return iff_idfornecedor;
    }

    public void setIff_idfornecedor(int iff_idfornecedor) {
        this.iff_idfornecedor = iff_idfornecedor;
    }
}

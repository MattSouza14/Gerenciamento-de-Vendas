package org.example.models;

import java.time.LocalDate;

public class Order {
    private String nomeCliente;
    private String telefoneCliente;
    private String nomeProduto;
    private Double valorProduto;
    private Boolean temDesconto;
    private Double quantidadeDesconto = 0.0;
    private Boolean temParcelamento;
    private Integer quantidadeParcelas = 1;
    private Boolean pago = false;
    private LocalDate dataPedido;
    private LocalDate dataPagamento;

    public Order(String nomeProduto, Double valorProduto, Boolean pago, String nomeCliente, String telefoneCliente) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.pago = pago;
        this.telefoneCliente = telefoneCliente;
        this.nomeCliente = nomeCliente;
    }


     //Construtor com desconto e parcelamento.
    public Order(String nomeProduto, Double valorProduto, Double quantidadeDesconto,
                 Integer quantidadeParcelas, Boolean pago, String nomeCliente, String telefoneCliente) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeDesconto = quantidadeDesconto;
        this.quantidadeParcelas = quantidadeParcelas;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.pago = pago;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public Double getQuantidadeDesconto() {
        return quantidadeDesconto;
    }

    public void setQuantidadeDesconto(Double quantidadeDesconto) {
        this.quantidadeDesconto = quantidadeDesconto;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Boolean getTemDesconto() {
        return temDesconto;
    }

    public void setTemDesconto(Boolean temDesconto) {
        this.temDesconto = temDesconto;
    }

    public Boolean getTemParcelamento() {
        return temParcelamento;
    }

    public void setTemParcelamento(Boolean temParcelamento) {
        this.temParcelamento = temParcelamento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", valorProduto=" + valorProduto +
                ", pago=" + pago +
                ", Nome do Cliente=" + nomeCliente +
                ", Telefone p/ Contato=" + telefoneCliente +
                ", quantidadeDesconto=" + quantidadeDesconto +
                ", quantidadeParcelas=" + quantidadeParcelas +
                '}';
    }



}

package br.uniceub.fsw.model;
// Generated 28/06/2017 20:26:30 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TaServicoPrestado generated by hbm2java
 */
public class TaServicoPrestado  implements java.io.Serializable {


     private Integer idtServicoPrestado;
     private TbServico tbServico;
     private TbUsuario tbUsuario;
     private Date horaServicoPrestado;
     private Byte favoritoServicoPrestado;
     private Integer cepServicoPrestado;
     private String enderecoServicoPrestado;
     private String complementoServicoPrestado;
     private String numero;
     private String msgRecomendacao;
     private Date dtHrRecomendacao;
     private Double notaRecomendacao;

    public TaServicoPrestado() {
    }

	
    public TaServicoPrestado(TbServico tbServico, TbUsuario tbUsuario) {
        this.tbServico = tbServico;
        this.tbUsuario = tbUsuario;
    }
    public TaServicoPrestado(TbServico tbServico, TbUsuario tbUsuario, Date horaServicoPrestado, Byte favoritoServicoPrestado, Integer cepServicoPrestado, String enderecoServicoPrestado, String complementoServicoPrestado, String numero, String msgRecomendacao, Date dtHrRecomendacao, Double notaRecomendacao) {
       this.tbServico = tbServico;
       this.tbUsuario = tbUsuario;
       this.horaServicoPrestado = horaServicoPrestado;
       this.favoritoServicoPrestado = favoritoServicoPrestado;
       this.cepServicoPrestado = cepServicoPrestado;
       this.enderecoServicoPrestado = enderecoServicoPrestado;
       this.complementoServicoPrestado = complementoServicoPrestado;
       this.numero = numero;
       this.msgRecomendacao = msgRecomendacao;
       this.dtHrRecomendacao = dtHrRecomendacao;
       this.notaRecomendacao = notaRecomendacao;
    }
   
    public Integer getIdtServicoPrestado() {
        return this.idtServicoPrestado;
    }
    
    public void setIdtServicoPrestado(Integer idtServicoPrestado) {
        this.idtServicoPrestado = idtServicoPrestado;
    }
    public TbServico getTbServico() {
        return this.tbServico;
    }
    
    public void setTbServico(TbServico tbServico) {
        this.tbServico = tbServico;
    }
    public TbUsuario getTbUsuario() {
        return this.tbUsuario;
    }
    
    public void setTbUsuario(TbUsuario tbUsuario) {
        this.tbUsuario = tbUsuario;
    }
    public Date getHoraServicoPrestado() {
        return this.horaServicoPrestado;
    }
    
    public void setHoraServicoPrestado(Date horaServicoPrestado) {
        this.horaServicoPrestado = horaServicoPrestado;
    }
    public Byte getFavoritoServicoPrestado() {
        return this.favoritoServicoPrestado;
    }
    
    public void setFavoritoServicoPrestado(Byte favoritoServicoPrestado) {
        this.favoritoServicoPrestado = favoritoServicoPrestado;
    }
    public Integer getCepServicoPrestado() {
        return this.cepServicoPrestado;
    }
    
    public void setCepServicoPrestado(Integer cepServicoPrestado) {
        this.cepServicoPrestado = cepServicoPrestado;
    }
    public String getEnderecoServicoPrestado() {
        return this.enderecoServicoPrestado;
    }
    
    public void setEnderecoServicoPrestado(String enderecoServicoPrestado) {
        this.enderecoServicoPrestado = enderecoServicoPrestado;
    }
    public String getComplementoServicoPrestado() {
        return this.complementoServicoPrestado;
    }
    
    public void setComplementoServicoPrestado(String complementoServicoPrestado) {
        this.complementoServicoPrestado = complementoServicoPrestado;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getMsgRecomendacao() {
        return this.msgRecomendacao;
    }
    
    public void setMsgRecomendacao(String msgRecomendacao) {
        this.msgRecomendacao = msgRecomendacao;
    }
    public Date getDtHrRecomendacao() {
        return this.dtHrRecomendacao;
    }
    
    public void setDtHrRecomendacao(Date dtHrRecomendacao) {
        this.dtHrRecomendacao = dtHrRecomendacao;
    }
    public Double getNotaRecomendacao() {
        return this.notaRecomendacao;
    }
    
    public void setNotaRecomendacao(Double notaRecomendacao) {
        this.notaRecomendacao = notaRecomendacao;
    }




}



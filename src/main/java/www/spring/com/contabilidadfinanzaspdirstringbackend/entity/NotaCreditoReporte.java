package www.spring.com.contabilidadfinanzaspdirstringbackend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "nota_credito_reporte")
public class NotaCreditoReporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custNum;

    @Column(name = "cust_name")
    private String custName;

    private String folio;

    @Column(name = "fecha_folio")
    private String fechaFolio;

    private String descripcion;

    @Column(name = "net_amount")
    private BigDecimal netAmount;

    @Column(name = "tax1_amt")
    private BigDecimal tax1Amt;

    private BigDecimal total;

    @Column(name = "autoriza_auditoria")
    private String autorizaAuditoria;

    @Column(name = "autoriza_direccion")
    private String autorizaDireccion;

    @Column(name = "usuario_registro")
    private String usuarioRegistro;

    @Column(name = "usuario_au")
    private String usuarioAu;

    @Column(name = "observacion_au")
    private String observacionAu;

    @Column(name = "usuario_di")
    private String usuarioDi;

    @Column(name = "observacion_di")
    private String observacionDi;

    private String estado;

    @Column(name = "invoice_nota")
    private String invoiceNota;

    @Column(name = "fecha_imprime")
    private String fechaImprime;

    private String origen;
    private String incidencia;

    // Getters y setters

    public Long getCustNum() { return custNum; }
    public void setCustNum(Long custNum) { this.custNum = custNum; }

    public String getCustName() { return custName; }
    public void setCustName(String custName) { this.custName = custName; }

    public String getFolio() { return folio; }
    public void setFolio(String folio) { this.folio = folio; }

    public String getFechaFolio() { return fechaFolio; }
    public void setFechaFolio(String fechaFolio) { this.fechaFolio = fechaFolio; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public BigDecimal getNetAmount() { return netAmount; }
    public void setNetAmount(BigDecimal netAmount) { this.netAmount = netAmount; }

    public BigDecimal getTax1Amt() { return tax1Amt; }
    public void setTax1Amt(BigDecimal tax1Amt) { this.tax1Amt = tax1Amt; }

    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }

    public String getAutorizaAuditoria() { return autorizaAuditoria; }
    public void setAutorizaAuditoria(String autorizaAuditoria) { this.autorizaAuditoria = autorizaAuditoria; }

    public String getAutorizaDireccion() { return autorizaDireccion; }
    public void setAutorizaDireccion(String autorizaDireccion) { this.autorizaDireccion = autorizaDireccion; }

    public String getUsuarioRegistro() { return usuarioRegistro; }
    public void setUsuarioRegistro(String usuarioRegistro) { this.usuarioRegistro = usuarioRegistro; }

    public String getUsuarioAu() { return usuarioAu; }
    public void setUsuarioAu(String usuarioAu) { this.usuarioAu = usuarioAu; }

    public String getObservacionAu() { return observacionAu; }
    public void setObservacionAu(String observacionAu) { this.observacionAu = observacionAu; }

    public String getUsuarioDi() { return usuarioDi; }
    public void setUsuarioDi(String usuarioDi) { this.usuarioDi = usuarioDi; }

    public String getObservacionDi() { return observacionDi; }
    public void setObservacionDi(String observacionDi) { this.observacionDi = observacionDi; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getInvoiceNota() { return invoiceNota; }
    public void setInvoiceNota(String invoiceNota) { this.invoiceNota = invoiceNota; }

    public String getFechaImprime() { return fechaImprime; }
    public void setFechaImprime(String fechaImprime) { this.fechaImprime = fechaImprime; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getIncidencia() { return incidencia; }
    public void setIncidencia(String incidencia) { this.incidencia = incidencia; }
}

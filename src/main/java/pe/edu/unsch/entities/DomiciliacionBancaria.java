package pe.edu.unsch.entities;
// Generated 4 Nov 2020, 21:14:55 by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DomiciliacionBancaria generated by hbm2java
 */
@Entity
@Table(name = "domiciliacion_bancaria", catalog = "marketplacebd_test")
public class DomiciliacionBancaria implements java.io.Serializable {

	private int iddomiciliacionbancaria;
	private Pago pago;
	private String direccionEmpresa;
	private Date fechaCaducidad;
	private String firmaCliente;
	private String numeroCuenta;
	private String referenciaSolicitud;

	public DomiciliacionBancaria() {
	}

	public DomiciliacionBancaria(int iddomiciliacionbancaria, Pago pago) {
		this.iddomiciliacionbancaria = iddomiciliacionbancaria;
		this.pago = pago;
	}

	public DomiciliacionBancaria(int iddomiciliacionbancaria, Pago pago, String direccionEmpresa, Date fechaCaducidad,
			String firmaCliente, String numeroCuenta, String referenciaSolicitud) {
		this.iddomiciliacionbancaria = iddomiciliacionbancaria;
		this.pago = pago;
		this.direccionEmpresa = direccionEmpresa;
		this.fechaCaducidad = fechaCaducidad;
		this.firmaCliente = firmaCliente;
		this.numeroCuenta = numeroCuenta;
		this.referenciaSolicitud = referenciaSolicitud;
	}

	@Id

	@Column(name = "iddomiciliacionbancaria", unique = true, nullable = false)
	public int getIddomiciliacionbancaria() {
		return this.iddomiciliacionbancaria;
	}

	public void setIddomiciliacionbancaria(int iddomiciliacionbancaria) {
		this.iddomiciliacionbancaria = iddomiciliacionbancaria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpago", nullable = false)
	public Pago getPago() {
		return this.pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	@Column(name = "direccion_empresa", length = 12)
	public String getDireccionEmpresa() {
		return this.direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_caducidad", length = 19)
	public Date getFechaCaducidad() {
		return this.fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Column(name = "firma_cliente", length = 45)
	public String getFirmaCliente() {
		return this.firmaCliente;
	}

	public void setFirmaCliente(String firmaCliente) {
		this.firmaCliente = firmaCliente;
	}

	@Column(name = "numero_cuenta", length = 45)
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	@Column(name = "referencia_solicitud", length = 45)
	public String getReferenciaSolicitud() {
		return this.referenciaSolicitud;
	}

	public void setReferenciaSolicitud(String referenciaSolicitud) {
		this.referenciaSolicitud = referenciaSolicitud;
	}

}

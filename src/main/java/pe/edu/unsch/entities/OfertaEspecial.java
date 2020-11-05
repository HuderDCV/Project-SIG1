package pe.edu.unsch.entities;
// Generated 4 Nov 2020, 21:14:55 by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OfertaEspecial generated by hbm2java
 */
@Entity
@Table(name = "oferta_especial", catalog = "marketplacebd_test")
public class OfertaEspecial implements java.io.Serializable {

	private int idofertaespecial;
	private CompradorFrecuente compradorFrecuente;
	private Producto producto;
	private float precioDescuento;
	private Date fechaInicio;
	private Date fechaLimite;
	private String descripcionOferta;
	private Set<Producto> productos = new HashSet<Producto>(0);

	public OfertaEspecial() {
	}

	public OfertaEspecial(int idofertaespecial, CompradorFrecuente compradorFrecuente, Producto producto,
			float precioDescuento) {
		this.idofertaespecial = idofertaespecial;
		this.compradorFrecuente = compradorFrecuente;
		this.producto = producto;
		this.precioDescuento = precioDescuento;
	}

	public OfertaEspecial(int idofertaespecial, CompradorFrecuente compradorFrecuente, Producto producto,
			float precioDescuento, Date fechaInicio, Date fechaLimite, String descripcionOferta,
			Set<Producto> productos) {
		this.idofertaespecial = idofertaespecial;
		this.compradorFrecuente = compradorFrecuente;
		this.producto = producto;
		this.precioDescuento = precioDescuento;
		this.fechaInicio = fechaInicio;
		this.fechaLimite = fechaLimite;
		this.descripcionOferta = descripcionOferta;
		this.productos = productos;
	}

	@Id

	@Column(name = "idofertaespecial", unique = true, nullable = false)
	public int getIdofertaespecial() {
		return this.idofertaespecial;
	}

	public void setIdofertaespecial(int idofertaespecial) {
		this.idofertaespecial = idofertaespecial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcompradorfrecuente", nullable = false)
	public CompradorFrecuente getCompradorFrecuente() {
		return this.compradorFrecuente;
	}

	public void setCompradorFrecuente(CompradorFrecuente compradorFrecuente) {
		this.compradorFrecuente = compradorFrecuente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "precio_descuento", nullable = false, precision = 12, scale = 0)
	public float getPrecioDescuento() {
		return this.precioDescuento;
	}

	public void setPrecioDescuento(float precioDescuento) {
		this.precioDescuento = precioDescuento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_inicio", length = 19)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_limite", length = 19)
	public Date getFechaLimite() {
		return this.fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	@Column(name = "descripcion_oferta", length = 65535)
	public String getDescripcionOferta() {
		return this.descripcionOferta;
	}

	public void setDescripcionOferta(String descripcionOferta) {
		this.descripcionOferta = descripcionOferta;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "oferta_especial_has_producto", catalog = "marketplacebd_test", joinColumns = {
			@JoinColumn(name = "oferta_especial_idoferta_especial", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "producto_idproducto", nullable = false, updatable = false) })
	public Set<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

}

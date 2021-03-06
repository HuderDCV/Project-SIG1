package pe.edu.unsch.entities;
// Generated 19-nov-2020 18:08:16 by Hibernate Tools 5.1.10.Final

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
 * ProductoDeseado generated by hbm2java
 */
@Entity
@Table(name = "producto_deseado", catalog = "marketplacebd_test")
public class ProductoDeseado implements java.io.Serializable {

	private int idproductodeseado;
	private Producto producto;
	private Usuario usuario;
	private Date fechaDeseo;
	private Boolean estado;

	public ProductoDeseado() {
	}

	public ProductoDeseado(int idproductodeseado, Producto producto, Usuario usuario) {
		this.idproductodeseado = idproductodeseado;
		this.producto = producto;
		this.usuario = usuario;
	}

	public ProductoDeseado(int idproductodeseado, Producto producto, Usuario usuario, Date fechaDeseo, Boolean estado) {
		this.idproductodeseado = idproductodeseado;
		this.producto = producto;
		this.usuario = usuario;
		this.fechaDeseo = fechaDeseo;
		this.estado = estado;
	}

	@Id

	@Column(name = "idproductodeseado", unique = true, nullable = false)
	public int getIdproductodeseado() {
		return this.idproductodeseado;
	}

	public void setIdproductodeseado(int idproductodeseado) {
		this.idproductodeseado = idproductodeseado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idusuario", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_deseo", length = 19)
	public Date getFechaDeseo() {
		return this.fechaDeseo;
	}

	public void setFechaDeseo(Date fechaDeseo) {
		this.fechaDeseo = fechaDeseo;
	}

	@Column(name = "estado")
	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}

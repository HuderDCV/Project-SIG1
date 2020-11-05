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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LibroReclamacion generated by hbm2java
 */
@Entity
@Table(name = "libro_reclamacion", catalog = "marketplacebd_test")
public class LibroReclamacion implements java.io.Serializable {

	private int idlibroreclamaciones;
	private Persona persona;
	private Date fechaReclamo;
	private long idproducto;
	private Set<Producto> productos = new HashSet<Producto>(0);

	public LibroReclamacion() {
	}

	public LibroReclamacion(int idlibroreclamaciones, Persona persona, Date fechaReclamo, long idproducto) {
		this.idlibroreclamaciones = idlibroreclamaciones;
		this.persona = persona;
		this.fechaReclamo = fechaReclamo;
		this.idproducto = idproducto;
	}

	public LibroReclamacion(int idlibroreclamaciones, Persona persona, Date fechaReclamo, long idproducto,
			Set<Producto> productos) {
		this.idlibroreclamaciones = idlibroreclamaciones;
		this.persona = persona;
		this.fechaReclamo = fechaReclamo;
		this.idproducto = idproducto;
		this.productos = productos;
	}

	@Id

	@Column(name = "idlibroreclamaciones", unique = true, nullable = false)
	public int getIdlibroreclamaciones() {
		return this.idlibroreclamaciones;
	}

	public void setIdlibroreclamaciones(int idlibroreclamaciones) {
		this.idlibroreclamaciones = idlibroreclamaciones;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpersona", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_reclamo", nullable = false, length = 19)
	public Date getFechaReclamo() {
		return this.fechaReclamo;
	}

	public void setFechaReclamo(Date fechaReclamo) {
		this.fechaReclamo = fechaReclamo;
	}

	@Column(name = "idproducto", nullable = false)
	public long getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "libroReclamacion")
	public Set<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

}

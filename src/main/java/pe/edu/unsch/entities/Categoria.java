package pe.edu.unsch.entities;
// Generated 4 Nov 2020, 21:14:55 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Categoria generated by hbm2java
 */
@Entity
@Table(name = "categoria", catalog = "marketplacebd_test", uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
public class Categoria implements java.io.Serializable {

	private int idcategoria;
	private String nombre;
	private String desrcipcion;
	private Set<CategoriaSubcategoria> categoriaSubcategoriasForIdsubcategoria = new HashSet<CategoriaSubcategoria>(0);
	private Set<CategoriaProducto> categoriaProductos = new HashSet<CategoriaProducto>(0);
	private Set<CategoriaSubcategoria> categoriaSubcategoriasForIdcategoria = new HashSet<CategoriaSubcategoria>(0);

	public Categoria() {
	}

	public Categoria(int idcategoria, String nombre) {
		this.idcategoria = idcategoria;
		this.nombre = nombre;
	}

	public Categoria(int idcategoria, String nombre, String desrcipcion,
			Set<CategoriaSubcategoria> categoriaSubcategoriasForIdsubcategoria,
			Set<CategoriaProducto> categoriaProductos,
			Set<CategoriaSubcategoria> categoriaSubcategoriasForIdcategoria) {
		this.idcategoria = idcategoria;
		this.nombre = nombre;
		this.desrcipcion = desrcipcion;
		this.categoriaSubcategoriasForIdsubcategoria = categoriaSubcategoriasForIdsubcategoria;
		this.categoriaProductos = categoriaProductos;
		this.categoriaSubcategoriasForIdcategoria = categoriaSubcategoriasForIdcategoria;
	}

	@Id

	@Column(name = "idcategoria", unique = true, nullable = false)
	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	@Column(name = "nombre", unique = true, nullable = false, length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "desrcipcion")
	public String getDesrcipcion() {
		return this.desrcipcion;
	}

	public void setDesrcipcion(String desrcipcion) {
		this.desrcipcion = desrcipcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoriaByIdsubcategoria")
	public Set<CategoriaSubcategoria> getCategoriaSubcategoriasForIdsubcategoria() {
		return this.categoriaSubcategoriasForIdsubcategoria;
	}

	public void setCategoriaSubcategoriasForIdsubcategoria(
			Set<CategoriaSubcategoria> categoriaSubcategoriasForIdsubcategoria) {
		this.categoriaSubcategoriasForIdsubcategoria = categoriaSubcategoriasForIdsubcategoria;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	public Set<CategoriaProducto> getCategoriaProductos() {
		return this.categoriaProductos;
	}

	public void setCategoriaProductos(Set<CategoriaProducto> categoriaProductos) {
		this.categoriaProductos = categoriaProductos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoriaByIdcategoria")
	public Set<CategoriaSubcategoria> getCategoriaSubcategoriasForIdcategoria() {
		return this.categoriaSubcategoriasForIdcategoria;
	}

	public void setCategoriaSubcategoriasForIdcategoria(
			Set<CategoriaSubcategoria> categoriaSubcategoriasForIdcategoria) {
		this.categoriaSubcategoriasForIdcategoria = categoriaSubcategoriasForIdcategoria;
	}

}

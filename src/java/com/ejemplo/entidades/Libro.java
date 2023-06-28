package com.ejemplo.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {

	@Id
	@Column(name = "isbn")
	private String isbn;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "nombre_autor")
	private String nombre_autor;	
	@Column(name = "publicacion")
	private Date publicacion;
	@Column(name = "fecha_registro")
	private Date fecha_registro;
	@Column(name = "codigo_categoria")
	private int codigo_categoria;
	@Column(name = "nit_editorial")
	private String nit_editorial;
	
	public Libro() {
		
	}

	public Libro(String isbn, String titulo, String descripcion, String nombre_autor, Date publicacion,
			Date fecha_registro, int codigo_categoria, String nit_editorial) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.nombre_autor = nombre_autor;
		this.publicacion = publicacion;
		this.fecha_registro = fecha_registro;
		this.codigo_categoria = codigo_categoria;
		this.nit_editorial = nit_editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre_autor() {
		return nombre_autor;
	}

	public void setNombre_autor(String nombre_autor) {
		this.nombre_autor = nombre_autor;
	}

	public Date getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Date publicacion) {
		this.publicacion = publicacion;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public int getCodigo_categoria() {
		return codigo_categoria;
	}

	public void setCodigo_categoria(int codigo_categoria) {
		this.codigo_categoria = codigo_categoria;
	}

	public String getNit_editorial() {
		return nit_editorial;
	}

	public void setNit_editorial(String nit_editorial) {
		this.nit_editorial = nit_editorial;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", descripcion=" + descripcion + ", nombre_autor="
				+ nombre_autor + ", publicacion=" + publicacion + ", fecha_registro=" + fecha_registro
				+ ", codigo_categoria=" + codigo_categoria + ", nit_editorial=" + nit_editorial + "]";
	}
	
	
	
}

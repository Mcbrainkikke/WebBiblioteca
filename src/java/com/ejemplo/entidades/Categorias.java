package com.ejemplo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categorias {

	@Id
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	
	public Categorias() {
		
	}

	public Categorias(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categorias [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
}

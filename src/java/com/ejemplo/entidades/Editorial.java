package com.ejemplo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "editoriales")
public class Editorial {
	
	@Id
	@Column(name = "nit")
	private String nit;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "email")
	private String email;
	@Column(name = "sitioweb")
	private String sitioweb;
	
	public Editorial() {
		
	}

	public Editorial(String nit, String nombre, String telefono, String direccion, String email, String sitioweb) {
		super();
		this.nit = nit;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.sitioweb = sitioweb;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSitioweb() {
		return sitioweb;
	}

	public void setSitioweb(String sitioweb) {
		this.sitioweb = sitioweb;
	}

	@Override
	public String toString() {
		return "Editorial [nit=" + nit + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", email=" + email + ", sitioweb=" + sitioweb + "]";
	}
	
	
	
}

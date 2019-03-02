package com.novellius.pojo;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Admin{

	private int idAd;
	private String nombre;
	private String cargo;
//	private Date fechaCreacion;
	
	public int getIdAd() {
		return idAd;
	}
	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
//	public Date getFecha() {
//		return fechaCreacion;
//	}
//	public void setFecha(Date ts) {
//		this.fechaCreacion = ts;
//	}
	
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + ", cargo=" + cargo + "]";
	}
	
//	@Autowired
//	private Direccion direccion;
//
//	public Administrador() {
//
//	}
//
//	public Administrador(int idAd, String nombre) {
//		this.idAd = idAd;
//		this.nombre = nombre;
//	}
//
//	public void setIdAd(int idAd) {
//		this.idAd = idAd;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//	
//	@Autowired
//	public void setDireccion (Direccion direccion){
//		this.direccion=direccion;
//	}
//
///*	@Override
//	public String toString() {
//		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + "]";
//	}*/
//	
//	
//
//	public void imprimirDireccion() {
//		System.out.println("Escosura 16");
//	}
//
//	@Override
//	public String toString() {
//		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + ", direccion=" + direccion + "]";
//	}
}

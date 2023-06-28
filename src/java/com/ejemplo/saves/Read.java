package com.ejemplo.saves;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ejemplo.entidades.Categorias;

public class Read {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Categorias.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Categorias resultado = session.get(Categorias.class, 4);
			System.out.println("Registro Obtenido!: " + resultado);			
			
			List<Categorias> resultados = session.createQuery("from Categorias").list();
			System.out.println("\nConsulta General");
			for(Categorias c: resultados) {
				System.out.println(c);
			}
			
			session.getTransaction().commit();
			
			System.out.println("Proceso Finalizado");
			
		}finally {
			factory.close();
		}

	}

	

}

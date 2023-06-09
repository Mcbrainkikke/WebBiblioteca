package com.ejemplo.saves;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ejemplo.entidades.Categorias;

public class DeleteUpdate {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Categorias.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			//----metodo para actualizar----
			//Categorias per = session.get(Categorias.class, 8);
			//per.setNombre("Prueba_videos");
			
			//metodo para actualizar por comando SQL
			//session.createQuery("update Categorias c set c.nombre = 'Prueba_dos' where c.nombre = 'Prueba_doss' ").executeUpdate();
			
			
			//----metodo para eliminar----
			//session.delete(per);
			
			//metodo para eliminar por comando SQL
			session.createQuery("delete from Categorias c where c.nombre = 'Prueba_videos' ").executeUpdate();
			
			
			session.getTransaction().commit();
			
			System.out.println("Proceso Finalizado");
			
		}finally {
			factory.close();
		}

	}

}

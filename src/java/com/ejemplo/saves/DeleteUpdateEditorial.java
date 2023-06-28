package com.ejemplo.saves;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.ejemplo.entidades.Editorial;

public class DeleteUpdateEditorial {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Editorial.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			//----metodo para actualizar----
			/*Editorial per = session.get(Editorial.class, 4);
			per.setNombre("Medicina");*/
			
			//metodo para actualizar por comando SQL
			session.createQuery("update Editorial e set e.telefono = '555-4444-333' where e.telefono = '555-4444' ").executeUpdate();
			
			
			//----metodo para eliminar----
			//session.delete(per);
			
			//metodo para eliminar por comando SQL
			//session.createQuery("delete from Categorias c where c.nombre = 'Prueba_dos' ").executeUpdate();
			
			
			session.getTransaction().commit();
			
			System.out.println("Proceso Finalizado");
			
		}finally {
			factory.close();
		}

	}

}

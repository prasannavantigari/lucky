package com.mycompany.hibernatetodo_one_to_one_map.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernatetodo_one_to_one_map.entity.Task;
import com.mycompany.hibernatetodo_one_to_one_map.entity.ToDo;

public class App {

	public static void main(String[] args) {
	try {
		
		SessionFactory factory=new Configuration()
				.configure().addAnnotatedClass(ToDo.class)
				.addAnnotatedClass(Task.class).buildSessionFactory();
		Session session=factory.openSession();
		ToDo todo=new ToDo("john", "12-05-2013");
		todo.setTask(new Task("designing", "williams"));
		session.getTransaction().begin();
		session.save(todo);
		session.getTransaction().commit();
		
	} catch (Exception e) {
		e.printStackTrace();
	}

}

}

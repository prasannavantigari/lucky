package comm.example;


import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Picture;
import comm.example.entity.Album;
import comm.example.entity.MyImage;
public class CreatePicturesDemo {

public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Album.class)
								.addAnnotatedClass(MyImage.class)
								.addAnnotatedClass(Picture.class)
								.buildSessionFactory();
		

		Session session = factory.getCurrentSession();
		
		try {			
			//session.beginTransaction();
			int theId = 1;

			Album tempAlbum =new Album("album1",LocalDate.now());
			MyImage image=new MyImage("https:??url1");
			Picture tempPicture = new Picture("prassu");
			Picture tempPicture1 = new Picture("suppu");
			tempAlbum.add(tempPicture);
			tempAlbum.add(tempPicture1);
			tempAlbum.setImage(image);
	
			session.getTransaction().begin();
			session.save(tempPicture);
			session.save(tempPicture1);
			session.save(tempAlbum);
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			//session.close();
			factory.close();
		}
	}

}

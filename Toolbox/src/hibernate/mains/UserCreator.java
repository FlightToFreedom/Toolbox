package hibernate.mains;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.User;

public class UserCreator {

	private static SessionFactory factory;

	public Integer createUser(String userName, String password){
		try{
			factory = new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
		Session session = factory.openSession();

		Transaction tx = null;

		Integer userId = null;
		try{
			tx = session.beginTransaction();
			User user = new User(userName, password);
			userId = (Integer) session.save(user); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
		return userId;
	}

}

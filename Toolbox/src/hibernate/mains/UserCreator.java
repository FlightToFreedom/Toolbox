package hibernate.mains;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernate.User;

public class UserCreator {

	private static SessionFactory factory;

	public Integer createUser(String userName, String password){
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

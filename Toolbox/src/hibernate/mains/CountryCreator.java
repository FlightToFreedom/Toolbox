package hibernate.mains;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.pojos.Country;

public class CountryCreator {

	private static SessionFactory factory;

	public void createCountries(){
		try{
			factory = new Configuration().addAnnotatedClass(Country.class).configure().buildSessionFactory();
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}

		Session session = factory.openSession();
		Transaction tx = null;

		Integer countryId = null;
		try{
			tx = session.beginTransaction();
			List<String> countries = readCountriesFile();
			if(countries.isEmpty())
				return;
			for(String countryName : countries){
				Country country = new Country(countryName);
				countryId = (int)session.save(country);
				System.out.println("Saving country: "+countryName+" with id: "+countryId);
			}  
			tx.commit();	
		}catch(HibernateException e){
			if(tx!=null){tx.rollback();}
			e.printStackTrace();
		}
	}

	/**
	 * Reads the countries in the resources package
	 * @return
	 */
	public List<String> readCountriesFile(){
		BufferedReader bufReader=null;
		List<String> countries = new ArrayList<>();
		try{
			bufReader = new BufferedReader(new FileReader("src/hibernate/resources/countries"));
			String line = bufReader.readLine();
			while(line!=null){
				countries.add(line);
				line = bufReader.readLine();
			}
		}catch(Exception e){
			e.printStackTrace();
			return Collections.emptyList();
		}finally{
			try{
				bufReader.close();
			}catch(IOException x){
				x.printStackTrace();
			}
		}
		return countries;
	}
}

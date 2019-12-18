package com.woniu.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	static ThreadLocal<Session> tl = new ThreadLocal<Session>();
	static SessionFactory sf;
	static{
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		sf = config.buildSessionFactory();
	}
	
	public static Session getSession(){
		Session session = tl.get();
		if(session==null){
			session = sf.openSession();
			tl.set(session);
		}
		return session;
	}
	
	public static void closeSession(){
		Session session = tl.get();
		if(session!=null){
			session.close();
			tl.set(null);
		}
	}
}

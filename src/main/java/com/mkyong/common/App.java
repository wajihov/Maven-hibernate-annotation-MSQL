package com.mkyong.common;

import org.hibernate.Session;

import com.mkyong.persistence.HibernateUtil;

public class App {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Stock st = new Stock();
		st = new Stock("KLMN", "12345");

		session.save(st);
		session.getTransaction().commit();

	}

}

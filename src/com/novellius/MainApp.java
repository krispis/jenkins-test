package com.novellius;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.novellius.pojo.Admin;
import com.novellius.pojo.AdminDao;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.config.xml");

		AdminDao adminDao = (AdminDao) applicationContext.getBean("adminDao");
		
		//Admin admin = (Admin) applicationContext.getBean("admin");
		
		//System.out.println(admin.getNombre());
		
		Date date = new Timestamp (new Date().getTime());
		
		Admin admin =  new Admin();
		int i=0;
		admin.setIdAd(1);
		admin.setNombre("Cris");
		admin.setCargo("CEO");
//		admin.setFecha(date);
		
		if (adminDao.save(admin) ){
			adminDao.save(admin);
			System.out.println("admin salvado");
		}
		else
			System.out.println("ocurrio una mierda gorda");
	
		
		//Admin admin = (Admin) applicationContext.getBean("admin");
		
		//System.out.println(admin);
		
		//admin.imprimirDireccion();
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}



package com.novellius.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("AdminDao")
public class AdminDaoImplement implements AdminDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private void setDataSource (DataSource dataSource){
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public boolean save(Admin admin) {
		// TODO Auto-generated method stub
		
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
//		Map<String, Object> parameters = new HashMap<String, Object>();
		
		DateFormat fecha = new SimpleDateFormat("yyyy/MM/dd");
		//String convertido = fecha.format(admin.getFecha());

		paramMap.addValue("idAd", admin.getIdAd());
		paramMap.addValue("nombre", admin.getNombre());
		paramMap.addValue("cargo", admin.getCargo());
//		paramMap.addValue("fechaCreacion", admin.getFecha() );
		
		//paramMap.addValue("cargo", admin.getCargo());
		//paramMap.addValue("fecha", admin.getFecha());

		System.out.println(admin.getIdAd());
		
		String selectSql ="select * from springdb.admin";
		
		String insertSql= "insert into Admin (idAd, nombre, cargo)"
					+ " values (:idAd, :nombre, :cargo)";
		
	    List<Map<String, Object>> todo = jdbcTemplate.queryForList(selectSql, paramMap);
	    
	          
		
		

		if (jdbcTemplate.update(insertSql, paramMap) ==1) 
			return true;
		else
			return false;
	}

}

package com.bonc.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bonc.entity.Person;

@Repository
public class PersonDao {
		
	
	@Resource
    private JdbcTemplate jdbcTemplate;
    
    /**
     * 通过id获取demo对象.
     * @param id
     * @return
     */
    public Person getById(Long id){
    	String sql = "select *from person where id=?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<Person>(Person.class);
        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    } 
    public Person findPerson(){
    	String sql = "select *from person where id=3";
    	RowMapper<Person> rm=new BeanPropertyRowMapper<Person>(Person.class);
    	return jdbcTemplate.queryForObject(sql, rm);
    }
}


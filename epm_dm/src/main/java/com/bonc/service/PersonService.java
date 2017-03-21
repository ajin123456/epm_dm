package com.bonc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bonc.dao.PersonDao;
import com.bonc.dao.PersonRepository;
import com.bonc.entity.Person;

@Service
public class PersonService {
	
	@Resource
	private PersonDao personDao;
	@Resource
	private PersonRepository personRepository;
	
	public void save(Person person){
		
		personRepository.save(person);
	}
	
	public Person getById(long id){
        //demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
        return personDao.getById(id);
 }
	public Person findPerson(){
		return personDao.findPerson();
	}
}

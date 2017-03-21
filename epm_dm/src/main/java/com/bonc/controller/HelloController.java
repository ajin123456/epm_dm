package com.bonc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonc.entity.Person;
import com.bonc.service.PersonService;
@RestController
@RequestMapping("/person")
public class HelloController {
	@Resource
	private PersonService personService;
	
	@RequestMapping("/save")
	public String save(){
		Person p=new Person();
		p.setName("anaaaa");
		p.setPassword("123456");
		personService.save(p);
		return "ok.HelloController.save";
	}
	
	 @RequestMapping("/getById")
	    public Person getById(long id){
	       return personService.getById(id);
	    }
	 @RequestMapping("/findPerson")
	 public Person findPerson(){
		 return personService.findPerson();
	 }
}

package com.bonc.dao;

import org.springframework.data.repository.CrudRepository;

import com.bonc.entity.Person;

/*
 * 在CrudRepository自带常用的crud方法.
 * 这样一个基本dao就写完了.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

}

package org.module.first;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Student {

	int id ;
	String name;
}
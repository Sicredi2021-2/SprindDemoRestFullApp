package br.pucrs.sicredi.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.sicredi.beans.Student;
import br.pucrs.sicredi.beans.StudentRegistration;

@RestController
public class StudentUpdateController {

//	@RequestMapping(method = RequestMethod.PUT, value="/update/student")
//
//
//	@ResponseBody
	@PutMapping("/update/student")
	public String updateStudentRecord(@RequestBody Student stdn) {
		System.out.println("In updateStudentRecord");   
		return StudentRegistration.getInstance().upDateStudent(stdn);
	}

}

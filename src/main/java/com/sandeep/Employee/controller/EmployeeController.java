package com.sandeep.Employee.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sandeep.Employee.model.Employee;
import com.sandeep.Employee.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository emprepo;
	
	@RequestMapping("/login")
	public String hello(Model model, HttpServletRequest req)
	{
		return "login";
		
	}
	@RequestMapping("/welcome")
	public String welcomepage(Model model, HttpServletRequest req)
	{
		String username=req.getParameter("name");
		String password=req.getParameter("password");
		
		if(req.getParameter("newuser") != null){
			return "empform";
		}
		else{
			if("san".equals(username)&& "sam".equals(password))
			{	
				model.addAttribute("sandeep",username);
				model.addAttribute(password);
				return "welcome";
			}
		}
		model.addAttribute("errormessage", "Invalid Credentials!!!");
		return "login";
	}
	
	@RequestMapping("/save")
	public String saveUser(Model model, HttpServletRequest req)
	{
		Employee emp=new Employee();
		 
		 emp.setName(req.getParameter("name"));
		 emp.setMname(req.getParameter("mname"));
		 emp.setLname(req.getParameter("lname"));
		 emp.setDesignation(req.getParameter("designation"));
		 emp.setSalary(Double.parseDouble(req.getParameter("salary")));
		 
		 emprepo.save(emp);
		 
		 model.addAttribute("Success","Employee added Successfully");
		
		return "empform";
		
	}
    @RequestMapping("/getUser")
    public String getUserById(Model model,HttpServletRequest req)
    {
		return "getEmpform";
    	
    }
    
    @RequestMapping("/get")
    public String getUser(Model model,HttpServletRequest req)
    {
		if(req.getParameter("")!=null)
		{
			Optional<Employee> emp=emprepo.findById(Long.parseLong(req.getParameter("getid")));
			Employee emp1=emp.get();
			model.addAttribute("name",emp1.getName());
			model.addAttribute("mname",emp1.getMname());
			model.addAttribute("lname",emp1.getLname());
			model.addAttribute("designation",emp1.getDesignation());
			model.addAttribute("salary",emp1.getSalary());
			
			return "getEmpform";
		}
		else if(req.getParameter("getall")!=null)
		{
			List<Employee>list= (List<Employee>) emprepo.findAll();
			model.addAttribute("employee", list);
			return "alluser";
		}
    	return "getEmpform";
    	
    }
}

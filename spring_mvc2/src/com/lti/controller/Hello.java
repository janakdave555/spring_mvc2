package com.lti.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello
{
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public ModelAndView sayHello()
	{
		ModelAndView model=new ModelAndView("hello1");
		model.addObject("message","Hello from the other side");
		return model;
	}
	
	@RequestMapping(value = "/sayhello",method = RequestMethod.GET)
	public ModelAndView sayHelloToName(@RequestParam("name") String name)
	{
		ModelAndView model=new ModelAndView("hello1");
		model.addObject("name",name);
		model.addObject("todaysDate",new Date());
		
		return model;
	}
	
	@RequestMapping(value="/prime",method=RequestMethod.GET)
	public ModelAndView numberCheck(@RequestParam int number)
	{
		  int i,m=0,flag=0;      
		 
		  m=number/2;  
		  
		  ModelAndView model=new ModelAndView("prime");
		  
		  if(number==0||number==1)
		  	{  
		   model.addObject("message",number+"The number is not prime");    
		  	}
		  else
		  	{  
		   for(i=2;i<=m;i++)
		   		{      
		    if(number%i==0)
		    		{      
		    	 model.addObject("message",number+"The number is not prime");       
		     flag=1;      
		     break;      
		    		}      
		   		}      
		   if(flag==0) 
		   
		   		{ 
			  	 model.addObject("message",number+"The number is prime");   
		   		}  
		  	}  
		  return model;
	}
}

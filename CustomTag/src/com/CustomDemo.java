package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomDemo extends SimpleTagSupport {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		JspWriter out=getJspContext().getOut();
		
		
		
		out.println("<h1><center>Hi Client:: </center></h1>"+"<h1><center>"+name+"</center></h1>");
		
		out.println("<div style='text-align:center;margin-top:90px;'>"
				+ "<iframe style='display:auto;' width='560' height='315' src='https://www.youtube.com/embed/y7T3ax7JPwI?autoplay=1&mute=1' ></iframe></div>");
	}

}

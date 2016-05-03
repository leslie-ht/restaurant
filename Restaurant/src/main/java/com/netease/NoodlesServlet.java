package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netease.Kitchen;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
/*
 * author: leslie
 * date: 3 May 2016
 */
public class NoodlesServlet extends HttpServlet {
	private static Logger log = Logger.getLogger(NoodlesServlet.class);
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter writer = response.getWriter();
		 String vegetable = request.getParameter("vegetable");

		 String noodles = Kitchen.makeNoodles(vegetable);
		 writer.println(noodles);
//		BasicConfigurator.configure();
//		PrintWriter writer = response.getWriter();
//		String vegetable = request.getParameter("vegetable");
//		
//
//		if (vegetable == null){
//			vegetable = "Tomato";
//		}
//
//		log.info("The vegetable in Noodles is " + vegetable);
//
//		writer.println("<html><body>");
//		writer.println("<h1> Noodles with " + vegetable + "</h1>");
//		writer.println("</body></html>");
	}
}

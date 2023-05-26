package calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/div")
public class Division extends HttpServlet
{
	 @Override
//	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//		
//	 double num1=Double.parseDouble(arg0.getParameter("num1"));
//	  int num2=Integer.parseInt(arg0.getParameter("num2"));
//	   arg1.getWriter().print("<html><body><h1 style='color:blue'> the division of "+num1+" and "+num2+" is "+(num1/num2)+ "</h1></body></html>");
//		
//	     
//	   protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//	 		
//	 double num1=Double.parseDouble(arg0.getParameter("num1"));
//  int num2=Integer.parseInt(arg0.getParameter("num2"));
//	 arg1.getWriter().print("<html><body><h1 style='color:blue'> the division of "+num1+" and "+num2+" is "+(num1/num2)+ "</h1></body></html>");
////			
//		     
//  
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 double num1=Double.parseDouble(((ServletRequest) resp).getParameter("num1"));
		 int num2=Integer.parseInt(((ServletRequest) resp).getParameter("num2"));
 resp.getWriter().print("<html><body><h1 style='color:blue'> the division of "+num1+" and "+num2+" is "+(num1/num2)+ "</h1></body></html>");
				 
		 
	
}
	}



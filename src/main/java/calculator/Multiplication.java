package calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Multiplication extends GenericServlet

{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		int num1=Integer.parseInt(arg0.getParameter("num1"));
	     int num2=Integer.parseInt(arg0.getParameter("num2"));
	     arg1.getWriter().print("<html><body><h1 style='color:blue'> the product of "+num1+" and "+num2+" is "+(num1*num2)+ "</h1></body></html>");
		}

		
	}



package Demopackege;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/addtwonum")
public class addtwonum extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		String fristnum=req.getParameter("fristnumber");
		String secondnum=req.getParameter("secondnumber");
		String operetion =req.getParameter("arithmatic");
		
		System.out.println(operetion);
		double num1=Double.parseDouble(fristnum);
		double num2=Double.parseDouble(secondnum);
		
		PrintWriter pw=resp.getWriter();
		switch (operetion ) {
		case "add":
			pw.print("additon is"+(num1+num2));
			break;
			
		case "sub":
			pw.print("substraction is"+(num1-num2));
			break;
			
		case "div":
			pw.print("division is"+(num1/num2));
			break;
			
		case "mul":
			pw.print("multiplication is"+(num1*num2));
			break;
			
		}
	}
}

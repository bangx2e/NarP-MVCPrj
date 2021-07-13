package kr.web.controller;

// JavaEE-> Servlet(서블릿)의 구조
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import kr.web.util.MyUtil;

@WebServlet("/sum.do")
public class HelloServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 1~100까지의 합
		MyUtil my = new MyUtil();
		int sum = my.sum();
		PrintWriter out = resp.getWriter();
		out.println("<html>");  
		out.println("<body>");
		out.println(sum);
		out.println("</body>");
		out.println("</html>");
	}

}

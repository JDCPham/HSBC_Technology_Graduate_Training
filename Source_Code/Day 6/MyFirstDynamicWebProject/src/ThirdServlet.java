

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThirdServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		for (int i = 0; i <= 10; i++) {
			out.write(i + " x 2 = " + 2*i);
			out.write("<br>");
		}
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int x = Integer.parseInt(request.getParameter("T"));
		for (int i = 0; i <= 10; i++) {
			out.write(i + " x " + x + " = " + x*i);
			out.write("<br>");
		}
		out.close();
	}

}

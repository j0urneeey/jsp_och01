package och02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Servlet implementation class Person
 */
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		String gender = request.getParameter("gender");
		//배열인 경우: request 객체의 getParameterValues(“매개변수이름”)으로 처리
		String[] notice = request.getParameterValues("notice");
		String job = request.getParameter("job");
		
		out.println("<html><body>");
		out.println("<h2>개인정보</h2>");
		out.println("이름 : " + name + "<p>");
		out.println("아이디 : " + id + "<p>");
		out.println("암호 : " + pw + "<p>");
		out.println("성별 : " + gender+ "<p>");
//		out.println("수신메일 : " + Arrays.toString(notice) + "<p>");
		out.println("수신메일 : ");
		if (notice != null) {
			for (String n : notice) {
				out.println(n);
			}			
		}
		out.println("<p> ");
		out.println("직업 : " + job);
		out.println("</html></body>");
	}

}

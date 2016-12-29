package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myLoginServlet
 */
@WebServlet("/servlet/myLoginServlet")
public class myLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");//解决请求中文传递参数乱码方式一,在请求之前设置编码方式
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out = response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD><TITLE>用servlet测试方法</TITLE></HEAD>");
	out.println("<BODY>");
	out.println("<H2>用户输入信息如下:<H2>");
	String uname = request.getParameter("username");// 解决中文参数乱码问题，方式二，在获取参数后设置编码方式
	String username = new String(uname.getBytes("iso8859-1"), "UTF-8");
	if (username==null||username=="") {
		username="未输入";
	}
	String pword = request.getParameter("password");
	String password = new String(pword.getBytes("iso8859-1"), "UTF-8");
	if (password==null||password=="") {
		password="未输入";
	}
	out.println("<H2>用户名:"+username+"</H2>");
	out.println("<H2>密码:"+password+"</H2>");
	out.println("</BODY>");
	out.println("</HTML>");
	out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

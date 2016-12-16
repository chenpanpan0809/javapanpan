package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Initparameter
 */
@WebServlet(
		urlPatterns = { "/servlet/Initparameter"}, 
		initParams = { 
				@WebInitParam(name = "school", value = "华中科技大学"), 
				@WebInitParam(name = "major", value = "java编程技术")
		})
public class Initparameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String myInit = null;
	private String myMajor = null;
	private int count = 0;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Initparameter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		myInit = config.getInitParameter("school");
		if (myInit==null) {
			myInit="";
		}
		myMajor= config.getInitParameter("major");
		if (myMajor==null) {
			myMajor="";
		}
		String strCount = config.getInitParameter("count");
		try {
			count = Integer.parseInt(strCount);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>获取参数</head></title>");
		out.println("<body>");
		out.println("<h2>所在学院"+myInit+"</h2>");
		out.println("<h2>所学专业"+myMajor+"</h2>");
		count++;
		out.println("<h3>此servlet访问次数"+count+"</h3>");
		out.println("</body>");
		out.println("</html>");
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

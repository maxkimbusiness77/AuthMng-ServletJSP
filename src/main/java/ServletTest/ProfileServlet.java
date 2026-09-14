package ServletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProflieServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html; charset=UTF-8");
	        response.setCharacterEncoding("UTF-8");
	        
			String id = nvl(request.getParameter("user-id"));
			String ctx = request.getContextPath();
	        PrintWriter out = response.getWriter();

	        out.println("<!DOCTYPE html>");
	        out.println("<html lang='ko'>");

	        // head
	        out.println("<head>");
	        out.println("    <meta charset='UTF-8'>");
	        out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	        out.println("    <title>Maximize Your Potential</title>");
	        out.println("    <link rel='stylesheet' href='" + ctx + "/css/common.css'>");
	        out.println("    <link rel='stylesheet' href='" + ctx + "/css/profile.css'>");
	        out.println("</head>");

	        out.println("<body>");

	        // header
	        out.println("<header class='layout-header'>");
	        out.println("    <h1>");
	        out.println("        <a href='" + ctx + "/LoginServlet'>Maximize Your Potential</a>");
	        out.println("    </h1>");

	        out.println("    <div>");
	        out.println("        <a href='" + ctx + "/ProfileServlet'>프로필</a>");
	        out.println("        <a href='" + ctx + "/LoginServlet'>로그인</a>");
	        out.println("        <button type='button'>로그아웃</button>");
	        out.println("    </div>");
	        out.println("</header>");

	        // main
	        out.println("<main class='profile'>");

	        out.println("    <section class='welcome-section'>");

	        out.println("        <img src='" + ctx
	                + "/img/image.png' alt='프로필이미지' class='profile-img'>");

	        out.println("        <h2>'"+ id +"'님 환영합니다!</h2>");
	        out.println("        <p>로그인에 성공하였습니다. 환영합니다!!</p>");
	        out.println("        <p>오늘도 즐거운 하루 보내세요!!</p>");

	        out.println("    </section>");

	        out.println("</main>");

	        // footer
	        out.println("<footer class='layout-footer'>");
	        out.println("    Copyright 2026. Maximize Your Potential.");
	        out.println("</footer>");

	        out.println("</body>");
	        out.println("</html>");

	        out.flush();
	    }
	
	private String nvl(String s) {
		if (s == null) {
			s = "";
		}
		return s;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

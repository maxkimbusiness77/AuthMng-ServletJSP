package ServletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String ctx = request.getContextPath();
		PrintWriter out = response.getWriter();	
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>                                                                                  ");
		out.println("	<meta charset='UTF-8'>                                                               ");
		out.println("	<meta name='viewport' content='width=device-width, initial-scale=1.0'>               ");
		out.println("	<title>Maximize Your Potential</title>                                               ");
		out.println("	<link rel='stylesheet' href='" + ctx + "/css/common.css'>                                      ");
		out.println("	<link rel='stylesheet' href='" + ctx + "/css/index.css'>                                       ");
		out.println("</head>                                                                                 ");
		out.println("<body>                                                                                  ");
		out.println("	<!-- header -->                                                                      ");
		out.println("	 <header class='layout-header'>                                                      ");
		out.println("		<h1><a href='./'>Maximize Your Potential</a></h1>                                ");
		out.println("		<div>                                                                            ");
		out.println("			<a href='"+ctx+"/ProfileServlet'>프로필</a>                                          ");
		out.println("			<a href='"+ctx+"/LoginServlet'>로그인</a>                                            ");
		out.println("			<button type='button'>로그아웃</button>                                      ");
		out.println("		</div>                                                                           ");
		out.println("	 </header>                                                                           ");
		out.println("	<!-- main -->                                                                        ");
		out.println("	 <main class='login'>                                                                ");
		out.println("		<h2 class='main-title'>로그인</h2>                                               	");
		out.println("		<p class='main-desc'>아이디와 비밀번호를 입력하고 로그인하세요</p>               			");
		out.println("		<form class='main-form' method='POST' action='"+ctx+"/ProfileServlet'>                   ");
		out.println("			<section class='flex-input'>                                                 ");
		out.println("				<label class='user-id'>아이디</label>                                    	 ");
		out.println("				<input id='user-id' class='user-id' name='user-id' type='text' required/>");
		out.println("			</section>                                                                   ");
		out.println("			<section class='flex-input'>                                                 ");
		out.println("				<label class='user-pw'>비밀번호</label>                                  ");
		out.println("				<input id='user-pw' class='user-pw' name='user-pw' type='text' required/>");
		out.println("			</section>                                                                   ");
		out.println("			<section class='btn-section'>                                                ");
		out.println("				<button id='login-btn' class='login-btn' type='submit'>로그인</button>   ");
		out.println("			</section>                                                                   ");
		out.println("		</form>                                                                          ");
		out.println("	 </main>                                                                             ");
		out.println("	 <!-- footer -->                                                                     ");
		out.println("	  <footer class='layout-footer'>                                                     ");
		out.println("		Copyright 2026. MaximizeYour Potential.                                          ");
		out.println("	  </footer>                                                                          ");
		out.println("</body>                                                                                 ");
		out.println("</html>                                                                                 ");
		
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

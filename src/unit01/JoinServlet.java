package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("name");
		String jumin = request.getParameter("jumin_1") + "-" + request.getParameter("jumin_2");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String zip = request.getParameter("zip");
		String addr = request.getParameter("addr1") + request.getParameter("addr2");
		String interests[] = request.getParameterValues("interest");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String chk_mail = request.getParameter("chk_mail");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("이름 : <b>");
		out.print(name);
		out.println("</b><br>주민번호 : <b>");
		out.print(jumin);
		out.println("</b><br>아 이 디 : <b>");
		out.print(id);
		out.println("</b><br>비밀번호 : <b>");
		out.print(pwd);
		
		if(request.getParameter("email_dns").trim() == "") {
			email += "@" + request.getParameter("emailaddr");
		} else {
			email += "@" + request.getParameter("email_dns");
		}
		
		out.println("</b><br>이 메 일 : <b>");
		out.print(email);
		
		out.println("</b><br> 메일 정보 수신 여부 : <b>");
		out.println(chk_mail);
		
		out.println("</b><br>우편번호 : <b>");
		out.print(zip);
		out.println("</b><br>주소 : <b>");
		out.print(addr);
		out.println("</b><br>핸드폰 번호 : <b>");
		out.print(phone);
		out.println("</b><br>직업 : <b>");
		out.print(job);
		out.println("</b><br>관심분야 : <b>");
		
		if (interests == null) {
			out.print("선택한 항목이 없습니다.");
		} else {
			for (String interest : interests) {
				out.print(interest + " ");
			}
		}
		
		out.println("</b><br><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
		
	}
}
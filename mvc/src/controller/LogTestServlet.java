package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class LogTestServlet
 */
@WebServlet("/logtest")
public class LogTestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loggerName = "case4";
		Logger log = LogManager.getLogger(loggerName);
		log.fatal("fatal-로그를 테스트합니다.");
		log.error("error-로그를 테스트합니다.");
		log.warn("warn-로그를 테스트합니다.");
		log.info("info-로그를 테스트합니다.");
		log.debug("debug-로그를 테스트합니다.");
		log.trace("trace-로그를 테스트합니다.");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>로거명" + loggerName + "로 로그테스트 완료!!</h1>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

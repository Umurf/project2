package com.oww.app.controller.notice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Result;
import com.oww.app.controller.fboard.FboardListOkController;

/**
 * Servlet implementation class NoticeFrontController
 */

public class NoticeFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doProcess(request,response);
	}


	protected Result doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		
		Result result = null;
		
		switch(target) {
		case "/project/noticeListOk.no":
			result = new NoticeListOkController().execute(request, response);
			break;
			
<<<<<<< HEAD
//		case "/project/noticePageOk.no":
//			result = new NoticePageOkController().execute(request, response);
//			break;	
			
=======
<<<<<<< HEAD
>>>>>>> work/jsp
		case "/project/noticePageOk.no":
			result = new NoticePageOkController().execute(request, response);
			break;	
		case "/board/views/noticeWrite.no":
			System.out.println("=======");
			result = new NoticeWriteController().execute(request, response);
			break;
		case "/board/views/noticeWriteOk.no":
			System.out.println("noticeWriteOk-게시글 작성들어가기");
			result = new NoticeWriteOkController().execute(request, response);
			break;
//		case "/project/noticePageOk.no":
//			result = new NoticePageOkController().execute(request, response);
//			break;	
		}
		
	      return result;
	}
}


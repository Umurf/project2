package com.oww.app.controller.notice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Result;
import com.oww.app.controller.fboard.FboardDeleteOkController;
import com.oww.app.controller.fboard.FboardListOkController;
import com.oww.app.controller.fboard.FboardUpdateController;
import com.oww.app.controller.fboard.FboardUpdateOkController;

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
			System.out.println("noticeListOk 완료");
			result = new NoticeListOkController().execute(request, response);
			request.getRequestDispatcher("/board/project/notice.jsp").forward(request, response);
			break;
		case "/board/views/noticeWrite.no":
			System.out.println("noticeWrite 완료");
			result = new NoticeWriteController().execute(request, response);
			request.getRequestDispatcher("/board/views/adminWriting.jsp").forward(request, response);
			break;
		case "/board/views/noticeWriteOk.no":
			System.out.println("noticeWriteOk-게시글 작성들어가기");
			result = new NoticeWriteOkController().execute(request, response);
			break;
		case "/board/views/noticeDeleteOk.no":
			System.out.println("noticeDeleteOk 완료");
			result = new NoticeDeleteOkController().execute(request, response);
			break;
		case "/board/views/noticeUpdate.no":
			System.out.println("noticeUpdate 완료");
			result = new NoticeUpdateController().execute(request, response);
			break;
		case "/board/views/noticeUpdateOk.no":
			System.out.println("noticeUpdateOk 완료");
			result = new NoticeUpdateOkController().execute(request, response);
			break;
		case "/board/views/noticeReadOk.no":
			System.out.println("noticeReadOk 완료");
			result = new NoticeReadOkController().execute(request, response);
			break;
		}
		
	      return result;
	}
}


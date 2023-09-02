package com.oww.app.controller.notice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.NoticeDAO;

public class NoticePageOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NoticeDAO noticeDAO = new NoticeDAO();

		String temp = req.getParameter("page");

		int page = temp == null ? 1 : Integer.valueOf(temp);

		int rowCount = 10;
		int pageCount = 3;

		int startRow = (page - 1) * rowCount;

		Map<String, Integer> pageMap = new HashMap<>();
		pageMap.put("startRow", startRow);
		pageMap.put("rowCount", rowCount);

		int total = noticeDAO.getTotalCount(); // +++++++++

		int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);
		int startPage = endPage - (pageCount - 1);
		int realEndPage = (int) Math.ceil(total / (double) rowCount);
		boolean prev = startPage > 1;
		endPage = endPage > realEndPage ? realEndPage : endPage;
		boolean next = endPage != realEndPage;

//		++++++++
		req.setAttribute("boardList", noticeDAO.selectPage(pageMap));
		req.setAttribute("page", page);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		req.setAttribute("prev", prev);
		req.setAttribute("next", next);
//		+++++++++
//		req.getRequestDispatcher("/board/project/notice.jsp").forward(req, resp);
		
		System.out.println("NoticeList 페이징 테스트");
		
		req.setAttribute("noticeList", noticeDAO.selectAll());
		//이제 경로 설정 하면 끝
		req.getRequestDispatcher("/board/project/notice.jsp").forward(req, resp);
		
		System.out.println("NoticeList 컨트롤러 테스트");
		
		return null;
	}
}
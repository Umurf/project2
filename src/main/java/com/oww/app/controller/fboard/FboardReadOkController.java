package com.oww.app.controller.fboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.FboardDAO;

public class FboardReadOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		FboardDAO fboardDAO = new FboardDAO();
		
		request.setAttribute("fboard", fboardDAO.selectAll());
		//이제 경로 설정 하면 끝
		request.getRequestDispatcher("/board/views/readingMy.jsp").forward(request, response);
		
		System.out.println("FboardReadingMy 컨트롤러 테스트");

		return null;
	}

}

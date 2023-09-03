package com.oww.app.controller.fboard;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.FboardDAO;
import com.oww.app.vo.FboardVO;

public class FboardReadOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("test1");
		FboardDAO fboardDAO = new FboardDAO();
		FboardVO fboardVO = new FboardVO();
		System.out.println("test2");
		
//		fboardDAO = fboardDAO.selectAll2();
        request.setAttribute("fboard", fboardDAO.selectAll2());
		//이제 경로 설정 하면 끝
        
		System.out.println("test3");
		request.getRequestDispatcher("/board/views/readingMy.jsp").forward(request, response);
		
		System.out.println("FboardReadingMy 컨트롤러 테스트");

		return null;
	}

}

package com.oww.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.FboardDAO;
import com.oww.app.vo.FboardVO;

public class IndexFboardListOkController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		FboardDAO fboardDAO = new FboardDAO();
		
		List<FboardVO> fList =  fboardDAO.selectAll();
		
		//리스트가 잘 나오는지 확인하기 위한 for-each문
//		for(FboardVO f : fList) {
//			System.out.println(f);
//		}
		
		request.setAttribute("indexFboardList", fList);
		//이제 경로 설정 하면 끝
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		System.out.println("메인페이지 자유게시판 컨트롤러 테스트");

		return null;
	}

}

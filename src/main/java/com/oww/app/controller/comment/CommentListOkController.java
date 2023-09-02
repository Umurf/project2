package com.oww.app.controller.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.CommentDAO;
import com.oww.app.dto.CommentDTO;
import com.oww.app.dto.FboardDTO;
import com.oww.app.vo.CommentVO;
import com.oww.app.vo.FboardVO;


public class CommentListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		CommentDAO commentDAO = new CommentDAO();
		CommentDTO commentDTO = new CommentDTO();
		CommentVO commentVO = new CommentVO();
		FboardVO fboardVO = new FboardVO();
		FboardDTO fboardDTO = new FboardDTO();
		
		
		request.setAttribute("commentList", commentDAO.selectAll(commentVO.getFboardNumber()));
		//이제 경로 설정 하면 끝
		request.getRequestDispatcher("/board/project/readingFB.jsp").forward(request, response);
		
		System.out.println("CommentList 컨트롤러 테스트");

		return null;
	}
	
}

package com.oww.app.controller.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.UserDAO;

public class NoticeWriteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		System.out.println("test1");
		UserDAO userDAO = new UserDAO();
		HttpSession session = request.getSession();
		Integer userNumber = (Integer)session.getAttribute("userNumber");

		String path = null;

		System.out.println("test2");
        if (userNumber == null) {
        	//사용자 번호가 없으면 로그인 페이지로 이동하고, 사용자 번호가 있으면 글 작성 페이지로 이동합니다.
            path = "/member/project/login.jsp";
            //사용자 번호가 없으면 로그인 페이지로 이동
            System.out.println("test2-1");
            request.getRequestDispatcher(path).forward(request, response);
            return null;
        } else {
            path = "/board/project/writing.jsp";
            request.setAttribute("userNickname", userDAO.getUserNickname(userNumber));
            //사용자 번호가 있으면 글 작성 페이지로 이동
            System.out.println("test2-2");
        }
		Integer userLevel = Integer.parseInt(userDAO.getUserLevel(userNumber));
        
        System.out.println("test3");
        if(userNumber != null) {
            if(userLevel == 2) {
            	path = "/board/views/adminWriting.jsp";
            	request.setAttribute("userLevel", userDAO.getUserLevel(userNumber));
                System.out.println("test3-1");
            }else if(userLevel == 1){
            	path = "/board/project/freeBoard.jsp";
            	request.setAttribute("userLevel", userDAO.getUserLevel(userNumber));
                System.out.println("test3-2");
            } else {
                path = "/member/project/login.jsp";
                //사용자 번호가 있으면 글 작성 페이지로 이동
                System.out.println("test3-3");
            }
        }

        
        
        // 요청을 지정된 경로로 전달합니다.
        request.getRequestDispatcher(path).forward(request, response);
        System.out.println("test4");
        // 리턴 타입에 맞게 필요한 작업을 수행하세요.
        // 아래처럼 Result 객체를 생성하여 리턴하는 것이 일반적입니다.
        return new Result(); 
    	}
	}

package com.oww.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Result;

/**
 * Servlet implementation class OwwFrontController
 */
//@WebServlet("/OwwFrontController")
public class OwwFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwwFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("UTF-8");
	      doProcess(request, response);
	}

	   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      System.out.println(" 서블릿이 실행");
		      
		      //request.getContextPath()는 URL 루트 경로를 의미한다
		      System.out.println(request.getContextPath());
		      
		      //request.getRequestURI()는 현재 요청의 URI를 보여준다
		      System.out.println(request.getRequestURI());
		      
		      //전체 URI에서 ContextPath를 제외시킨 부분이 필요하다
		      String target = request.getRequestURI().substring(request.getContextPath().length());
		      System.out.println(target);
		      
		      //단순 값비교는 if문보다 switch문이 효율성이 좋고 가독성도 좋다
		      //break문을 꼭 써야한다!!
		      
	   }
}

package com.oww.app;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//인터페이스
public interface Execute {
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException;
	//추상메소드 로 통일화
}
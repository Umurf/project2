package com.oww.app.controller.fboard;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.FboardDAO;
import com.oww.app.dao.FuploadDAO;
import com.oww.app.dto.FuploadDTO;

public class FboardDeleteOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		FboardDAO fboardDAO = new FboardDAO();
//		FuploadDAO fuploadDAO = new FuploadDAO();
		int fboardNumber = Integer.valueOf(request.getParameter("fboardNumber"));
//		String uploadPath = request.getSession().getServletContext().getRealPath("/") + "upload";
		//db에서 지운 파일들은 실제로도 삭제되어야한다.
		//file객체에 넣고 delete를 하면되는데 파일이 저장된 실제 이름이 필요하므로
		// 쿼리를 날려 가져온다.
//		List<FuploadDTO> files = fuploadDAO.select(fboardNumber);

//				for(FileDTO file : files) {
//					File temp = new File(uploadPath, file.getFileSystemName());
//					if(temp.exists()) {
//						temp.delete();
//					}
//				}

//				스트림과 람다식
//		files.stream().map(file -> file.getFileSystemName())
//		.map(name -> new File(uploadPath, name))
//		.filter(tmp -> tmp.exists())
//		.forEach(tmp -> tmp.delete());
//			fileDAO.delete(boardNumber);
			fboardDAO.delete(fboardNumber);

			response.sendRedirect("/project/fboardListOk.fb");
			
		return null;
	}

}

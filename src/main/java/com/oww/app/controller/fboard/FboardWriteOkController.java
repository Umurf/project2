package com.oww.app.controller.fboard;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.FboardDAO;
import com.oww.app.dto.FboardDTO;

public class FboardWriteOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
    	System.out.println("test01");
        FboardDAO fboardDAO = new FboardDAO();
        FboardDTO fboardDTO = new FboardDTO();
        Result result = new Result();
        System.out.println("test02");
        // 현재 시간을 Timestamp로 얻기
        Timestamp currentTime = new Timestamp(new Date().getTime());

        // 요청에서 게시판 제목, 내용, 사용자 번호, 게시물 카운트, 작성일을 얻어와 DTO에 설정
        fboardDTO.setFboardTitle(request.getParameter("fboardTitle"));
        
        System.out.println("Request get fboard Title"+ request.getParameter("fboardTitle"));
        
        
        fboardDTO.setFboardContent(request.getParameter("fboardContent"));
        fboardDTO.setUserNumber((Integer) request.getSession().getAttribute("userNumber"));
//      fboardDTO.setFboardCount((Integer) request.getSession().getAttribute("fboardCount"));
        fboardDTO.setFboardCount(1);
        fboardDTO.setFboardDate(currentTime);
        
        System.out.println(fboardDTO.toString());
        
        
        
        
        System.out.println("test03");
        // 게시물 작성일을 문자열로부터 파싱하여 설정
        String fboardDateStr = request.getParameter("fboardDate");
        if (fboardDateStr != null && !fboardDateStr.isEmpty()) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date parsedDate = dateFormat.parse(fboardDateStr);
                Timestamp fboardDate = new Timestamp(parsedDate.getTime());
                fboardDTO.setFboardDate(fboardDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        System.out.println("test04");
        // DTO 내용 출력 (디버깅용)
        

        // 게시물을 데이터베이스에 삽입
        fboardDAO.insert(fboardDTO);
        System.out.println("test05");
        // 리다이렉트 설정
        result.setRedirect(true);
        response.sendRedirect(request.getContextPath() + "/project/fboardListOk.fb");

        return null;
    }
}

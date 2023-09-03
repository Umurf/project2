package com.oww.app.controller.notice;

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
import com.oww.app.dao.NoticeDAO;
import com.oww.app.dto.NoticeDTO;

public class NoticeWriteOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
    	System.out.println("test01");
        NoticeDAO noticeDAO = new NoticeDAO();
        NoticeDTO noticeDTO = new NoticeDTO();
        Result result = new Result();
        Timestamp currentTime = new Timestamp(new Date().getTime());
        System.out.println("test02");
        

        noticeDTO.setUserNumber((Integer) request.getSession().getAttribute("userNumber"));
        
//        noticeDTO.setNoticeTitle(request.getParameter("noticeTitle"));
        request.setAttribute("noticeTitle", noticeDTO.getNoticeTitle());
        System.out.println("Request get Notice Title"+ request.getParameter("noticeTitle"));
        
//        noticeDTO.setNoticeContent(request.getParameter("noticeContent"));
        request.setAttribute("noticeContent", noticeDTO.getNoticeContent());
        System.out.println("Request get Notice Content"+ request.getParameter("noticeContent"));
        
        noticeDTO.setNoticeDate(currentTime);
        
        noticeDTO.setNoticeCount(1);

        System.out.println(noticeDTO.toString());
        
        System.out.println("test03");

        
        String noticeDateStr = request.getParameter("noticeDate");
        if (noticeDateStr != null && !noticeDateStr.isEmpty()) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date parsedDate = dateFormat.parse(noticeDateStr);
                Timestamp noticeDate = new Timestamp(parsedDate.getTime());
                noticeDTO.setNoticeDate(noticeDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        System.out.println("test04");
        
        System.out.println(noticeDTO.toString());
        
        // 게시물을 데이터베이스에 삽입
        noticeDAO.insert(noticeDTO);
        System.out.println("test05");
        
        
        
        // 리다이렉트 설정
        result.setRedirect(true);
        result.setPath(request.getContextPath());

        return null;
    }
}
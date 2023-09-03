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
       System.out.println("write Ok --------------------");
        NoticeDAO noticeDAO = new NoticeDAO();
        NoticeDTO noticeDTO = new NoticeDTO();
        Result result = new Result();
        System.out.println("test02");
        // 현재 시간을 Timestamp로 얻기
        Timestamp currentTime = new Timestamp(new Date().getTime());

        // 요청에서 게시판 제목, 내용, 사용자 번호, 게시물 카운트, 작성일을 얻어와 DTO에 설정
        System.out.println();
        noticeDTO.setNoticeTitle(request.getParameter("noticeTitle"));
        
        System.out.println("Request get Notice Title"+ request.getParameter("noticeTitle"));
        
        
        noticeDTO.setNoticeContent(request.getParameter("noticeContent"));
        noticeDTO.setUserNumber((Integer) request.getSession().getAttribute("userNumber"));
//        fboardDTO.setFboardCount((Integer) request.getSession().getAttribute("fboardCount"));
        noticeDTO.setNoticeCount(1);
        noticeDTO.setNoticeDate(currentTime);
        
        System.out.println(noticeDTO.toString());
        
        
        System.out.println("test03");
        // 게시물 작성일을 문자열로부터 파싱하여 설정
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
        // DTO 내용 출력 (디버깅용)
        

        // 게시물을 데이터베이스에 삽입
        noticeDAO.insert(noticeDTO);
        System.out.println("test05");
        // 리다이렉트 설정
        result.setRedirect(true);
     /*   글 목록으로 갈지 경로 설정, getRedirection으로 가지고 와서 전달해주시면 됩니다 */
        result.setPath(request.getContextPath() + "/project/noticeListOk.no");
     
        return null;
    }
}
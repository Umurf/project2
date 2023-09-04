package com.oww.app.controller.notice;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.ParamPart;
import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.NoticeDAO;
import com.oww.app.dto.NoticeDTO;

public class NoticeUpdateOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("test01");
        // FboardDAO와 FboardDTO 객체를 생성합니다.
        NoticeDAO noticeDAO = new NoticeDAO();
        NoticeDTO noticeDTO = new NoticeDTO();
        Result result = new Result();
        System.out.println("test02");
        // 현재 시간을 Timestamp로 얻습니다.
        Timestamp currentTime = new Timestamp(new Date().getTime());

        // 요청에서 게시판 제목, 내용, 사용자 번호, 게시물 카운트, 작성일을 얻어와 DTO에 설정합니다.
        
        // fboardDTO.toString() 메서드를 호출하여 DTO 내용을 출력합니다.
        System.out.println(noticeDTO.toString());
        
        System.out.println("test03");
        // 게시물 작성일을 문자열로부터 파싱하여 설정합니다.
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
        
        // 무한 루프를 시작합니다.
        while (true) {
            // ParamPart를 가져오고 파라미터명과 값을 얻어옵니다.
        	ParamPart paramPart = (ParamPart) request.getPart("yourPartNameHere");
            String param = paramPart.getName(); // 파라미터명
            String value = paramPart.getStringValue(); // 값
            System.out.println(param + " : " + value);

            // 파라미터명에 따라 DTO에 값을 설정합니다.
            if (param.equals("noticeTitle")) {
            	noticeDTO.setNoticeTitle(value);
            } else if (param.equals("noticeContent")) {
            	noticeDTO.setNoticeContent(value);
            } else if (param.equals("noticeNumber")) {
                // jsp에서 hidden으로 추가해서 boardNumber 가져와야 함
                int noticeNumber = Integer.valueOf(value);
                noticeDTO.setNoticeNumber(noticeNumber);
            }

            // 게시글 제목과 내용이 null이 아닌 경우에만 진행합니다.
            if (noticeDTO.getNoticeTitle() == null || noticeDTO.getNoticeContent() == null) {
                continue;
            }

            // 세션에서 사용자 번호를 얻어와 DTO에 설정합니다.
            noticeDTO.setUserNumber((Integer) request.getSession().getAttribute("userNumber"));
            
            // 게시물을 업데이트합니다.
            noticeDAO.update(noticeDTO);
            
            // 게시물을 데이터베이스에 삽입합니다.
            noticeDAO.insert(noticeDTO);
            System.out.println("test05");
            
            // 리다이렉트 설정
            result.setRedirect(true);
            result.setPath(request.getContextPath());

            return null;
        }
    }
}

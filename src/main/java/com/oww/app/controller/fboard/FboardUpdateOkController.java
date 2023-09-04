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

public class FboardUpdateOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("test01");
        Result result = new Result();
        
        System.out.println("FboardUpdateOkController 실행 시작");
        
        // 게시물 업데이트 및 삽입에 필요한 데이터를 받아옵니다.
        String fboardTitle = request.getParameter("fboardTitle");
        String fboardContent = request.getParameter("fboardContent");
        String fboardNumberStr = request.getParameter("fboardNumber");
        Timestamp currentTime = new Timestamp(new Date().getTime());
        
        // 필요한 DTO 객체를 생성하고 값 설정합니다.
        FboardDTO fboardDTO = new FboardDTO();
        fboardDTO.setFboardTitle(fboardTitle);
        fboardDTO.setFboardContent(fboardContent);
        fboardDTO.setFboardDate(currentTime);
        
        // fboardNumber 처리
        if (fboardNumberStr != null && !fboardNumberStr.isEmpty()) {
            int fboardNumber = Integer.parseInt(fboardNumberStr);
            fboardDTO.setFboardNumber(fboardNumber);
        }
        
        // 게시물 작성일을 문자열로부터 파싱하여 설정합니다.
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
        
        // 세션에서 사용자 번호를 얻어와 DTO에 설정합니다.
        Integer userNumber = (Integer) request.getSession().getAttribute("userNumber");
        if (userNumber != null) {
            fboardDTO.setUserNumber(userNumber);
        }
        
        System.out.println("데이터 설정 완료: " + fboardDTO.toString());
        
        // FboardDAO를 사용하여 게시물 업데이트 및 삽입을 수행합니다.
        FboardDAO fboardDAO = new FboardDAO();
        fboardDAO.update(fboardDTO);
        
        // 리다이렉트 설정
//        result.setRedirect(true);
//        result.setPath(request.getContextPath() +"/board/views/fboardReadOk.fb?fboardNumber");
        
        //프론트에서 result문을 if로 사용하지 않으므로 위의 2코드는 의미가 없고 아래와 같이 sendRedirect를 사용하여 위의 기능이 완료되고 이동할 페이지를 넣어준다
        //fboardNumber를 가지고 가야하므로 뒤에 fboardNumber="+fboardNumberStr 를 추가해준다
        response.sendRedirect(request.getContextPath() + "/board/views/fboardReadOk.fb?fboardNumber="+fboardNumberStr);
        
        System.out.println("FboardUpdateOkController 종료");
        
        return result;
    }
}
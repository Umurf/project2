package com.oww.app.controller;

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
import com.oww.app.dao.UserDAO;
import com.oww.app.dto.UserDTO;

public class JoinOkController implements Execute {
    
    public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        UserDAO userDAO = new UserDAO();
        UserDTO userDTO = new UserDTO();
        Result result = new Result();
        
        // Set other fields in userDTO
        
        Timestamp currentTime = new Timestamp(new Date().getTime());
        //현재 시간 가져오기
        

        userDTO.setUserEmail(request.getParameter("userEmail"));
        userDTO.setUserPassword(request.getParameter("userPassword"));
        userDTO.setUserNickname(request.getParameter("userNickname"));
        userDTO.setUserDate(currentTime);
        // userDate 필드 설정

        // userDate 문자열을 타임스탬프로 변환
        String userDateStr = request.getParameter("userDate");
        //사용자가 회원 가입 시 입력한 userDate 파라미터 값을 가져와서 userDateStr 변수에 저장합니다.
        if (userDateStr != null && !userDateStr.isEmpty()) {
        //userDateStr이 null이 아니고 비어있지 않을 때의 조건을 확인합니다.
        //즉, 사용자가 가입일자를 입력한 경우에만 해당 조건을 만족합니다.
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //사용자가 입력한 userDate 문자열을 가져온 후, 해당 문자열을 SimpleDateFormat을 이용하여 Timestamp 객체로 변환
                Date parsedDate = dateFormat.parse(userDateStr);
                //사용자가 입력한 userDateStr 문자열을 위에서 생성한 날짜 형식으로 파싱하여 Date 객체로 변환합니다.
                Timestamp userDate = new Timestamp(parsedDate.getTime());
                //parsedDate에서 얻은 Date 객체의 시간 값을 가져와서 이를 이용하여 Timestamp 객체를 생성합니다.
                //사용자가 입력한 날짜와 시간 정보가 Timestamp 형태로 저장됩니다.
                userDTO.setUserDate(userDate);
                //userDate를 userDTO의 userDate 필드에 설정
                //사용자의 가입일자를 userDTO 객체에 저장
            } catch (ParseException e) {
            	//날짜 형식 변환 예외처리
                e.printStackTrace();
            }
        }
        
        userDTO.setUserLevel('1');
        //userDTO 객체의 userLevel 필드에는 '1'을 기본 사용자 레벨로 설정
        
        System.out.println(userDTO);
        
        userDAO.join(userDTO);
        
        result.setRedirect(true);
        result.setPath(request.getContextPath());
        
        return null;
    }
}

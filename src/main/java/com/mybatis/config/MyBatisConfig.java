package com.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//여기서는 팩토리를 만들어 줄 예정 이다.
public class MyBatisConfig {
	
	//sqlSession을 만들기 위해 세션 팩토리가 필요하다.
	private static SqlSessionFactory sqlSessionFactory;
	
	//설정파일 초기화 블록
	static {
		try {
			// try 구문 안에는 설정파일의 경로를 저장한다.
			String resource = "./com/mybatis/config/config.xml";
			
			//Resources클래스를 이용, 리소르를 읽어들여 Reader 객체로 만든다(읽기 위한 객체)
			Reader reader = Resources.getResourceAsReader(resource);
			
			//세션 팩토리 빌더에게 팩토리를 지어달라고 한다.(설계도가 필요하고 설계도는 reader라는 객체가 가지고 있다)
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			//여기 까지가 공장을 지어줘! 가 완료 된다!
		}catch(IOException e) {
			System.out.println("MyBatisConfig.java 초기화 문제 발생");
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
				
	}
	
}
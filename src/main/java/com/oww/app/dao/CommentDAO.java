package com.oww.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.oww.app.vo.CommentVO;

public class CommentDAO {
	public SqlSession sqlSession;
	
	public CommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<CommentVO> selectAll(int fboardNumber){
		return sqlSession.selectList("comment.selectAll", fboardNumber);
	}
}

package com.oww.app.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.oww.app.vo.NoticeVO;

public class NoticeDAO {
	public SqlSession sqlSession;
	
	public NoticeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<NoticeVO> selectAll(){
		return sqlSession.selectList("notice.selectAll");
	}
	public List<NoticeVO> selectPage(Map<String, Integer> pageMap) {
		return sqlSession.selectList("notice.selectPage", pageMap);
	}
	
	public int getTotalCount() {
	    return sqlSession.selectOne("notice.getTotalCount");
	}

}
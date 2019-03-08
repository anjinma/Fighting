package com.first.begin.mapper;

import java.util.List;

import com.first.begin.domain.Member;

public interface MemberMapper {

	public List<Member> getList();
	
	public void insert(Member member);
	
	public void insertSelectKey(Member member);
	
	public Member read(int mno);
	
	public int delete(int mno);
	// return type int로 하는 이유 테이블에 존재하는 번호의 데이터라면 1리턴 없는 번호라면 0
	
	public int update(Member member);
	// 이것 또한 몇개의 데이터가 수정되었는가?? 거의 1아님 0 리턴
	
	public Member readById(String id);
}

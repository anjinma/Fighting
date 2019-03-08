package com.first.begin.service;

import java.util.List;

import com.first.begin.domain.Member;

public interface MemberService {
	
	public void register(Member member);//Create
	
	public Member get(int mno);//Read
	
	public boolean modify(Member member);//Update
	
	public boolean remove(int mno);//Delete
	
	public List<Member> getList();
	
	public Member getById(String id);
}

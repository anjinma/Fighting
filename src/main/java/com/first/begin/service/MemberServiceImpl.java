package com.first.begin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.begin.domain.Member;
import com.first.begin.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public List<Member> getList() {
		
		return mapper.selectList();
	}

}

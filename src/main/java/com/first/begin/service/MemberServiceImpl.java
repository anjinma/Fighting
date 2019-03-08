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
	public void register(Member member) {
		mapper.insertSelectKey(member);
		// 필요하다면 insertSelectKey에서 반환되는 mno값을 받아서 사용할 수있다.!!
	}

	@Override
	public Member get(int mno) {
		return mapper.read(mno);
	}

	@Override
	public boolean modify(Member member) {
		return mapper.update(member)==1;
		// 1이면 변경된거, 0이면 안된거!
	}

	@Override
	public boolean remove(int mno) {
		return mapper.delete(mno)==1;
	}

	@Override
	public List<Member> getList() {
		return mapper.getList();
	}

	@Override
	public Member getById(String id) {
		return mapper.readById(id);
	}

}

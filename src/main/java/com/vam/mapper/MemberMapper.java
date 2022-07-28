package com.vam.mapper;

import org.apache.ibatis.annotations.Select;

import com.vam.model.MemberVO;


public interface MemberMapper {
	
	//회원가입
	public void memberJoin(MemberVO member)throws Exception;

	 /* 아이디 중복 검사  */
	public int idCheck(String id)throws Exception;
	
	/* 로그인 */
	@Select("select memberId, memberName, adminck, money, point from book_member where memberId = #{memberId} and memberPw = #{memberPw}")
	public MemberVO memberLogin(MemberVO member) throws Exception;
	

}

package com.vam.mapper;

import org.apache.ibatis.annotations.Select;

public interface TImeMaper {
	@Select("SELECT sysdate() FROM dual")
	public String getTime();
}

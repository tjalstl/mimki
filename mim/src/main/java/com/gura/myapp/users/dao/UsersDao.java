package com.gura.myapp.users.dao;

import com.gura.myapp.users.dto.UsersDto;

public interface UsersDao {
	public boolean isExist(String inputId);
	public void insert(UsersDto dto);
	public UsersDto getData(String id);
	public void delete(String id);
	public void update(UsersDto dto);
	public void updatePwd(UsersDto dto);
	public UsersDto getImg(String id);
}

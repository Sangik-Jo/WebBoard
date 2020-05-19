package com.web.board.service;

import java.util.List;

import com.web.board.vo.UsersVO;

public interface UsersService {

	//���� ������ ����ϴ� �޼���
	void insertUsers(UsersVO vo);
	
	UsersVO selectUsers(UsersVO vo);
	
	void updateUsers(UsersVO vo);
	
	void deleteUsers(UsersVO vo);
	
	//������
	void deleteUsers(List<UsersVO> userList);
	
	List<UsersVO> selectAllUsers();
	
}

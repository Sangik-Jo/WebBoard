package com.web.board.service;

import java.util.List;

import com.web.board.vo.BoardVO;

public interface BoardService {
	
	void insertBoard(BoardVO vo);
	
	BoardVO selectBoard(BoardVO vo);
	
	int boardTotalCount();
	
	//BoardVO �ȿ� ��������, �˻�����, �˻�Ű���带 �����Ͽ� vo�� �ް�
	//����¡�� �ʿ��� Limit ���� ����Row�� start ������ �Ҵ�
	//����¡�� �ʿ��� Limit ���� ũ�⸦ size ������ �Ҵ�
	List<BoardVO> selectAllBoard(BoardVO vo, int start, int size);
	
	void updateBoard(BoardVO vo);
	
	void deleteBoard(BoardVO vo);
}

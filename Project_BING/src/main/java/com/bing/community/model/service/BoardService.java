package com.bing.community.model.service;

import java.util.List;

import com.bing.community.model.dto.Board;

public interface BoardService {
	// 모든 게시글 조회
	List<Board> getBoardList();
	
	// 게시글 하나 조회
	Board getBoard(int id);
	
	// 게시글 등록
	int registBoard(Board board);
	
	// 게시글 수정
	int modifyBoard(Board board);
	
	// 게시글 삭제
	int removeBoard(int id);
}

package kr.book.mapper;

import java.util.List;


import kr.book.domain.BookVO;

public interface BookMapper {
	
	public List<BookVO> bookList();

	public int bookInsert(BookVO vo);
}

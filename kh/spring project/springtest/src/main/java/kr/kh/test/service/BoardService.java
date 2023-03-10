package kr.kh.test.service;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import kr.kh.test.pagination.Criteria;
import kr.kh.test.vo.BoardTypeVO;
import kr.kh.test.vo.BoardVO;
import kr.kh.test.vo.FileVO;
import kr.kh.test.vo.MemberVO;

public interface BoardService {

	ArrayList<BoardTypeVO> getBoardType(MemberVO user);

	boolean insertBoard(BoardVO board, MemberVO user, MultipartFile[] files);

	ArrayList<BoardVO> boardList(Criteria criteria);

	int getBoardToalCount(Criteria criteria);

	BoardVO getBoardAndUpdateView(int bo_num);

	ArrayList<FileVO> getFileList(int bo_num);

	boolean deleteBoard(Integer bo_num, MemberVO user);

	BoardVO getBoard(int bo_num);


}

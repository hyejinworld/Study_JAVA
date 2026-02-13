package ex0212.board;

import java.util.List;

public class QaBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		// TODO Auto-generated method stub
		System.out.println("QaBoardServieImpl 의 insert call");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("QaBoardServieImpl 의 update call");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println("QaBoardServieImpl 의 selectByNo call");
		return new QaBoard(10, "연습중", "도훈", "재밌다", false);
	}
//	@Override
//	public List<Board> selectAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

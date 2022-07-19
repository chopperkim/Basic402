package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import chapter20.memo.MemoDAO;
import chapter20.memo.MemoVO;

class MyTest {
	MemoDAO dao = new MemoDAO();
//	@Test
	void memoSelectList() throws Exception {
		List<MemoVO> list = dao.selectList();
		assertEquals(1, list.size());
	}
//	@Test
	void memoSelectOne() throws Exception {
		MemoVO vo = dao.selectOne(0);
		assertNull(vo);
	}

//	@Test
	void insert() throws Exception {
		MemoVO vo = new MemoVO();
		vo.setTitle("두번째 메모");
		vo.setContents("곧 점심시간이다~");
		int insertMemo = dao.insertMemo(vo);
		assertEquals(1, insertMemo);
		assertEquals(4, dao.selectList().size());
	}
	
//	@Test
	void update() throws Exception {
		MemoVO vo = new MemoVO();
		vo.setId(4);
		vo.setTitle("오늘은 화요일");
		vo.setContents("9시 45분이 지났다.");
		
		MemoVO memo = dao.selectOne(4);
		assertNull(memo.getModifyDate());
		
		dao.updateMemo(vo);
		
		memo = dao.selectOne(4);
		
		assertEquals(vo.getTitle(), memo.getTitle());
		assertNotNull(memo.getModifyDate());
	}

	@Test
	void delete() throws Exception {
		dao.deleteMemo(2);
		assertEquals(3, dao.selectList().size());
	}
}

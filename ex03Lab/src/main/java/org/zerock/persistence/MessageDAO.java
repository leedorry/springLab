package org.zerock.persistence;

import org.zerock.domain.MessageVO;

public interface MessageDAO {
	
	// 인터페이스 구성멤버
	// 1. 상수
	// 2. 추상 메소드
	// 3. 디폴트 메소드
	// 4. 정적(static) 메소드
	
  public void create(MessageVO vo) throws Exception;

  public MessageVO readMessage(Integer mid) throws Exception;

  public void updateState(Integer mid) throws Exception;

}

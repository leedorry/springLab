package org.zerock.persistence;

import org.zerock.domain.MessageVO;

public interface MessageDAO {
	
	// �������̽� �������
	// 1. ���
	// 2. �߻� �޼ҵ�
	// 3. ����Ʈ �޼ҵ�
	// 4. ����(static) �޼ҵ�
	
  public void create(MessageVO vo) throws Exception;

  public MessageVO readMessage(Integer mid) throws Exception;

  public void updateState(Integer mid) throws Exception;

}

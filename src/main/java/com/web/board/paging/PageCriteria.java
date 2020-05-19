package com.web.board.paging;

public class PageCriteria {
	private int page; //���� ������
	private int pageSize; // ���������� ǥ�õ� �Խñ��� ��
	
	public int getPageStart() {
		return (this.page - 1) * this.pageSize;
	}
	
	//�⺻������ ����
	//�⺻ ��ü ������ �ʱⰪ�� �����Ѵ� (1 ���������� 10��)
	public PageCriteria() {
		this.page = 1; // ����ڰ� ���� �������� ������ 1
		this.pageSize = 10; // �������� 10���� ���
	}

	//���� �������� getter, setter
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		//������� URL���� �Է� �� �߸��� �������� �̵��� �������� 1�� �缳��
		if(page < 1) {
			this.page = 1;
		} else {
			this.page = page;
		}
	}
	
	//������ �������� getter, setter
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
			this.pageSize = 10;
	}
}

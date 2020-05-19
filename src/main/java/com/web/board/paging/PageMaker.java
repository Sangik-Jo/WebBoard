package com.web.board.paging;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {
	private PageCriteria pc; // page, pageSize�� �����ϴ� Ŭ������ �ʵ庯���� ����
	private int totalCount; // ��ü �Խñ��� ��
	private int startBlock; // �������� ����� ���� ��ȣ
	private int endBlock; // �������� ����� ������ ��ȣ
	private boolean prev; // ������ư�� ���� �� �ִ��� ����
	private boolean next; // ������ư�� ���� �� �ִ��� ����
	private int blockSize = 10; // ȭ���ϴܿ� �������� ����� ����
	private int totalBlock;
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData(); //��ü �ʵ� ������ ����
					 //��ü �Խñ� ���� setter�� ȣ��� �� ��ü ���õǵ��� ��
	}
	
	private void calcData() {
		endBlock = (int)(pc.getPage() / (double)blockSize) * blockSize;
		startBlock = (endBlock - blockSize) + 1;
		this.totalBlock =  (int) (totalCount / (double) pc.getPageSize());
		
		if(endBlock > totalBlock) {
			endBlock = totalBlock;
		}
		
		//1 �������� ��� ����(false)  
		prev = startBlock == 1 ? false : true;
		next = endBlock * pc.getPageSize() >= totalCount ? false : true;
	}
	
	// jsp���� ����¡ ó���� ����
	// �������� ���� a�±׸� �̿��ؼ� href ��ũ�� �����ϴ� URL��� ������ ���� ���������� �����ϴ� UriCommponent��ü�� Ȱ��
	public String makeQuery(int page) {
		UriComponents uriComponent = UriComponentsBuilder.newInstance().queryParam("page", page).queryParam("pageSize", pc.getPageSize()).build();
		return uriComponent.toString();
		
		//return "?page=" + page + "&pageSize=" + pc.getPageSize();
	}

	
	public PageCriteria getPc() {
		return pc;
	}

	public void setPc(PageCriteria pc) {
		this.pc = pc;
	}

	public int getStartBlock() {
		return startBlock;
	}

	public void setStartBlock(int startBlock) {
		this.startBlock = startBlock;
	}

	public int getEndBlock() {
		return endBlock;
	}

	public void setEndBlock(int endBlock) {
		this.endBlock = endBlock;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}

	public int getTotalBlock() {
		return totalBlock;
	}

	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}

	public int getTotalCount() {
		return totalCount;
	}

	@Override
	public String toString() {
		return "PageMaker [pc=" + pc + ", totalCount=" + totalCount + ", startBlock=" + startBlock + ", endBlock="
				+ endBlock + ", prev=" + prev + ", next=" + next + ", blockSize=" + blockSize + ", totalBlock="
				+ totalBlock + "]";
	}
}

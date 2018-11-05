package com.my.common;

import java.util.List;

public class Page<T> {

	private int page;
	private int size;
	private int totalElement;
	private int totalPage;
	private List<T> items;
	
	public Page() {}

	public Page(int page, int size) {
		super();
		this.page = page;
		this.size = size;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTotalElement() {
		return totalElement;
	}

	public void setTotalElement(int totalElement) {
		this.totalElement = totalElement;
	}

	public int getTotalPage() {
		return (totalElement - 1)/size + 1;
	}

	public void setTotalPage() {
		this.totalPage = (totalElement - 1)/size + 1;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Page [page=" + page + ", size=" + size + ", totalElement=" + totalElement + ", totalPage=" + totalPage
				+ ", items=" + items + "]";
	}
	
	
}

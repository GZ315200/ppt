package com.my.common.entity;

import java.util.List;

import com.my.entity.Employee;

/**
 * @author 丫丫 分页模型
 */
public class Page<T> {
	private int page;// 当前查询的页数
	private int size;// 每页显示的数据量（行数）
	private int totalElement;// 总数据量
	private int totalPage;// 总共多少页
	private List<Employee> items;// 接收当前页中查询到的数据

	public Page() {
	}
	public Page(int page, int size) {
		this.page = page;
		this.size = size;
	}
	public Page(int page, int size, int totalElement, int totalPage, List<Employee> items) {
		this.page = page;
		this.size = size;
		this.totalElement = totalElement;
		this.totalPage = totalPage;
		this.items = items;
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
		return (totalElement-1)/size+1;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = (totalElement-1)/size+1;
	}

	public List<Employee> getItems() {
		return items;
	}

	public void setItems(List<Employee> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Page [page=" + page + ", size=" + size + ", totalElement=" + totalElement + ", totalPage=" + totalPage
				+ ", items=" + items + "]";
	}

}

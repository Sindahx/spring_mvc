package com.dffx.pager;

import java.util.List;

public class PageModel<T> {
	public static final String ORDER_ASC = "asc";
	public static final String ORDER_DESC = "desc";
	 // 总记录数
	private int total;
	// 当前页的记录集
	private List<T> datas;
	// 每页多少条数据
	private int pageSize = 15;  // 默认15
	// 第几页
	private int pageNo = 1;     // 默认第1页
	//第几行开始
	private int start = 0;      // 默认0开始
	
	private int totalPages;
	
	private String sort; //排序字段
	private String order; //排序规则
	
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	//查询条件对象
	private Object condition;
	
	public Object getCondition() {
		return condition;
	}
	public void setCondition(Object condition) {
		this.condition = condition;
	}
	public PageModel() {
		
	}
	public int getStart() {		
		this.start = (this.pageNo-1)*this.pageSize;
		return this.start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public PageModel(int pageNo, int pageSize) {
		this.pageNo = pageNo<1?1:pageNo;
		this.pageSize = pageSize<1?15:pageSize;
	}
	//求总页数
	public int getTotalPages() {
		this.totalPages = (this.total + pageSize - 1) / pageSize;
		if(pageNo>totalPages){
			pageNo=totalPages<=0?1:totalPages;
		}
		return totalPages;
	}
	
	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}
	//首页
	public int getTopPage() {
		return 1;
	}
	//末页
	public int getBottomPage() {
		return this.getTotalPages() == 0 ? 1 : this.getTotalPages();
	}
	//上一页
	public int getUpPage() {
		if(this.pageNo <= 1) {
			return 1;
		}
		return this.pageNo - 1;
	}
	
	//下一页
	public int getNextPage() {
		if(this.pageNo >= this.getTotalPages()) {
			return (this.getTotalPages() == 0 ? 1 : this.getTotalPages());
		}
		return pageNo + 1;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize<1?15:pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo<1?1:pageNo;
	}

	@SuppressWarnings("unchecked")
	public List getDatas() {
		return datas;
	}

	@SuppressWarnings("unchecked")
	public void setDatas(List datas) {
		this.datas = datas;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		
		return "[pageNo: " + this.pageNo
		+ "] [pageSize: " + this.pageSize
		+ "] [total：" + this.total
		+ "] ";
	}
	
}

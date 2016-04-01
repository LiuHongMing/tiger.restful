package com.tiger.restful.dao.util;

import java.io.Serializable;

/**
 * 分页信息.
 *
 * @author lxm
 */
public class Page implements Serializable {
	
	/** 总页数. */
    private int totalPage; 
	
	/** 总记录数. */
    private int totalCount; 
	
	/** 当前页,默认第一页. */
    private int currentPage = 1; 
	
	/** 分页条数，默认显示二十条. */
    private int showCount = 20; 
	
	/** 排序列名. */
    private String sortName; 
	
	/** 排序状态. */
    private String sortState; 
	
	/** 当前记录起始索引. */
    private int currentResult; 

    /**
     * 构造方法-----分页基本信息，并排序
     * @param currentPage 当前页
     * @param showCount 分页条数
     * @param sortName 排序列名
     * @param sortState 排序状态
     */
    public Page(Integer currentPage, Integer showCount, String sortName, String sortState) {

        if (currentPage != null) 
            this.currentPage = currentPage;
        
        if (showCount != null) 
            this.showCount = showCount;
        
        this.sortName = sortName;
        this.sortState = sortState;
    }

    /**
     * 构造方法-----分页基本信息
     * @param currentPage 当前页
     * @param showCount 分页条数
     */
    public Page(Integer currentPage, Integer showCount) {
    	
        if (currentPage != null) 
            this.currentPage = currentPage;

        if (showCount != null) 
            this.showCount = showCount;
    }

    /**
     * 构造方法
     */
    public Page() {
        this(null, null);
    }

    /**
     * 获取--- 总页数.
     *
     * @return the 总页数
     */
    public int getTotalPage() {

        if (totalCount % showCount == 0) {
            totalPage = totalCount / showCount;
        } else {
            totalPage = totalCount / showCount + 1;
        }

        return totalPage;
    }

    /**
     * 设置--- 总页数.
     *
     * @param totalPage the new 总页数
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 获取--- 总记录数.
     *
     * @return the 总记录数
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 设置--- 总记录数.
     *
     * @param totalCount the new 总记录数
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 获取--- 当前页,默认第一页.
     *
     * @return the 当前页,默认第一页
     */
    public int getCurrentPage() {

        if (currentPage <= 0) {
            currentPage = 1;
        }

        // 控制请求页数大于总页数的情况
        if (currentPage > getTotalPage()) {
            currentPage = getTotalPage();
        }

        return currentPage;
    }

    // monggoService使用了，获取聊天记录时
    /**
     * Gets the current page no sql.
     *
     * @return the current page no sql
     */
    public int getCurrentPageNoSql() {

        if (currentPage <= 0) {
            currentPage = 1;
        }

        return currentPage;
    }

    /**
     * 设置--- 当前页,默认第一页.
     *
     * @param currentPage the new 当前页,默认第一页
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 获取--- 分页条数，默认显示二十条.
     *
     * @return the 分页条数，默认显示二十条
     */
    public int getShowCount() {
        return showCount;
    }

    /**
     * 设置--- 分页条数，默认显示二十条.
     *
     * @param showCount the new 分页条数，默认显示二十条
     */
    public void setShowCount(int showCount) {
        this.showCount = showCount;
    }

    /**
     * 获取--- 排序列名.
     *
     * @return the 排序列名
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * 设置--- 排序列名.
     *
     * @param sortName the new 排序列名
     */
    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    /**
     * 获取--- 排序状态.
     *
     * @return the 排序状态
     */
    public String getSortState() {
        return sortState;
    }

    /**
     * 设置--- 排序状态.
     *
     * @param sortState the new 排序状态
     */
    public void setSortState(String sortState) {
        this.sortState = sortState;
    }

    /**
     * 获取--- 当前记录起始索引.
     *
     * @return the 当前记录起始索引
     */
    public int getCurrentResult() {
        currentResult = (getCurrentPage() - 1) * getShowCount();
        if (currentResult < 0)
            currentResult = 0;
        return currentResult;
    }

    /**
     * 设置--- 当前记录起始索引.
     *
     * @param currentResult the new 当前记录起始索引
     */
    public void setCurrentResult(int currentResult) {
        this.currentResult = currentResult;
    }

}

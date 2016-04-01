package com.tiger.restful.dao.util;

import java.util.List;

public class PageBuilder {

    private static int PAGE_ROW = 10;

    private Page page;
    private PageList pageList;

    public PageBuilder() {
        this.page = new Page();
        this.pageList = new PageList();
    }

    /**
     * 构造Page实例
     *
     * @param currentPage
     * @param rows
     * @return
     */
    public Page build(Integer currentPage, Integer rows) {
        if (currentPage == null) return all();
        if (page == null) {
            page = new Page(currentPage, rows == null ? PAGE_ROW : rows);
            return page;
        }
        page.setCurrentPage(currentPage);
        page.setShowCount(rows);
        return page;
    }

    private static Page all() {
        return new Page(1, Integer.MAX_VALUE);
    }

    /**
     * 构造PageList实例
     *
     * @param e
     * @param <E>
     * @return
     */
    public <E> PageList<E> list(List<E> e) {
        return list(e, page.getTotalCount(), page.getTotalPage());
    }

    /**
     * 构造PageList实例
     *
     * @param e
     * @param totalCount
     * @param totalPage
     * @param <E>
     * @return
     */
    public <E> PageList<E> list(List<E> e, int totalCount, int totalPage) {
        PageList<E> pageList = new PageList<>();
        pageList.setList(e);
        pageList.setTotalCount(totalCount);
        pageList.setTotalPage(totalPage);
        return pageList;
    }
}

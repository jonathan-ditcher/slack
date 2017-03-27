package com.ditcherj.slack.dto;

/**
 * Created by jon on 27/03/2017.
 */
public class Paging {

    private Integer count;
    private Integer total;
    private Integer page;
    private Integer pages;

    public Paging() {
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "count=" + count +
                ", total=" + total +
                ", page=" + page +
                ", pages=" + pages +
                '}';
    }
}

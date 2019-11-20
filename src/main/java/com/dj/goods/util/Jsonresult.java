package com.dj.goods.util;
/**
 * 
 * @author tengzhq
 *
 * @param <T>
 */
public class Jsonresult<T> {
    
    public static final int SUCCESS = 1;
    
    public static final int FALL = 2;
    
    /**
     * 1 成功
     * 2 失败
     */
    private int flag;
    
    /**
     * 返回状态说明
     */
    private String msg;
    /**
     * 返回具体数据
     */
    private T info;
    
    /**
     * 总数
     */
    private int total;

    public int getFlag() {
        return flag;
    }

    public Jsonresult(int flag, String msg, T info, int total) {
        super();
        this.flag = flag;
        this.msg = msg;
        this.info = info;
        this.total = total;
    }

    public String getMsg() {
        return msg;
    }

    public Jsonresult(int flag, String msg, T info) {
        super();
        this.flag = flag;
        this.msg = msg;
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public Jsonresult() {
        super();
    }

    public int getTotal() {
        return total;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}

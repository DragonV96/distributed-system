package com.glw.system.common.enums;

import lombok.Getter;

/**
 * @author : glw
 * @date : 2020/3/27
 * @time : 23:38
 * @Description : 错误码
 */
@Getter
public enum ErrorCode {

    SUCCESS(200, "执行成功"),
    FAILED_OPERATE(444, "操作失败"),
    INSERT_ERROR(1001, "插入数据库失败"),
    QUERY_NO_RECORD(2001, "数据库没有此条记录");

    /** 错误码 */
    private int code;

    /** 错误描述 */
    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

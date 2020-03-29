package com.glw.system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : glw
 * @date : 2020/3/27
 * @time : 23:33
 * @Description : 支付实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 支付流水号
     */
    private String serial;
}

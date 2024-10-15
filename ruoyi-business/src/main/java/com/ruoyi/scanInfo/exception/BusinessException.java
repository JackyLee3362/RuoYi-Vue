package com.ruoyi.scanInfo.exception;

import com.ruoyi.common.exception.base.BaseException;

/**
 * @author lijie
 * @date 2024/10/15 下午9:54
 */
public class BusinessException extends BaseException {

    public BusinessException(String module, String defaultMessage) {
        super(module, defaultMessage);
    }
}

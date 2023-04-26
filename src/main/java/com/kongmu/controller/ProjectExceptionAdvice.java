package com.kongmu.controller;

import com.kongmu.exception.BusinessException;
import com.kongmu.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemExeception(SystemException e){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(e.getCode(),null,e.getMessage());
    }


    @ExceptionHandler(BusinessException.class)
    public Result doBusinessExeception(BusinessException e){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doExeception(Exception e){
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙请稍候");
    }

}

package com.kongmu.service.impl;

import com.kongmu.dao.BookDao;
import com.kongmu.domain.Book;
import com.kongmu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;


    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    public boolean update(Book book) {
        return bookDao.update(book)>0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    public Book getById(Integer id) {

//        if(id==22){
//            throw new BusinessException(Code.BUSINESS_ERR,"shabi");
//        }
//        //模拟异常
//
//        try {
//            int i=1/0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时",e);
//        }

        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}

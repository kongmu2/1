package com.kongmu.service;

import com.kongmu.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /*
    *保存
    *
    * */
    public boolean save(Book book);

    /*
     *修改
     *
     * */
    public boolean update(Book book);

    /*
     *删除根据id
     *
     * */
    public boolean delete(Integer id);

    /*
     *根据id获取
     *
     * */
    public Book getById(Integer id);

    /*
     *获取所有
     *
     * */
    public List<Book> getAll();
}

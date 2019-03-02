package com.dao;

import com.pojo.Paper;

import java.util.List;

/**
 * @ Date:2019/3/2
 * Auther:Mercer
 * Auther:麻前程
 */
public interface PaperDao {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tw.com.mt.dashboard.serviceImpl;

import java.util.List;
import tw.com.mt.dashboard.dao.ZKTestDao;
import tw.com.mt.dashboard.entity.Film;
import tw.com.mt.dashboard.entity.Studio;
import tw.com.mt.dashboard.service.ZKTestService;

/**
 *
 * @author ken
 */
public class ZKTestServiceImpl implements ZKTestService{

    private ZKTestDao zkTestDao;

    public List<Studio> getAllStudios(){
        return zkTestDao.loadAllStudios();
    }

    public List<Film> getAllFilms(){
        return zkTestDao.loadAllFilms();
    }

    /**
     * @return the projectDao
     */
    public ZKTestDao getZKTestDao() {
        return zkTestDao;
    }

    /**
     * @param projectDao the projectDao to set
     */
    public void setZKTestDao(ZKTestDao zkTestDao) {
        this.zkTestDao = zkTestDao;
    }
}

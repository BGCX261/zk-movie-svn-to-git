/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tw.com.mt.dashboard.daoImpl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tw.com.mt.dashboard.dao.ZKTestDao;
import tw.com.mt.dashboard.entity.Film;
import tw.com.mt.dashboard.entity.Studio;

/**
 *
 * @author ken
 */
@Repository("ProjectDao")
@Transactional(readOnly = true)
public class ZKTestDaoImpl implements ZKTestDao{

    @PersistenceContext
    private EntityManager em;

    public List<Studio> loadAllStudios(){
        return em.createNamedQuery("Studio.findAll")
        .getResultList();
    }

    public List<Film> loadAllFilms(){
        return em.createNamedQuery("Film.findAllDescending")
        .getResultList();
    }
}

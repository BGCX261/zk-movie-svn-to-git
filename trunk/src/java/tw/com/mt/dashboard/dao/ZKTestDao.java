/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.mt.dashboard.dao;

import java.util.List;
import tw.com.mt.dashboard.entity.Film;
import tw.com.mt.dashboard.entity.Studio;

/**
 *
 * @author ken
 */
public interface ZKTestDao {
    public List<Studio> loadAllStudios();

    public List<Film> loadAllFilms();
}

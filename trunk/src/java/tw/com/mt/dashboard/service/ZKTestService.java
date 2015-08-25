/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tw.com.mt.dashboard.service;

import java.util.List;
import tw.com.mt.dashboard.entity.Film;
import tw.com.mt.dashboard.entity.Studio;

/**
 *
 * @author ken
 */
public interface ZKTestService {

    public List<Studio> getAllStudios();

    public List<Film> getAllFilms();
}

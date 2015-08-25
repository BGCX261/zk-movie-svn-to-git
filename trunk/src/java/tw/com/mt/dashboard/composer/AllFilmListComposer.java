/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tw.com.mt.dashboard.composer;

import java.util.List;
import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listcell;
import tw.com.mt.dashboard.entity.Film;
import tw.com.mt.dashboard.service.ZKTestService;

/**
 *
 * @author ken
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class AllFilmListComposer extends SelectorComposer{
    static Logger logger = Logger.getLogger(AllFilmListComposer.class.getName());

    @WireVariable
    private ZKTestService zkTestServiceBean;
    @Wire
    private Grid filmgrid;
    @Wire
    private Image filmcoverimage;
    @Wire
    private Label filmtitle;
    @Wire
    private Listcell filmstarring;
    @Wire
    private Listcell filmstudioname;
    @Wire
    private Label filmdescription;
    private ListModel<Film> films;
    private final String imageBaseURL
            = "https://59.125.131.152/mymovies/Image.do?file=";

    public void doAfterCompose(Component comp) {

        try {
            super.doAfterCompose(comp); //wire variables and event listners
        } catch(Exception e) {

        }

        films = getFilms();
        filmgrid.setModel(films);
    }

    private ListModel<Film> getFilms() {
        List<Film> films = zkTestServiceBean.getAllFilms();
        logger.debug("how many films ? "+films.size());
        return new ListModelList(films);
    }

    /*
    @Listen("onClick = #filmlistbox")
    public void onClick$filmlistbox() {
        int coverImageWidth = 250;

        int index = filmlistbox.getSelectedIndex();
        if (index < 0) {
            return;
        }

        Film film = (Film) filmlistbox.getModel().getElementAt(index);

        filmcoverimage.setSrc(imageBaseURL + film.getCoverImage());

        filmtitle.setValue(film.getTitle());

        filmstarring.setLabel(film.getStarring());

        filmstudioname.setLabel(film.getStudio().getStudioName());

        filmdescription.setValue(film.getDescription());
    }
    */
}

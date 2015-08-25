/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tw.com.mt.dashboard.entity;

import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author ken
 */
@Entity
@NamedQueries({
@NamedQuery(name = "Film.findAll", query = "SELECT f FROM Film f"),
@NamedQuery(name = "Film.findAllDescending", query = "SELECT f FROM Film f ORDER BY f.filmKey DESC")
})
@Table(name = "film")
public class Film {
@Id
@Column(name = "film_key")
private int filmKey;
@Column(name = "title")
private String title;
@Column
private String starring;
@OneToMany
@JoinTable(name="film_tag_mapping", joinColumns=@JoinColumn(name="film_key"),
        inverseJoinColumns=@JoinColumn(name="tag_key"))
private Collection<Tag> tags;
@Column
private String description;
@Column
private String comment;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "studio_key", insertable = false, updatable = false)
private Studio studio;
@Column(name="front_cover_img")
private String coverImage;
@Column(name="front_cover_img_width")
private int coverImageWidth;

    /**
     * @return the filmKey
     */
    public int getFilmKey() {
        return filmKey;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the starring
     */
    public String getStarring() {
        return starring;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return the studio
     */
    public Studio getStudio() {
        return studio;
    }

    /**
     * @return the coverImage
     */
    public String getCoverImage() {
        return coverImage;
    }

    /**
     * @return the coverImageWidth
     */
    public int getCoverImageWidth() {
        return coverImageWidth;
    }

    /**
     * @return the tags
     */
    public Collection<Tag> getTags() {
        return tags;
    }
    
    public String getTagNames(){
        if (tags == null || tags.isEmpty()) { return ""; }
        
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for(Tag tag : tags) {
            sb.append(tag.getTagName());
            if (counter < (tags.size() - 1)) { sb.append(","); }
            counter++;
        }
        
        return sb.toString();
    }
}

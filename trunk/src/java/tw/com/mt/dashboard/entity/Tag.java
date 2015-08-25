/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tw.com.mt.dashboard.entity;

import javax.persistence.*;

/**
 *
 * @author ken
 */
@Entity
@NamedQuery(name = "Tag.findAll", query = "SELECT t FROM Tag t")
@Table(name = "film_tag")
public class Tag {
@Id
@Column(name = "tag_key")
private int tagKey;
@Column(name = "tag_name")
private String tagName;

    /**
     * @return the tagKey
     */
    public int getTagKey() {
        return tagKey;
    }

    /**
     * @return the tagName
     */
    public String getTagName() {
        return tagName;
    }
}

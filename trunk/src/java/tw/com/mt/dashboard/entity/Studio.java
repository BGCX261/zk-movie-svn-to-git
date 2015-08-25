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
@NamedQuery(name = "Studio.findAll", query = "SELECT s FROM Studio s")
@Table(name = "studio")
public class Studio {
@Id
@Column(name = "studio_key")
private int studioKey;
@Column(name = "studio_name")
private String studioName;

    /**
     * @return the studioKey
     */
    public int getStudioKey() {
        return studioKey;
    }

    /**
     * @return the studioName
     */
    public String getStudioName() {
        return studioName;
    }
}

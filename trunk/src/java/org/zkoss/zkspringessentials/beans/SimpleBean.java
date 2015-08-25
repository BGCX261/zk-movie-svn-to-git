/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zkoss.zkspringessentials.beans;

/**
 *
 * @author ken
 */
public class SimpleBean {
        private String message;

        public SimpleBean() {
        }
        public SimpleBean(String msg) {
                this.message = msg;
        }
        public String getMessage() {
                return message;
        }
        public void setMessage(String message) {
                this.message = message;
        }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zkoss.zkspringessentials.beans;

/**
 *
 * @author ken
 */
public class Person {
        private String _firstName = "";
        private String _lastName = "";

        // getter and setters
        public void setFirstName(String firstName) {
                _firstName = firstName;
        }

        public String getFirstName() {
                return _firstName;
        }

        public void setLastName(String lastName) {
                _lastName = lastName;
        }

        public String getLastName() {
                return _lastName;
        }

        public void setFullName(String f) {
                // do nothing.
        }

        public String getFullName() {
                return _firstName + " " + _lastName;
        }
}

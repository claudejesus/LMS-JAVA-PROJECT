/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claude;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author CLAUDE
 */
@Entity
@Table(name = "REGISTER", catalog = "", schema = "JESUS")
@NamedQueries({
    @NamedQuery(name = "Register_1.findAll", query = "SELECT r FROM Register_1 r"),
    @NamedQuery(name = "Register_1.findById", query = "SELECT r FROM Register_1 r WHERE r.id = :id"),
    @NamedQuery(name = "Register_1.findByName", query = "SELECT r FROM Register_1 r WHERE r.name = :name"),
    @NamedQuery(name = "Register_1.findByAddress", query = "SELECT r FROM Register_1 r WHERE r.address = :address"),
    @NamedQuery(name = "Register_1.findByPhone", query = "SELECT r FROM Register_1 r WHERE r.phone = :phone"),
    @NamedQuery(name = "Register_1.findByPassword", query = "SELECT r FROM Register_1 r WHERE r.password = :password"),
    @NamedQuery(name = "Register_1.findByConfPassword", query = "SELECT r FROM Register_1 r WHERE r.confPassword = :confPassword")})
public class Register_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "CONF_PASSWORD")
    private String confPassword;

    public Register_1() {
    }

    public Register_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        String oldConfPassword = this.confPassword;
        this.confPassword = confPassword;
        changeSupport.firePropertyChange("confPassword", oldConfPassword, confPassword);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Register_1)) {
            return false;
        }
        Register_1 other = (Register_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "claude.Register_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

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
@Table(name = "LAMP", catalog = "", schema = "JESUS")
@NamedQueries({
    @NamedQuery(name = "Lamp.findAll", query = "SELECT l FROM Lamp l"),
    @NamedQuery(name = "Lamp.findById", query = "SELECT l FROM Lamp l WHERE l.id = :id"),
    @NamedQuery(name = "Lamp.findByLampName", query = "SELECT l FROM Lamp l WHERE l.lampName = :lampName"),
    @NamedQuery(name = "Lamp.findByLampLocation", query = "SELECT l FROM Lamp l WHERE l.lampLocation = :lampLocation"),
    @NamedQuery(name = "Lamp.findByLampType", query = "SELECT l FROM Lamp l WHERE l.lampType = :lampType"),
    @NamedQuery(name = "Lamp.findByLampPrice", query = "SELECT l FROM Lamp l WHERE l.lampPrice = :lampPrice"),
    @NamedQuery(name = "Lamp.findByLampNumber", query = "SELECT l FROM Lamp l WHERE l.lampNumber = :lampNumber"),
    @NamedQuery(name = "Lamp.findBySwitchNumber", query = "SELECT l FROM Lamp l WHERE l.switchNumber = :switchNumber"),
    @NamedQuery(name = "Lamp.findByCables", query = "SELECT l FROM Lamp l WHERE l.cables = :cables"),
    @NamedQuery(name = "Lamp.findBySocatNumber", query = "SELECT l FROM Lamp l WHERE l.socatNumber = :socatNumber")})
public class Lamp implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "LAMP_NAME")
    private String lampName;
    @Column(name = "LAMP_LOCATION")
    private String lampLocation;
    @Column(name = "LAMP_TYPE")
    private String lampType;
    @Column(name = "LAMP_PRICE")
    private String lampPrice;
    @Column(name = "LAMP_NUMBER")
    private String lampNumber;
    @Column(name = "SWITCH_NUMBER")
    private String switchNumber;
    @Column(name = "CABLES")
    private String cables;
    @Column(name = "SOCAT_NUMBER")
    private String socatNumber;

    public Lamp() {
    }

    public Lamp(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getLampName() {
        return lampName;
    }

    public void setLampName(String lampName) {
        String oldLampName = this.lampName;
        this.lampName = lampName;
        changeSupport.firePropertyChange("lampName", oldLampName, lampName);
    }

    public String getLampLocation() {
        return lampLocation;
    }

    public void setLampLocation(String lampLocation) {
        String oldLampLocation = this.lampLocation;
        this.lampLocation = lampLocation;
        changeSupport.firePropertyChange("lampLocation", oldLampLocation, lampLocation);
    }

    public String getLampType() {
        return lampType;
    }

    public void setLampType(String lampType) {
        String oldLampType = this.lampType;
        this.lampType = lampType;
        changeSupport.firePropertyChange("lampType", oldLampType, lampType);
    }

    public String getLampPrice() {
        return lampPrice;
    }

    public void setLampPrice(String lampPrice) {
        String oldLampPrice = this.lampPrice;
        this.lampPrice = lampPrice;
        changeSupport.firePropertyChange("lampPrice", oldLampPrice, lampPrice);
    }

    public String getLampNumber() {
        return lampNumber;
    }

    public void setLampNumber(String lampNumber) {
        String oldLampNumber = this.lampNumber;
        this.lampNumber = lampNumber;
        changeSupport.firePropertyChange("lampNumber", oldLampNumber, lampNumber);
    }

    public String getSwitchNumber() {
        return switchNumber;
    }

    public void setSwitchNumber(String switchNumber) {
        String oldSwitchNumber = this.switchNumber;
        this.switchNumber = switchNumber;
        changeSupport.firePropertyChange("switchNumber", oldSwitchNumber, switchNumber);
    }

    public String getCables() {
        return cables;
    }

    public void setCables(String cables) {
        String oldCables = this.cables;
        this.cables = cables;
        changeSupport.firePropertyChange("cables", oldCables, cables);
    }

    public String getSocatNumber() {
        return socatNumber;
    }

    public void setSocatNumber(String socatNumber) {
        String oldSocatNumber = this.socatNumber;
        this.socatNumber = socatNumber;
        changeSupport.firePropertyChange("socatNumber", oldSocatNumber, socatNumber);
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
        if (!(object instanceof Lamp)) {
            return false;
        }
        Lamp other = (Lamp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "claude.Lamp[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

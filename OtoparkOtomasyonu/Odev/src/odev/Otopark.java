/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

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


@Entity
@Table(name = "OTOPARK", catalog = "", schema = "SA")
@NamedQueries({
    @NamedQuery(name = "Otopark.findAll", query = "SELECT o FROM Otopark o"),
    @NamedQuery(name = "Otopark.findById", query = "SELECT o FROM Otopark o WHERE o.id = :id"),
    @NamedQuery(name = "Otopark.findByAdi", query = "SELECT o FROM Otopark o WHERE o.adi = :adi"),
    @NamedQuery(name = "Otopark.findBySoyadi", query = "SELECT o FROM Otopark o WHERE o.soyadi = :soyadi"),
    @NamedQuery(name = "Otopark.findByNumara", query = "SELECT o FROM Otopark o WHERE o.numara = :numara"),
    @NamedQuery(name = "Otopark.findByPlaka", query = "SELECT o FROM Otopark o WHERE o.plaka = :plaka"),
    @NamedQuery(name = "Otopark.findByGirissaati", query = "SELECT o FROM Otopark o WHERE o.girissaati = :girissaati")})
public class Otopark implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Basic(optional = false)
    @Column(name = "SOYADI")
    private String soyadi;
    @Basic(optional = false)
    @Column(name = "NUMARA")
    private int numara;
    @Basic(optional = false)
    @Column(name = "PLAKA")
    private String plaka;
    @Basic(optional = false)
    @Column(name = "GIRISSAATI")
    private int girissaati;

    public Otopark() {
    }

    public Otopark(Integer id) {
        this.id = id;
    }

    public Otopark(Integer id, String adi, String soyadi, int numara, String plaka, int girissaati) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.numara = numara;
        this.plaka = plaka;
        this.girissaati = girissaati;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        String oldAdi = this.adi;
        this.adi = adi;
        changeSupport.firePropertyChange("adi", oldAdi, adi);
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        String oldSoyadi = this.soyadi;
        this.soyadi = soyadi;
        changeSupport.firePropertyChange("soyadi", oldSoyadi, soyadi);
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        int oldNumara = this.numara;
        this.numara = numara;
        changeSupport.firePropertyChange("numara", oldNumara, numara);
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        String oldPlaka = this.plaka;
        this.plaka = plaka;
        changeSupport.firePropertyChange("plaka", oldPlaka, plaka);
    }

    public int getGirissaati() {
        return girissaati;
    }

    public void setGirissaati(int girissaati) {
        int oldGirissaati = this.girissaati;
        this.girissaati = girissaati;
        changeSupport.firePropertyChange("girissaati", oldGirissaati, girissaati);
    }

  
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

  
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Otopark)) {
            return false;
        }
        Otopark other = (Otopark) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    public String toString() {
        return "odev.Otopark[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

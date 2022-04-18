package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela TEIP
* @generated
*/
@Entity
@Table(name = "\"TEIP\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.teip")
public class teip implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "trip", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String trip;

    /**
    * Construtor
    * @generated
    */
    public teip(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public teip setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém trip
    * return trip
    * @generated
    */
    
    public java.lang.String getTrip(){
        return this.trip;
    }

    /**
    * Define trip
    * @param trip trip
    * @generated
    */
    public teip setTrip(java.lang.String trip){
        this.trip = trip;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
teip object = (teip)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
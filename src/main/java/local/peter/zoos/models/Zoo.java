package local.peter.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "zoo")
public class Zoo extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("zoo")
    private Set<Zooanimal> animal = new HashSet<>();

    private String zooname;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("zoo")
    private List<Telephone> telephone = new ArrayList<>();

    /*
    @ManyToMany()
    @JoinTable(name = "zooanimals", joinColumns = @JoinColumn(name = "zooid"), inverseJoinColumns = @JoinColumn(name = "animalid"))
    @JsonIgnoreProperties("zoo")
    private Set<Animals> animals = new HashSet<>();
    */

    public Zoo() {}

    public Zoo(String zooname) {
        //this.animal = animal;
        this.zooname = zooname;
        //this.telephone = telephone;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    /*
    public Set<Zooanimal> getZooanimal() {
        return animal;
    }
    */

    public Set<Zooanimal> getAnimal() {
        return animal;
    }

    /*
    public void setZooanimal(Set<Zooanimal> animal) {
        this.animal = animal;
    }
    */

    public void setAnimal(Set<Zooanimal> animal) {
        this.animal = animal;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public List<Telephone> getTelephone() {
        return telephone;
    }

    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }
}

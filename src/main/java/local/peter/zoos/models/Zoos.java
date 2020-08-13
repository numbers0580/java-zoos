package local.peter.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "zoo")
public class Zoos extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("zoo")
    private Set<Zooanimals> animal = new HashSet<>();

    private String zooname;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("zoo")
    private List<Telephones> telephones = new ArrayList<>();

    /*
    @ManyToMany()
    @JoinTable(name = "zooanimals", joinColumns = @JoinColumn(name = "zooid"), inverseJoinColumns = @JoinColumn(name = "animalid"))
    @JsonIgnoreProperties("zoo")
    private Set<Animals> animals = new HashSet<>();
    */

    public Zoos() {}

    public Zoos(Set<Zooanimals> animal, String zooname, List<Telephones> telephones) {
        this.animal = animal;
        this.zooname = zooname;
        this.telephones = telephones;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public Set<Zooanimals> getZooanimals() {
        return animal;
    }

    public void setZooanimals(Set<Zooanimals> animal) {
        this.animal = animal;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public List<Telephones> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephones> telephones) {
        this.telephones = telephones;
    }
}

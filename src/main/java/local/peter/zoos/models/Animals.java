package local.peter.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animal")
public class Animals extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("animal")
    private Set<Zooanimals> zoo = new HashSet<>();

    private String animaltype;

    public Animals() {}

    public Animals(String animaltype) {
        this.animaltype = animaltype;
    }

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public Set<Zooanimals> getZooanimals() {
        return zoo;
    }

    public void setZooanimals(Set<Zooanimals> zoo) {
        this.zoo = zoo;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }
}

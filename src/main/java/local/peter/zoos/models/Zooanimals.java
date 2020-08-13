package local.peter.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooanimalsId.class)
public class Zooanimals extends Auditable implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties("zoo")
    private Animals animal;

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties("animal")
    private Zoos zoo;

    public Zooanimals() {}

    public Zooanimals(Animals animal, Zoos zoo) {
        this.animal = animal;
        this.zoo = zoo;
    }

    public Animals getAnimals() {
        return animal;
    }

    public void setAnimals(Animals animal) {
        this.animal = animal;
    }

    public Zoos getZoo() {
        return zoo;
    }

    public void setZoo(Zoos zoo) {
        this.zoo = zoo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zooanimals that = (Zooanimals) o;
        //return Objects.equals(animals, that.animals) && Objects.equals(zoo, that.zoo);
        return ((this.animal == null) ? 0 : this.getAnimals().getAnimalid()) == ((that.animal == null) ? 0 : that.getAnimals().getAnimalid()) &&
                ((this.zoo == null) ? 0 : this.getZoo().getZooid()) == ((that.zoo == null) ? 0 : that.getZoo().getZooid());
    }

    @Override
    public int hashCode() {
        return 37;
    }
}

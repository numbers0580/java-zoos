package local.peter.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooanimalId.class)
public class Zooanimal extends Auditable implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "animalid", nullable = false)
    @JsonIgnoreProperties("zoo")
    private Animal animal;

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties("animal")
    private Zoo zoo;

    public Zooanimal() {}

    public Zooanimal(Animal animal, Zoo zoo) {
        this.animal = animal;
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zooanimal that = (Zooanimal) o;
        //return Objects.equals(animals, that.animals) && Objects.equals(zoo, that.zoo);
        return ((this.animal == null) ? 0 : this.getAnimal().getAnimalid()) == ((that.animal == null) ? 0 : that.getAnimal().getAnimalid()) &&
                ((this.zoo == null) ? 0 : this.getZoo().getZooid()) == ((that.zoo == null) ? 0 : that.getZoo().getZooid());
    }

    @Override
    public int hashCode() {
        return 37;
    }
}

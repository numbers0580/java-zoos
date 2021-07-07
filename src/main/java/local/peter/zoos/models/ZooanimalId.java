package local.peter.zoos.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ZooanimalId extends Auditable implements Serializable {
    private long zoo;

    private long animal;

    public ZooanimalId() {}

    public long getZoo() {
        return zoo;
    }

    public void setZoo(long zoo) {
        this.zoo = zoo;
    }

    public long getAnimal() {
        return animal;
    }

    public void setAnimal(long animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooanimalId that = (ZooanimalId) o;
        //((this.animal == null) ? 0 : this.getAnimal().getAnimalid()) == ((that.animal == null) ? 0 : that.getAnimal().getAnimalid())
        return this.zoo == that.zoo &&
                this.animal == that.animal;
    }

    @Override
    public int hashCode() {
        return 37;
    }
}

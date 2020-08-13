package local.peter.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "telephone")
public class Telephones extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    private String phonetype;

    private String phonenumber;

    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties("telephones")
    private Zoos zoo;

    public Telephones() {}

    public Telephones(String phonetype, String phonenumber, Zoos zoo) {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
        this.zoo = zoo;
    }

    public long getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(long phoneid) {
        this.phoneid = phoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Zoos getZoos() {
        return zoo;
    }

    public void setZoos(Zoos zoo) {
        this.zoo = zoo;
    }
}

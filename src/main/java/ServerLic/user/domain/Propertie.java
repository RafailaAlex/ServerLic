package ServerLic.user.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Propertie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String userId;
    private String adress;
    private String description;
    private Type type;
    private Double price;

    @Override
    public String toString() {
        return "Propertie{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", adress='" + adress + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}
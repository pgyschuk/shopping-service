package ly.turing.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "attribute")
public class Attribute {
    @Id
    @Column(name = "attribute_id")
    private Long id;

    @Column(name = "name")
    private String name;
}

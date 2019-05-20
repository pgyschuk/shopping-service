package ly.turing.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "attribute_value")
public class AttributeValue {
    @Id
    @Column(name = "attribute_value_id")
    private Long id;

    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name="attribute_id")
    private Attribute attribute;
}

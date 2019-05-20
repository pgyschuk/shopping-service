package ly.turing.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "discounted_price")
    private Double discountedPrice;

    @Column(name = "image")
    private String image;

    @Column(name = "image_2")
    private String image2;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "display")
    private Boolean display;

    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "product_attribute",
            inverseJoinColumns = @JoinColumn(name = "attribute_value_id", referencedColumnName = "attribute_value_id"),
            joinColumns = @JoinColumn(name = "product_id",
                    referencedColumnName = "product_id"))
    private List<AttributeValue> attributeValues;

}

package ly.turing.repository;

import ly.turing.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    @RestResource(path = "findByName")
    Page<Product> findByNameContainingIgnoreCase(@Param("name") String name, Pageable pageable);
}

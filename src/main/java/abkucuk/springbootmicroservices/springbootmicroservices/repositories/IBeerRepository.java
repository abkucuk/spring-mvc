package abkucuk.springbootmicroservices.springbootmicroservices.repositories;

import abkucuk.springbootmicroservices.springbootmicroservices.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface IBeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}

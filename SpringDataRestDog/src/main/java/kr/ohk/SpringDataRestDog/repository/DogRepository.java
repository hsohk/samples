package kr.ohk.SpringDataRestDog.repository;

import kr.ohk.SpringDataRestDog.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}

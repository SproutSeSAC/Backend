package sprout.sesac.sprout.store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sprout.sesac.sprout.store.domain.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {

}

package sprout.sesac.sprout;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sprout.sesac.sprout.store.domain.entity.Store;
import sprout.sesac.sprout.store.service.StoreService;

import java.time.LocalDateTime;

@SpringBootTest
public class SproutStoreApplicationTest {
    @Autowired private StoreService storeService;

    @Test
    void createStoreTest(){
        Store storeEntity = new Store();

        storeEntity.setName("test");
        storeEntity.setCreatedDate(LocalDateTime.now());

        System.out.println(storeService.createStore(storeEntity));
    }

    @Test
    void readStoreByIdTest(){
        Store storeEntity = storeService.getStoreById(1L);
        System.out.println(storeEntity);
    }

    @Test
    void exceptionReadStoreByIdTest(){
        Store storeEntity = storeService.getStoreById(2L);
        System.out.println(storeEntity);
    }

    @Test
    void updateStoreByIdTest(){
        Store storeData = storeService.getStoreById(1L);
        storeData.setName("test2");
        Store updatedStore = storeService.updateStore(storeData);
        System.out.println(updatedStore);
    }

    @Test
    void removeStoreById(){
        storeService.removeStoreById(1L);
    }
}

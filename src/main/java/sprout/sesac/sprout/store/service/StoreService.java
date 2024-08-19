package sprout.sesac.sprout.store.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprout.sesac.sprout.store.domain.entity.Store;
import sprout.sesac.sprout.store.domain.repository.StoreRepository;
import sprout.sesac.sprout.store.exception.StoreIdNotFoundException;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;

    @Transactional
    public Store createStore(Store store){
        return storeRepository.save(store);
    }

    public Store getStoreById(Long id){
        return storeRepository.findById(id).orElseThrow(() -> new StoreIdNotFoundException("Id에 맞는 Store를 찾지 못했습니다"));
    }

    public Store updateStore(Store store){
        Store storeData = storeRepository.findById(store.getId()).orElseThrow(() -> new StoreIdNotFoundException("Id에 맞는 Store를 찾지 못했습니다"));
        storeData.setName(store.getName());
        storeData.setModifiedDate(LocalDateTime.now());

        return storeRepository.save(storeData);
    }

    public void removeStoreById(Long id){
        storeRepository.deleteById(id);
    }
}

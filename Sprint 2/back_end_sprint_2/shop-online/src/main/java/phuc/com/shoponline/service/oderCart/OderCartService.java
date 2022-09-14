package phuc.com.shoponline.service.oderCart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import phuc.com.shoponline.model.oder.Oder;
import phuc.com.shoponline.repository.oderCart.IOderCartRepository;

@Service
public class OderCartService implements IOderCartService{
    @Autowired
    private IOderCartRepository iOderCartRepository;
    @Override
    public Page<Oder> getAllOderCart(Pageable pageable) {

        return this.iOderCartRepository.getAllOderCart(pageable);
    }
}

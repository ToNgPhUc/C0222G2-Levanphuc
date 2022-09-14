package phuc.com.shoponline.service.oderCart;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import phuc.com.shoponline.model.oder.Oder;

public interface IOderCartService {
    Page<Oder> getAllOderCart(Pageable pageable);
}

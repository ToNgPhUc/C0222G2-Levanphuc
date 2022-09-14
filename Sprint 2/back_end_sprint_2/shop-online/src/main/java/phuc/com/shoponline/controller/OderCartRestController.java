package phuc.com.shoponline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import phuc.com.shoponline.model.oder.Oder;
import phuc.com.shoponline.service.oderCart.IOderCartService;

@RestController
@CrossOrigin
@RequestMapping("/oder-cart")
public class OderCartRestController {
@Autowired
    private IOderCartService iOderCartService;
@GetMapping(value = "oder-cart-list")
    public ResponseEntity<Page<Oder>> getAllOderCart(@PageableDefault(value = 10)Pageable pageable){
    Page<Oder> oderPage = iOderCartService.getAllOderCart(pageable);
    if (oderPage.isEmpty()){
        return new ResponseEntity<>(oderPage, HttpStatus.NO_CONTENT);
    }else {
        return new ResponseEntity<>(oderPage, HttpStatus.OK);
    }
}
}

package phuc.com.shoponline.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import phuc.com.shoponline.model.account.AppUser;
import phuc.com.shoponline.model.oder.Oder;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Integer age;
    private String image;
    @Column()
    private Integer gender;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private AppUser appUser;
    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    private List<Oder>oderList;

}

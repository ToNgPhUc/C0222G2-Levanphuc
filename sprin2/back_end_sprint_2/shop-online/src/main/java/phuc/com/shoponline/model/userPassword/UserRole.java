package phuc.com.shoponline.model.userPassword;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double isDeleted;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private AppRole appRole;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser appUser;
}

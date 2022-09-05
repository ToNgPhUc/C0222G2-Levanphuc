package phuc.com.shoponline.model.userPassword;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String roleName;
    private Boolean isDeleted;
    @OneToMany(mappedBy = "appRole")
    private List<UserRole> userRoleList;
}

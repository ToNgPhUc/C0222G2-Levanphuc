package phuc.com.shoponline.model.bill;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import phuc.com.shoponline.model.oder.Oder;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private Date creationDate;
    @JsonIgnore
    @OneToMany(mappedBy = "bill")
    private List<Oder>oderList;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

}

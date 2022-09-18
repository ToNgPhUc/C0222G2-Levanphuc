package phuc.com.shoponline.dto;


import lombok.Data;
import phuc.com.shoponline.model.oder.Oder;

import java.util.List;

@Data
public class ErrorDto {
    private String message;
    private List<String> messageList;
    private Oder oder;
}

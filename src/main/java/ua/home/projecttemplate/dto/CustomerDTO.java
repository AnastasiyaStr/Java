package ua.home.projecttemplate.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

@Getter
@Setter
public class CustomerDTO {
   private  Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date updated;
    private MultipartFile file;
}

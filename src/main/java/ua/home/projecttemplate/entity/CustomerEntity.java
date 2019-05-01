package ua.home.projecttemplate.entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;


@Data
@Entity
@Table(name="customers")
public class CustomerEntity extends  BaseEntity{
    @Column(name ="first_name", length = 50 )
    private String firstName;

    @Column(name ="last_name", length = 50 )
    private String lastName;

    @Column(length = 100)
    private String email;

    @Column(name="updated_at")
    private Date updated;

}

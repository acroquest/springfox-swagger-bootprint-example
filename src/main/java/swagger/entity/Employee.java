package swagger.entity;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModelProperty;

public class Employee {
    private Integer id;

    private String name;

    private Date birthday;

    @ApiModelProperty(value = "Employee ID.")
    @Range(min = 1, max = 100)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ApiModelProperty(value = "Employee's name.")
    @NotEmpty
    @Size(max = 32)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "Employee's birthday with ISO 8601 format.")
    @NotNull
    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

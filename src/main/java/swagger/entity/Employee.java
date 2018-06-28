package swagger.entity;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

public class Employee {
    @ApiModelProperty(value = "Employee ID.")
    @Min(1)
    @Max(100)
    private Integer id;

    @ApiModelProperty(value = "Employee's name.")
    @NotEmpty
    @Size(max = 32)
    private String name;

    @ApiModelProperty(value = "Employee's birthday with ISO 8601 format.")
    @NotNull
    private Date birthday;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

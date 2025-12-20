package org.example.blogsystem.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Blog {

    @NotEmpty(message = " blog ID can not be empty ! ")
    @Size(min = 3 , max = 10 , message = " blog ID must be between 3 and 10 character ! ")
    private String ID;

    @NotEmpty(message = " blog title can not be empty ! ")
    @Size(min = 2 , message = " blog title must be at least 2 character ! ")
    private String title ;

    @NotEmpty(message = " blog body can not be empty ! ")
    private String body;
}

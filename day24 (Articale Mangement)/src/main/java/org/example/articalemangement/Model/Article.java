package org.example.articalemangement.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Article {

    @NotEmpty(message = " id can not be null ! ")
    private String id;

    @NotEmpty(message = " title can not be null ! ")
    @Size(max = 100, message = "title can not be greater than 100 character ")
    private String title;

    @NotEmpty(message = " Author can not be null ! ")
    @Size(min = 4 , max = 20, message = " author name must be between 4 and 20 character ! ")
    private String author;

    @NotEmpty(message = " content can not be null ! ")
    @Size(min = 200 , message = " content must be at least 200 characters ! ")
    private String content;

    @NotEmpty(message = " category can not be null ! ")
    @Pattern(regexp = "politics|sports|technology",
             message = "category must be one of the following : politics, sports, technology ")
    private String category;

    @NotEmpty(message = " image URL can not be null ! ")
    private String imageUrl;

    @NotEmpty(message = " publish status can not be null ! ")
    @Pattern(regexp = "false", message = " it must be by default false  ! ")
    private String isPublished;

    @JsonFormat(pattern="yyyy-MM-dd")
    @NotNull(message = " publish date can not be null ! ")
    private LocalDate publishDate;





}

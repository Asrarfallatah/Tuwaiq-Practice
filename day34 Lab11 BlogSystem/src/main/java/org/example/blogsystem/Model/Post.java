package org.example.blogsystem.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId ;

    /// //////////////////////////////////////////////////

    @NotNull(message = "error category id can not be empty !")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer categoryId ;

    /// //////////////////////////////////////////////////

    @NotEmpty(message = "error post title can not be empty ! ")
    @Size(min = 3 , message = "error post content must be at least 3 character long ! ")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    private String postTitle ;

    /// //////////////////////////////////////////////////

    @NotEmpty(message = "error post content can not be empty ! ")
    @Size(min = 10 , message = "error post content must be at least 10 character long ! ")

    @Column(columnDefinition = "VARCHAR(500) NOT NULL")
    private String postContent ;

    /// //////////////////////////////////////////////////

    @NotNull(message = "error user id can not be empty !")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer userId ;

    /// //////////////////////////////////////////////////

    @NotNull(message = "error post publish date can not be empty ! ")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")

    @Column(columnDefinition = "DATETIME NOT NULL")
    private LocalDateTime postPublishDate ;





}

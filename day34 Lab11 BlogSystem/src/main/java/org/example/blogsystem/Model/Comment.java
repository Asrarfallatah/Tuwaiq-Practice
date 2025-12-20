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
public class Comment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId ;

    /// //////////////////////////////////////////////////

    @NotNull(message = "error user id can not be empty !")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer userId ;

    /// //////////////////////////////////////////////////

    @NotNull(message = "error post id can not be empty !")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer postId ;

    /// //////////////////////////////////////////////////

    @NotEmpty(message = "error comment content can not be empty !")
    @Size(min = 10 , message = "error comment content must be at least 10 character long ! ")

    @Column(columnDefinition = "VARCHAR(500) NOT NULL")
    private String commentContent ;

    /// //////////////////////////////////////////////////

    @NotNull(message = "error comment publish date can not be empty ! ")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")

    @Column(columnDefinition = "DATETIME NOT NULL")
    private LocalDateTime commentPublishDate ;
}

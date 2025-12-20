package org.example.events.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class EventsSystem {

    @NotNull (message = "ID cannot be null")
    @Size(min = 2 , message = "ID must be more than 2 characters" )
    private String ID;

    @NotNull(message = "Description cannot be null" )
    @Size(min = 15, message = "Description must be more than 15 characters")
    private String description;

    @NotNull(message = "Capacity cannot be null")
    @Min(value = 25, message = "Capacity must be more than 25")
    private int capacity;


    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

}

package ro.itschool.project.models.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Weather {

    private String cityName;
    private String description;
    private LocalDateTime lastUpdated;
}

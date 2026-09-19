package in.api.api_management_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter

@Setter
@AllArgsConstructor
public class HealthResponse {
    private String serviceStatus;

    private String dbStatus;
    private LocalDateTime times;


}
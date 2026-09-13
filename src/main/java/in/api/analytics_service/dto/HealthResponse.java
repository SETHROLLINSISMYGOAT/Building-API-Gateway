package in.api.analytics_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter

@Setter
@AllArgsConstructor
public class HealthResponse {
    private String serviceName;

    private String serviceDescription;
    private String appStatus;


}

package com.thiagobarbosa;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
public class LivenessCheck implements HealthCheck {
    //não criar classe com nome Liveness pois vai conflitar com a anottation

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("ESTOU VIVO");
    }



}

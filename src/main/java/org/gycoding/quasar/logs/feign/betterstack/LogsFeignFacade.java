package org.gycoding.quasar.logs.feign.betterstack;

import org.gycoding.quasar.logs.model.Log;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsFeignFacade {
    void log(String authorization, Log logEntity);
}

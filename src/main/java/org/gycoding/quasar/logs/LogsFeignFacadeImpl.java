package org.gycoding.quasar.logs;

import feign.FeignException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
@AllArgsConstructor
@Slf4j
class LogsFeignFacadeImpl implements LogsFeignFacade {
    private final LogsFeignClient feignClient;

    @Override
    public void log(String authorization, Log logEntity) {
        try {
            feignClient.log(authorization, logEntity);
        } catch (FeignException e) {
            log.error("GY Logs is not currently available.");
        }
    }
}

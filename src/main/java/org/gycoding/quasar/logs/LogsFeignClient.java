package org.gycoding.quasar.logs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "GYLogs", url = "${quasar.logs.url}")
interface LogsFeignClient {
    @PostMapping("")
    void log(
            @RequestHeader("Authorization") String authorization,
            @RequestBody Log log
    );
}

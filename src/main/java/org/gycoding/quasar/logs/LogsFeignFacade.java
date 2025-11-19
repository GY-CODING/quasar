package org.gycoding.quasar.logs;

import org.springframework.stereotype.Repository;

@Repository
interface LogsFeignFacade {
    void log(String authorization, Log logEntity);
}

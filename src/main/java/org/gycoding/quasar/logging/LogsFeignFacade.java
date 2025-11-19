package org.gycoding.quasar.logging;

import org.springframework.stereotype.Repository;

@Repository
interface LogsFeignFacade {
    void log(String authorization, Log logEntity);
}

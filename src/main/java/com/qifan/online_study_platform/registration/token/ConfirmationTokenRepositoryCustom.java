package com.qifan.online_study_platform.registration.token;

import java.time.LocalDateTime;

public interface ConfirmationTokenRepositoryCustom {
    void updateConfirmedAt(String token, LocalDateTime confirmedAt);

}

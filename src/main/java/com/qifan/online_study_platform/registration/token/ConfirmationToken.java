package com.qifan.online_study_platform.registration.token;


import com.qifan.online_study_platform.appuser.AppUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ConfirmationToken {
    private String id;
    private String token;
    private LocalDateTime createTime;
    private LocalDateTime expireTime;
    private LocalDateTime updateTime;

    private AppUser appUser;

    public ConfirmationToken(String token,
                             LocalDateTime createTime,
                             LocalDateTime expireTime,
                             AppUser appUser) {
        this.token = token;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.appUser = appUser;
    }

}

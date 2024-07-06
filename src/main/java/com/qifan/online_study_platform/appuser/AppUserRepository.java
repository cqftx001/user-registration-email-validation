package com.qifan.online_study_platform.appuser;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface AppUserRepository extends MongoRepository<AppUser, String>, AppUserRepositoryCustom {
    Optional<AppUser> findByEmail(String email);
}

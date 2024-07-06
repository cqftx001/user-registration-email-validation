package com.qifan.online_study_platform.registration.token;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ConfirmationTokenRepository extends MongoRepository<ConfirmationToken, String> {
    Optional<ConfirmationToken> findByToken(String token);

    @Update("{ '$set': { 'updateTime': ?1 } }")
    void updateConfirmedAt(String token, LocalDateTime confirmedAt);
}

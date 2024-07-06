package com.qifan.online_study_platform.registration.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class ConfirmationTokenRepositoryImpl implements ConfirmationTokenRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void updateConfirmedAt(String token, LocalDateTime confirmedAt) {
        Query query = new Query();
        query.addCriteria(Criteria.where("token").is(token));
        Update update = new Update();
        update.set("confirmedAt", confirmedAt);
        mongoTemplate.updateFirst(query, update, ConfirmationToken.class);
    }
}
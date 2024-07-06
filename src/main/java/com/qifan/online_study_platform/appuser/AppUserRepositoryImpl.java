package com.qifan.online_study_platform.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserRepositoryImpl implements AppUserRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void enableAppUser(String email) {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is(email));
        Update update = new Update();
        update.set("enabled", true);
        mongoTemplate.updateFirst(query, update, AppUser.class);
    }
}
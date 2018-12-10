package com.renchaigao.zujuba.gameserver.service.impl;

import com.renchaigao.zujuba.dao.mapper.StoreMapper;
import com.renchaigao.zujuba.dao.mapper.UserMapper;
import com.renchaigao.zujuba.domain.response.ResponseEntity;
import com.renchaigao.zujuba.gameserver.service.GameService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    private static Logger logger = Logger.getLogger(GameServiceImpl.class);

    @Autowired
    StoreMapper storeMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public ResponseEntity getStoreInfoByUserId(String userId) {
        return null;
    }
}

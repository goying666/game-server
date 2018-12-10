package com.renchaigao.zujuba.gameserver.service;

import com.renchaigao.zujuba.domain.response.ResponseEntity;

public interface GameService {

    ResponseEntity getStoreInfoByUserId(String userId);

}

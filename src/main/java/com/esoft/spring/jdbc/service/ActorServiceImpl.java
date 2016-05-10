package com.esoft.spring.jdbc.service;

import java.sql.Types;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.esoft.spring.jdbc.bean.Actor;
import com.esoft.spring.jdbc.util.AbstractJdbcTemplate;

@Repository
public class ActorServiceImpl extends AbstractJdbcTemplate implements ActorService {

	public void inserActor(Actor actor) {
		try{
			String sql = "insert into actor (first_name, last_name, last_update) values (?, ?, ?)";
			
			getJdbcTemplate().update(sql, new Object[]{actor.getFirstName(),actor.getLastName(), actor.getLastUpdate()},
					new int[]{Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP});
			
		}catch(DataAccessException e){
			e.printStackTrace();
		}

	}
	
	public Actor getActorById(int actorId){
		return null;
	}

}

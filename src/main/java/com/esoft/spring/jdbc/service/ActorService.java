package com.esoft.spring.jdbc.service;

import com.esoft.spring.jdbc.bean.Actor;

public interface ActorService {
	
	public void inserActor(Actor actor);
	
	public Actor getActorById(int actorId);

}

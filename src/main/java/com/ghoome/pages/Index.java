package com.ghoome.pages;

import javax.inject.Inject;

import org.springframework.data.redis.core.StringRedisTemplate;

public class Index {
	@Inject
	private StringRedisTemplate st;
	
	Object onActionFromIndexForm(){
		st.convertAndSend("z1", "z1 message");
		st.convertAndSend("x1", "x1 message");
		return this;
	}
	
	Object onActionFromAddPerson(){
		st.opsForValue().set("a", "b");
		return this;
	}
	
	Object onActionFromQueryPerson(){
		System.out.println(st.opsForValue().get("a"));
		return this;
	}
	
	Object onActionFromUpdatePerson(){
		st.opsForValue().set("a", "bb");
		return this;
	}
}

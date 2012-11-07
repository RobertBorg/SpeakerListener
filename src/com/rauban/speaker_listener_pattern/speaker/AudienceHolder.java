package com.rauban.speaker_listener_pattern.speaker;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.rauban.speaker_listener_pattern.listener.Listener;

public class AudienceHolder {
	private HashMap<Class<? extends Listener>,LinkedList<Listener>> audience;
	public AudienceHolder(){
		audience = new HashMap<Class<? extends Listener>, LinkedList<Listener>>();
	}
	@SuppressWarnings("unchecked")
	public <T extends Listener> void addToAudience(T listener, Class<? extends Listener> clazz){
		LinkedList<T> listeners = (LinkedList<T>) audience.get(clazz);
		if(listeners == null){
			listeners = new LinkedList<T>();
			audience.put(clazz, (LinkedList<Listener>) listeners);
		}
		listeners.add(listener);
	}
	@SuppressWarnings("unchecked")
	public <T extends Listener> List<T> getAudience(Class<? extends Listener> clazz){
		return (List<T>) audience.get(clazz);
	}
}

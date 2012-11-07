package com.rauban.speaker_listener_pattern.controller;

import com.rauban.speaker_listener_pattern.listener.Listener;
import com.rauban.speaker_listener_pattern.speaker.Speaker;
//these are bogus warnings that shouldn't be there -.- it won't accept ModelBaseImpl<? extends Speaker> 
public class ControllerBaseImpl<T extends Speaker> {
	protected T model;
	public ControllerBaseImpl(T model){
		this.model = model;
	}
	public  <V extends Listener> void addListener(V listener){
		model.addListener(listener);
	}
}

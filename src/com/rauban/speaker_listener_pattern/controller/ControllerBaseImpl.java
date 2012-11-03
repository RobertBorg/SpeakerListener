package com.rauban.speaker_listener_pattern.controller;

import com.rauban.speaker_listener_pattern.model.ModelBaseImpl;
import com.rauban.speaker_listener_pattern.speaker.Speaker;
//these are bogous warnings that shouldn't be there -.- it won't accept ModelBaseImpl<? extends Speaker> 
public class ControllerBaseImpl<T extends ModelBaseImpl> {
	protected T model;
	public ControllerBaseImpl(T model){
		this.model = model;
	}
	public  void addListener(Speaker listener){
		model.addListener(listener);
	}
}

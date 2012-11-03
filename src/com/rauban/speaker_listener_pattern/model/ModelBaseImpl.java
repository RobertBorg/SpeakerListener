package com.rauban.speaker_listener_pattern.model;

import java.util.LinkedList;

import com.rauban.speaker_listener_pattern.speaker.Speaker;


public class ModelBaseImpl<T extends Speaker> {
	protected LinkedList<T> listeners;
	public ModelBaseImpl(){
		listeners = new LinkedList<T>();
	}
	public void addListener(T listener){
		listeners.add(listener);
	}
}

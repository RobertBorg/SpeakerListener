package com.rauban.speaker_listener_pattern.speaker;

import com.rauban.speaker_listener_pattern.listener.Listener;

/**
 * Base interface for Speakers(models that cna have attached listeners)
 * @author RauBan
 *
 */
public interface Speaker<V extends Listener> {
	public void addListener(V listener);
}

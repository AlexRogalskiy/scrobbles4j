/*
 * Copyright 2021 michael-simons.eu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package scrobbles4j.client.sinks.api;

/**
 * A sink consuming playing tracks.
 *
 * @author Michael J. Simons
 */
public interface Sink {

	void onTrackPlaying(PlayingTrackEvent event);

	/**
	 * {@return the order in which this sink should be called} A higher value means higher priority.
	 */
	default int getOrder() {
		return 0;
	}
}

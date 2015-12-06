package net.dmcloud.engine.server;

import net.dmcloud.engine.data.Observation;

import org.springframework.batch.item.ItemProcessor;

public class ObservationItemProcessor implements
		ItemProcessor<Observation, Observation> {

	@Override
	public Observation process(Observation item) throws Exception {
		return item;
	}

}

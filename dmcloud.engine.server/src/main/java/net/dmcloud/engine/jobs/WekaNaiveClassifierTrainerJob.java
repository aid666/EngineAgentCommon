package net.dmcloud.engine.jobs;

import java.util.ArrayList;

import net.dmcloud.engine.data.Attribute;
import net.dmcloud.engine.data.Data;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

import org.springframework.context.annotation.Configuration;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;

@Configuration
@EnableBatchProcessing
public class WekaNaiveClassifierTrainerJob extends WekaNaiveClassifierJob {

	public WekaNaiveClassifierTrainerJob() {
	}

	public void setModel(Attribute[] model) {
		try {
			setOptions(converterToWekaOptions(model));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String[] converterToWekaOptions(Attribute[] model) {
		ArrayList<String> options = new ArrayList<String>();
		if(model != null){
			for (Attribute attribute : model) {
				options.add("-" + attribute.getKey());
			}
		}
		return options.toArray(new String[0]);
	}

	@Override
	public Data process(final Data input) throws Exception {
		buildClassifier(converterToInstance(input));
		return populateModel();
	}

	public static Data populateModel() {
		Data modelData = new Data();
		
		
		
		return modelData;
	}


}

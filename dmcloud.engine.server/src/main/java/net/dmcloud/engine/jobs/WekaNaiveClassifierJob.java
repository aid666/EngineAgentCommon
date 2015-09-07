package net.dmcloud.engine.jobs;

import java.util.ArrayList;

import net.dmcloud.engine.data.Attribute;
import net.dmcloud.engine.data.Data;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

import org.springframework.batch.item.ItemProcessor;

public class WekaNaiveClassifierJob extends NaiveBayes implements ItemProcessor<Data, Data> {

	private static final long serialVersionUID = 4536597731944078869L;

	public WekaNaiveClassifierJob() {
	}

	public void setModel(Attribute[] model) {
		try {
			setOptions(converterToOptions(model));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String[] converterToOptions(Attribute[] model) {
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

	public static Instances converterToInstance(Data input) {
		// TODO Auto-generated method stub
		return null;
	}

}

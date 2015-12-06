package net.dmcloud.engine.jobs;

import java.util.ArrayList;

import net.dmcloud.engine.data.Attribute;
import net.dmcloud.engine.data.Data;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

import org.springframework.batch.item.ItemProcessor;

public class AbstractWekaNaiveClassifierJob extends WekaNaiveClassifierJob {


	public AbstractWekaNaiveClassifierJob() {
	}

	public void setModel(Attribute[] model) {
		try {
			setOptions(converterToWekaOptions(model));
		} catch (Exception e) {
			// TODO Auto-generated catch block
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

	public static Data populateModel() {
		Data modelData = new Data();
		
		
		
		return modelData;
	}

	public static Instances converterToInstance(Data input) {
		// TODO Auto-generated method stub
		return null;
	}

}

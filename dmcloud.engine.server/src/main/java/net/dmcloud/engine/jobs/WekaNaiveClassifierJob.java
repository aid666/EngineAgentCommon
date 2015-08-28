package net.dmcloud.engine.jobs;

import net.dmcloud.engine.data.Attribute;
import weka.classifiers.bayes.NaiveBayes;

public class WekaNaiveClassifierJob 
{
	private NaiveBayes _classifier;
	
	public WekaNaiveClassifierJob()
	{
		_classifier = new NaiveBayes();
	}
	
	public void setModel(Attribute[] model)
	{
		
	}
}

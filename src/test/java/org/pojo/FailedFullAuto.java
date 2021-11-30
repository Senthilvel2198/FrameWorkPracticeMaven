package org.pojo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedFullAuto implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		IRetryAnalyzer s = annotation.getRetryAnalyzer();
		
		if (s==null) {
			
			annotation.setRetryAnalyzer(FailedAuto.class);
			
		}
	}

}

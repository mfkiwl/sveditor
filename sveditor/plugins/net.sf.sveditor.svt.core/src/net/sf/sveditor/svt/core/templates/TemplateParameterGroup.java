package net.sf.sveditor.svt.core.templates;

import java.util.ArrayList;
import java.util.List;

public class TemplateParameterGroup extends TemplateParameterBase {
	private List<TemplateParameterBase>		fParameters;
	private boolean							fHidden;
	
	public TemplateParameterGroup(String name) {
		super(TemplateParameterType.ParameterType_Group);
		fParameters = new ArrayList<TemplateParameterBase>();
		setName(name);
	}

	public TemplateParameterGroup(TemplateParameterGroup other) {
		super(other);
	
		fParameters = new ArrayList<TemplateParameterBase>();
		
		for (TemplateParameterBase p : other.fParameters) {
			fParameters.add(p.clone());
		}
		
		fHidden = other.fHidden;
	}
	
	public boolean isHidden() {
		return fHidden;
	}
	
	public void setIsHidden(boolean hidden) {
		fHidden = hidden;
	}
	
	public List<TemplateParameterBase> getParameters() {
		return fParameters;
	}
	
	public void addParameter(TemplateParameterBase p) {
		fParameters.add(p);
	}
	
	public TemplateParameterGroup clone() {
		return new TemplateParameterGroup(this);
	}
}

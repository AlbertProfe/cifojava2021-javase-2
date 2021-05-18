package model;

import java.util.HashMap;

public class Language {

	public String name;
	public String tag;
	public HashMap<String, String> prompts;

	public Language(String name, String tag) {
		this.name = name;
		this.tag = tag;
		this.prompts = new HashMap<String, String>();
	}

	public HashMap<String, String> getPrompts() {
		return prompts;
	}

	public void setPrompts(HashMap<String, String> prompts) {
		this.prompts = prompts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}

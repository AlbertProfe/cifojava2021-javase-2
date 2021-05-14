package model;

public class Language {
	
	public String name;
	public String tag;
	public String create;
	public String login;
	public String language;
	public String quit;
	
	
	
	public Language(String name, String tag, String create, String login, String language, String quit) {
		super();
		this.name = name;
		this.tag = tag;
		this.create = create;
		this.login = login;
		this.language = language;
		this.quit = quit;
	}

	public Language(String name, String tag) {
		super();
		this.name = name;
		this.tag = tag;
	}
	
	public String getCreate() {
		return create;
	}
	public void setCreate(String create) {
		this.create = create;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getQuit() {
		return quit;
	}
	public void setQuit(String quit) {
		this.quit = quit;
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
